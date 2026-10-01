package io.github.jiangbyte.voxel.cases.user;

import io.github.jiangbyte.voxel.cases.user.command.ChangeUserEnabledCommand;
import io.github.jiangbyte.voxel.cases.user.command.CreateUserCommand;
import io.github.jiangbyte.voxel.cases.user.dto.AuthResultView;
import io.github.jiangbyte.voxel.cases.user.dto.PageResult;
import io.github.jiangbyte.voxel.cases.user.dto.UserProfileView;
import io.github.jiangbyte.voxel.cases.user.query.ListUsersQuery;

/**
 * 后台用户管理用例。
 */
public interface IAdminUserCase {

    PageResult<UserProfileView> listUsers(ListUsersQuery query);

    AuthResultView createUser(CreateUserCommand command);

    UserProfileView changeEnabled(ChangeUserEnabledCommand command);
}
