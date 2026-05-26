# GitHub 推送指南

仓库已经初始化并完成了首次提交！现在按照以下步骤推送到 GitHub。

## 步骤 1: 在 GitHub 创建仓库

1. 访问 https://github.com/new
2. Repository name: `myplugin`
3. 选择 Public 或 Private
4. **不要**勾选 "Initialize this repository with a README"
5. 点击 "Create repository"

## 步骤 2: 关联远程仓库

在终端中运行以下命令，替换 `YOUR_USERNAME` 为你的 GitHub 用户名：

```bash
cd /workspace/MyPlugin-Compiled
git remote add origin https://github.com/YOUR_USERNAME/myplugin.git
```

## 步骤 3: 推送到 GitHub

使用 Personal Access Token 推送（推荐）：

```bash
git push -u origin main
```

当提示输入密码时，使用你的 Personal Access Token（不是 GitHub 密码）。

### 如果需要在 URL 中包含凭据（可选）：

```bash
git remote set-url origin https://YOUR_USERNAME:YOUR_TOKEN@github.com/YOUR_USERNAME/myplugin.git
git push -u origin main
```

## 步骤 4: 创建 Release 并上传 JAR

### 4.1 编译获取 JAR

在有网络的本地机器上运行：
```bash
git clone https://github.com/YOUR_USERNAME/myplugin.git
cd myplugin
chmod +x build.sh
./build.sh
```

### 4.2 创建 Release

1. 在 GitHub 仓库页面点击 "Releases"
2. 点击 "Draft a new release"
3. 填写信息：
   - Tag version: `v1.0.0`
   - Release title: `v1.0.0`
   - 描述: `Minecraft 1.20.1 Plugin - Initial release`
4. 在 "Attach binaries" 区域上传 `releases/MyPlugin-1.0.0.jar`
5. 点击 "Publish release"

## 完成！

现在用户可以访问 https://github.com/YOUR_USERNAME/myplugin/releases 下载 JAR 文件了。

## 后续更新

当你需要更新插件时：
```bash
# 1. 做代码修改
# 2. 提交
git add .
git commit -m "Update description"

# 3. 推送
git push

# 4. 创建新的 Release
```
