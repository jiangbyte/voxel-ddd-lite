package io.github.jiangbyte.voxel.api.user;

import io.github.jiangbyte.voxel.api.user.response.PublicUserResponse;
import io.github.jiangbyte.voxel.api.response.R;

/**
 * 用户公开信息对外契约。
 */
public interface IUserService {

    /**
     * 按 userId 获取公开资料。
     */
    R<PublicUserResponse> getPublic(Long userId);
}
