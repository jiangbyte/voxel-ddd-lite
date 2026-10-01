package io.github.jiangbyte.voxel.cases.user.dto;

import io.github.jiangbyte.voxel.domain.user.model.valobj.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 他人可见的用户公开信息。
 */
@Getter
@AllArgsConstructor
public class PublicUserView {

    private final Long userId;
    private final String username;
    private final UserType userType;
}
