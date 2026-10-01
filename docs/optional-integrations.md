# 可选集成（注释启用，无运行时开关）

需要 S3 / Milvus / Spring AI 时：

1. 在父 `pom.xml` 的 `dependencyManagement` 中取消对应依赖注释。
2. 在 `voxel-ddd-lite-infrastructure/pom.xml` 增加具体依赖。
3. 从历史 `voxel-ddd-ai-lite` 或自行实现拷回 `infrastructure/config/s3`、`config/milvus` 等。
4. 在 `AutoConfiguration.imports` 与 `application.yml` 中取消对应注释行。

旁路 MCP 教学工程见仓库根目录 `ai-mcp-demo` / `ai-mcp-demo-test`（独立 Maven，非本父工程 module）。
