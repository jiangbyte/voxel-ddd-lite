# Voxel DDD Lite

![JDK](https://img.shields.io/badge/JDK-21-007396?logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1-6DB33F?logo=springboot&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-Supported-4479A1?logo=mysql&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-Supported-DC382D?logo=redis&logoColor=white)
![Vue](https://img.shields.io/badge/Vue-3-4FC08D?logo=vuedotjs&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-green)

**Voxel DDD Lite** 是按 DDD skill 七层规范的充实模板：账户竖切（PORTAL / ADMIN）+ Vue 前后台。S3 / Milvus / Spring AI 以**注释块**接入，**无** `voxel.ddd.*.enabled` 运行时开关。学习用，不作业务拷贝范本。

## 目录

- [功能特性](#功能特性)
- [工程结构](#工程结构)
- [快速开始](#快速开始)
- [默认账号](#默认账号)
- [License](#license)

## 功能特性

| 能力 | 说明 |
| --- | --- |
| 七层 | types / api / domain / infrastructure / case / trigger / app |
| 账户 | 注册登录、JWT、PORTAL/ADMIN |
| 前端 | `web/` portal + admin |
| 可选 | S3 / Milvus / Spring AI / MCP demo（注释启用，见 [`docs/optional-integrations.md`](docs/optional-integrations.md)） |

## 工程结构

按 **领域 > 模块** 分包（示例：`user`）：

```text
voxel-ddd-lite/
├── …-api/…/api/user/                 # 领域 API
├── …-domain/…/domain/user/           # 领域模型 / port / repository
├── …-case/…/cases/user/              # 用例 + impl / command / query
├── …-infrastructure/…/dao/user/      # 按领域 DAO/PO
│                 …/adapter/…/user/   # 按领域适配器
├── …-trigger/…/trigger/http/user/    # 按领域 HTTP
├── ai-mcp-demo/                      # 独立 MCP 演示
└── web/
```

## 快速开始

```bash
# 执行 docs/sql/schema-user.sql 后
mvn -pl voxel-ddd-lite-app -am package -DskipTests
java -jar voxel-ddd-lite-app/target/voxel-ddd-lite-app-1.0-SNAPSHOT.jar
```

Knife4j：http://127.0.0.1:8080/doc.html

```bash
cd web && pnpm install && pnpm dev:portal   # 5173
pnpm dev:admin                             # 5174
```

## 默认账号

| 端 | 账号 | 密码 |
| --- | --- | --- |
| Admin | `admin` | `admin123` |

## License

本项目基于 MIT License 开源。
