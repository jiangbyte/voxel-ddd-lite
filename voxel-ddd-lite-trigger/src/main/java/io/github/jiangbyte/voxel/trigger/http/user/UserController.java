package io.github.jiangbyte.voxel.trigger.http.user;
import io.github.jiangbyte.voxel.cases.user.IAuthCase;

import io.github.jiangbyte.voxel.api.user.IUserService;
import io.github.jiangbyte.voxel.api.user.response.PublicUserResponse;
import io.github.jiangbyte.voxel.api.response.R;
import io.github.jiangbyte.voxel.cases.user.query.GetPublicUserQuery;
import io.github.jiangbyte.voxel.trigger.http.user.assembler.UserAssembler;
import io.github.jiangbyte.voxel.types.enums.ResponseCode;
import io.github.jiangbyte.voxel.types.exception.BizException;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户公开信息接口。
 */
@Tag(name = "用户公开")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController implements IUserService {

    private final IAuthCase authCase;
    private final UserAssembler userAssembler;

    /**
     * 按 userId 获取用户公开信息（无需登录；query 传参）。
     */
    @Override
    @GetMapping("/public")
    public R<PublicUserResponse> getPublic(@RequestParam Long userId) {
        if (userId == null) {
            throw new BizException(ResponseCode.VALIDATION_ERROR, "userId 不能为空");
        }
        return R.ok(userAssembler.toPublicResponse(
                authCase.getPublicProfile(new GetPublicUserQuery(userId))));
    }
}
