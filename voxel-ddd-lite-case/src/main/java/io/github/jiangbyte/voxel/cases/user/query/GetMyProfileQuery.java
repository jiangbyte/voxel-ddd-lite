package io.github.jiangbyte.voxel.cases.user.query;

import io.github.jiangbyte.voxel.cases.user.core.Query;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 查询当前登录用户账号信息。
 */
@Getter
@AllArgsConstructor
public class GetMyProfileQuery implements Query {

    private final Long userId;
}
