# MyPlugin - Minecraft 1.20.1 插件

## 项目简介
这是一个为Minecraft 1.20.1版本设计的Java插件，包含基本的治疗和上帝模式功能。

## 功能特性
- **治疗命令 (/heal)** - 恢复玩家生命值、饥饿度和清除燃烧状态
- **上帝模式 (/god)** - 切换无敌模式，防止受到任何伤害
- **事件监听** - 实时监听玩家受伤事件，支持上帝模式的伤害免疫
- **配置文件** - 灵活的配置管理，支持自定义消息和功能开关

## 项目结构
```
MyPlugin/
├── pom.xml                           # Maven构建配置文件
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── myplugin/
│       │               ├── MyPlugin.java              # 主插件类
│       │               ├── commands/                 # 命令处理
│       │               │   ├── HealCommand.java     # 治疗命令
│       │               │   └── GodCommand.java      # 上帝模式命令
│       │               └── listeners/                # 事件监听
│       │                   └── PlayerListener.java   # 玩家事件监听
│       └── resources/
│           ├── plugin.yml              # 插件配置文件
│           └── config.yml              # 用户配置文件
```

## 环境要求
- **Java**: 17 或更高版本
- **Minecraft服务器**: 1.20.1
- **服务器类型**: Paper、Spigot或Bukkit

## 构建步骤

### 1. 安装Maven
确保你的系统已经安装了Maven 3.6或更高版本。

### 2. 编译插件
在项目根目录下运行以下命令：

```bash
mvn clean package
```

构建完成后，编译好的JAR文件会生成在 `target/MyPlugin-1.0.0.jar`

### 3. 安装插件
1. 将编译好的 `MyPlugin-1.0.0.jar` 文件复制到服务器的 `plugins` 文件夹
2. 重启服务器
3. 插件会自动生成配置文件

## 使用方法

### 命令
| 命令 | 描述 | 权限 | 用法 |
|------|------|------|------|
| `/heal` | 恢复自己的生命值 | `myplugin.heal` | `/heal` 或 `/heal <玩家>` |
| `/god` | 切换上帝模式 | `myplugin.god` | `/god` |

### 权限
| 权限节点 | 描述 | 默认权限 |
|---------|------|---------|
| `myplugin.heal` | 使用治疗命令 | OP |
| `myplugin.heal.others` | 为他人治疗 | OP |
| `myplugin.god` | 使用上帝模式 | OP |

### 配置说明
编辑 `plugins/MyPlugin/config.yml` 文件来自定义插件行为：

```yaml
# 消息设置
messages:
  prefix: "&8[&6MyPlugin&8] "
  heal-success: "&a你已经恢复了生命值!"

# 功能开关
features:
  heal-command-enabled: true
  god-command-enabled: true
```

## 开发说明

### 添加新命令
1. 在 `commands` 包中创建新的命令类
2. 实现 `CommandExecutor` 接口
3. 在 `MyPlugin.java` 的 `registerCommands()` 方法中注册命令
4. 在 `plugin.yml` 中添加命令配置

### 添加事件监听
1. 在 `listeners` 包中创建新的监听器类
2. 实现 `Listener` 接口并添加 `@EventHandler` 注解的方法
3. 在 `MyPlugin.java` 的 `registerListeners()` 方法中注册监听器

## 技术栈
- **Paper API**: 1.20.1-R0.1-SNAPSHOT
- **构建工具**: Maven 3.9+
- **Java版本**: 17

## 许可证
本插件可以自由使用、修改和分发。

## 问题反馈
如果你在使用过程中遇到任何问题或有功能建议，请随时反馈。
