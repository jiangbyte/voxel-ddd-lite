package io.github.jiangbyte.voxel.infrastructure.config.datasource;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;

/**
 * Druid 数据源约定自动配置。
 * <p>
 * 当 classpath 存在 DruidDataSource（通常随 druid-spring-boot-3-starter 引入）
 * classpath 存在 Druid 时作为扩展点生效。
 * 连接池由 Druid 自动配置创建，本类作为启用标记与扩展点。
 */
@AutoConfiguration
@ConditionalOnClass(name = "com.alibaba.druid.pool.DruidDataSource")
public class DatasourceAutoConfiguration {
}
