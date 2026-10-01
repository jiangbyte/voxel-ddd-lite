package io.github.jiangbyte.voxel.cases.user.command;

import io.github.jiangbyte.voxel.cases.user.core.Command;
import io.github.jiangbyte.voxel.domain.user.model.valobj.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 后台创建用户。
 */
@Getter
@AllArgsConstructor
public class CreateUserCommand implements Command {

    private final String username;
    private final String password;
    private final UserType userType;
}
