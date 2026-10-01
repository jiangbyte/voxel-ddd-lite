package io.github.jiangbyte.voxel.cases.user.query;

import io.github.jiangbyte.voxel.cases.user.core.Query;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 查询用户公开信息。
 */
@Getter
@AllArgsConstructor
public class GetPublicUserQuery implements Query {

    private final Long userId;
}
