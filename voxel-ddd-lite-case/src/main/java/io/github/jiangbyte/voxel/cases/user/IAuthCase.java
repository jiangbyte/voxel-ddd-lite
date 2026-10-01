package io.github.jiangbyte.voxel.cases.user;

import io.github.jiangbyte.voxel.cases.user.command.LoginCommand;
import io.github.jiangbyte.voxel.cases.user.command.RegisterUserCommand;
import io.github.jiangbyte.voxel.cases.user.dto.AuthResultView;
import io.github.jiangbyte.voxel.cases.user.dto.PublicUserView;
import io.github.jiangbyte.voxel.cases.user.dto.UserProfileView;
import io.github.jiangbyte.voxel.cases.user.query.GetMyProfileQuery;
import io.github.jiangbyte.voxel.cases.user.query.GetPublicUserQuery;

import java.time.Duration;

/**
 * 认证与用户查询用例。
 */
public interface IAuthCase {

    AuthResultView register(RegisterUserCommand command);

    AuthResultView login(LoginCommand command);

    void logout(String jti, Duration remainingTtl);

    UserProfileView getMyProfile(GetMyProfileQuery query);

    PublicUserView getPublicProfile(GetPublicUserQuery query);
}
