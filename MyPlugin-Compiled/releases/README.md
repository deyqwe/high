# JAR 文件位置

在这里放置编译好的 MyPlugin-1.0.0.jar 文件。

## 如何获取JAR文件

1. **从源码编译**（推荐）：
   ```bash
   cd ../
   ./build.sh
   ```
   编译后的JAR会自动复制到这个目录。

2. **从其他来源获取**：
   - 从其他开发者处获取已编译的JAR文件
   - 从CI/CD构建中获取

## 上传到GitHub

1. 编译得到 `MyPlugin-1.0.0.jar`
2. 将其复制到这个目录
3. 使用 GitHub Releases 功能发布新版本
4. 上传JAR文件作为Release资产
