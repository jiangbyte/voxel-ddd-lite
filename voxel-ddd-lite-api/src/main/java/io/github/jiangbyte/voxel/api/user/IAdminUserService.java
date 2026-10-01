package io.github.jiangbyte.voxel.api.user;

import io.github.jiangbyte.voxel.api.user.dto.ChangeEnabledRequest;
import io.github.jiangbyte.voxel.api.user.dto.CreateUserRequest;
import io.github.jiangbyte.voxel.api.user.response.CreateUserResponse;
import io.github.jiangbyte.voxel.api.response.PageResponse;
import io.github.jiangbyte.voxel.api.response.R;
import io.github.jiangbyte.voxel.api.user.response.UserProfileResponse;

/**
 * 后台用户管理对外契约。
 */
public interface IAdminUserService {

    /**
     * 分页查询用户。
     */
    R<PageResponse<UserProfileResponse>> list(int pageNo, int pageSize, String username, String userType);

    /**
     * 创建用户。
     */
    R<CreateUserResponse> create(CreateUserRequest request);

    /**
     * 变更启用状态。
     */
    R<UserProfileResponse> changeEnabled(ChangeEnabledRequest request);
}
