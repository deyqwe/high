#!/bin/bash

echo "正在编译 MyPlugin..."

# 检查Maven
if ! command -v mvn &> /dev/null; then
    echo "错误: 未安装Maven。请先安装Maven 3.6+"
    echo "安装指南: https://maven.apache.org/install.html"
    exit 1
fi

# 清理并编译
echo "正在运行 mvn clean package..."
mvn clean package -DskipTests

# 检查结果
if [ $? -eq 0 ]; then
    echo ""
    echo "✅ 编译成功!"
    echo "JAR文件位置: target/MyPlugin-1.0.0.jar"
    echo ""
    
    # 复制到releases目录
    mkdir -p releases
    cp target/MyPlugin-1.0.0.jar releases/
    echo "已复制到 releases/MyPlugin-1.0.0.jar"
else
    echo ""
    echo "❌ 编译失败!"
    exit 1
fi
