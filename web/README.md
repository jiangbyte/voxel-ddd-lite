# Voxel DDD Lite · Web

![Vue](https://img.shields.io/badge/Vue-3-4FC08D?logo=vuedotjs&logoColor=white)
![Vite](https://img.shields.io/badge/Vite-Supported-646CFF?logo=vite&logoColor=white)
![TypeScript](https://img.shields.io/badge/TypeScript-5-3178C6?logo=typescript&logoColor=white)
![Naive UI](https://img.shields.io/badge/UI-Naive%20UI-18A058)

**Voxel DDD Lite** 配套前端：Vue 3 + Vite + TypeScript + Naive UI 的 pnpm monorepo。主题主色 `#1677FF`。

## 目录

- [功能特性](#功能特性)
- [技术栈](#技术栈)
- [工程结构](#工程结构)
- [快速开始](#快速开始)
- [默认账号](#默认账号)

## 功能特性

| 包 | 说明 | 开发端口 |
| --- | --- | --- |
| `@voxel/portal` | 用户前台（PORTAL）：注册 / 登录、我的账号、公开用户页 | 5173 |
| `@voxel/admin` | 后台（ADMIN）：仪表盘、用户管理 | 5174 |
| `@voxel/shared` | 共享 http / auth / 主题 | — |

硬规则：`portal` 与 `admin` 互不引用对方源码，复用只走 `@voxel/shared`。登录需带 `clientType`。

## 技术栈

Vue 3 · Vite · TypeScript · Naive UI · Pinia · Vue Router · pnpm workspace

## 工程结构

```text
web/
├── apps/portal/
├── apps/admin/
└── packages/shared/
```

（以仓库内实际 pnpm workspace 布局为准。）

## 快速开始

后端先就绪（`docs/sql/schema-user.sql` + `voxel-ddd-lite-app`，默认 8080）：

```bash
cd web
pnpm install
pnpm dev:portal   # http://127.0.0.1:5173
pnpm dev:admin    # http://127.0.0.1:5174
```

Vite 将 `/api/**` 代理到 `http://127.0.0.1:8080`。

```bash
pnpm typecheck
pnpm build:portal
pnpm build:admin
```

## 默认账号

| 端 | 账号 | 密码 |
| --- | --- | --- |
| Admin | `admin` | `admin123` |
