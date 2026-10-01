package io.github.jiangbyte.voxel.infrastructure.dao.user;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.github.jiangbyte.voxel.infrastructure.dao.user.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表 DAO。
 */
@Mapper
public interface IUserDao extends BaseMapper<UserPo> {
}
