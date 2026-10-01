package io.github.jiangbyte.voxel.cases.user.query;

import io.github.jiangbyte.voxel.cases.user.core.Query;
import io.github.jiangbyte.voxel.domain.user.model.valobj.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 后台分页查询用户。
 */
@Getter
@AllArgsConstructor
public class ListUsersQuery implements Query {

    private final int pageNo;
    private final int pageSize;
    private final String username;
    private final UserType userType;
}
