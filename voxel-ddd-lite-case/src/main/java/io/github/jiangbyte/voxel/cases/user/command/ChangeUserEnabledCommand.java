package io.github.jiangbyte.voxel.cases.user.command;

import io.github.jiangbyte.voxel.cases.user.core.Command;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 变更用户启用状态。
 */
@Getter
@AllArgsConstructor
public class ChangeUserEnabledCommand implements Command {

    private final Long userId;
    private final boolean enabled;
}
