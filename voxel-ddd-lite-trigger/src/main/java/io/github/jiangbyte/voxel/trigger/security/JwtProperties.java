package io.github.jiangbyte.voxel.trigger.security;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * JWT 配置属性。
 */
@Data
@ConfigurationProperties(prefix = "voxel.ddd.jwt")
public class JwtProperties {

    /** HMAC 签名密钥，生产环境务必更换为足够长的随机串 */
    private String secret = "voxel-ddd-lite-jwt-secret-change-me-32bytes!!";

    /** Token 过期时间（秒），默认 2 小时 */
    private long expireSeconds = 7200;

    /** 请求头名称 */
    private String header = "Authorization";

    /** Token 前缀，例如 Bearer  */
    private String tokenPrefix = "Bearer ";

    /** 签发者 */
    private String issuer = "voxel-ddd-lite";
}
