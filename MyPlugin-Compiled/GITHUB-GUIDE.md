# GitHub 上传指南

## 当前状态

由于当前环境无法访问Maven仓库，JAR文件需要你手动编译。

## 步骤 1: 克隆仓库到本地

```bash
git clone https://github.com/YOUR_USERNAME/MyPlugin.git
cd MyPlugin
```

## 步骤 2: 编译生成 JAR 文件

在有网络的机器上运行：

```bash
chmod +x build.sh
./build.sh
```

这会生成 `releases/MyPlugin-1.0.0.jar`

## 步骤 3: 推送到 GitHub

```bash
git add .
git commit -m "Initial commit with source code"
git push origin main
```

## 步骤 4: 创建 Release

1. 在 GitHub 仓库页面点击 "Releases"
2. 点击 "Draft a new release"
3. 填写版本信息
4. 上传 `MyPlugin-1.0.0.jar` 文件
5. 发布 Release

## 后续编译

以后更新代码后：
```bash
./build.sh
git add .
git commit -m "Update"
git push
```

然后创建新的 Release 并上传新的JAR文件。

## 目录说明

- `/src` - 源代码
- `/releases` - 编译后的JAR文件目录
- `pom.xml` - Maven配置
- `build.sh` - 自动化构建脚本
