# MyPlugin - Minecraft 1.20.1 插件

## 📥 下载 JAR 文件

**前往 [Releases](https://github.com/[你的用户名]/myplugin/releases) 页面下载最新版本的JAR文件**

## 🔧 从源码编译（可选）

如果需要从源码编译：

```bash
git clone https://github.com/[你的用户名]/myplugin.git
cd myplugin
chmod +x build.sh
./build.sh
```

编译后的JAR文件会自动复制到 `releases/MyPlugin-1.0.0.jar`

## 🚀 安装到服务器

1. 下载 `MyPlugin-1.0.0.jar`
2. 将其放入服务器的 `plugins` 文件夹
3. 重启服务器

## 🎮 功能

### 命令
- `/heal` - 恢复自己的生命值、饥饿度，清除燃烧状态
- `/heal <玩家>` - 治疗其他玩家（需要权限）
- `/god` - 切换上帝模式（无敌状态）

### 权限
| 权限节点 | 描述 | 默认 |
|---------|------|------|
| `myplugin.heal` | 使用治疗命令 | OP |
| `myplugin.heal.others` | 为他人治疗 | OP |
| `myplugin.god` | 使用上帝模式 | OP |

## 📋 系统要求

- **Java**: 17 或更高版本
- **Minecraft**: 1.20.1
- **服务器**: Paper、Spigot 或 Bukkit

## 🔨 开发

### 项目结构
```
MyPlugin/
├── pom.xml                  # Maven配置
├── build.sh                 # 构建脚本
├── src/main/
│   ├── java/
│   │   └── com/example/myplugin/
│   │       ├── MyPlugin.java
│   │       ├── commands/
│   │       └── listeners/
│   └── resources/
│       ├── plugin.yml
│       └── config.yml
└── releases/                 # 编译后的JAR文件目录
```

### 编译说明
```bash
# 确保已安装Maven 3.6+
mvn -version

# 编译项目
mvn clean package
```

## 📝 许可证

本插件可以自由使用、修改和分发。
