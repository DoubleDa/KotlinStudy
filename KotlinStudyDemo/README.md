Kotlin学习笔记

## 基础语法

- 使用可空值及 null 检测
当某个变量的值可以为 null 的时候，必须在声明处的类型后添加 ? 来标识该引用可为空。

- 使用类型检测及自动类型转换
is 运算符检测一个表达式是否某类型的一个实例。 如果一个不可变的局部变量或属性已经判断出为某类型，那么检测后的分支中可以直接当作该类型使用，无需显式转换。

- 使用区间（range）
使用 in 运算符来检测某个数字是否在指定区间内。

## 习惯用法

- list

```json
val list = listOf("a", "b", "c")
```

- map

```json
val map = mapOf("a" to 1, "b" to 2, "c" to 3)
```

- If not null缩写

```json
val files = File("Test").listFiles()
println(files?.size)
```

- when表达式

```json
fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}
```

## 编码规范

### 命名风格

- 使用驼峰法命名（并避免命名含有下划线）
- 类型名以大写字母开头
- 方法和属性以小写字母开头
- 使用 4 个空格缩进
- 公有函数应撰写函数文档，这样这些文档才会出现在 Kotlin Doc 中

### 函数还是属性

底层算法优先使用属性而不是函数：

- 不会抛异常
- O(1) 复杂度
- 计算廉价（或缓存第一次运行）
- 不同调用返回相同结果

