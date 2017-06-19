package com.dyx.ksd.test

/**
 *
 * project name：KotlinStudyDemo
 * class describe：
 * create person：dayongxin
 * create time：2017/6/19 上午12:09
 * alter person：dayongxin
 * alter time：2017/6/19 上午12:09
 * alter remark：
 * @version
 *
 */

/**
 * main函数
 */
fun main(args: Array<String>) {
    println("Hello World!")
    println(sum(1, 2))
    println(sum1(3, 4))
    println(sum2(5, 6))
    println(sum3(3, 4))
    /**
     * 定义局部变量
     */
    val a: Int = 1
    val b: String = "哒哒"
    val c = 1
    val d = "哒哒"
    val e: Int
    e = 19
    println("a=$a,b=$b,c+$c,d=$d,e=$e")
    /**
     * 可变变量
     */
    var x = 5
    x += 1
    println("x=$x")
    //这是注释
    /**
     * 使用字符串模板
     */
    var f = 12
    val s1 = "f is $f"
    println(s1)
    f = 23
    val s2 = "${s1.replace("is", "was")},but now is $f"
    println(s2)
    /**
     * maxNum
     */
    println("The max is ${maxNum(23, 67)}")
    /**
     * 使用可空值及 null 检测
     */
    printString("23", "12")
    /**
     * 使用类型检测及自动类型转换
     */
    println(getStringLength("11222"))
    /**
     * 使用 for 循环
     */
    println(useFor())
    /**
     * 使用 while 循环
     */
    println(useWhile())
    /**
     * 使用 when 表达式
     */
    println(useWhen(1))
    println(useWhen("Hello"))
    println(useWhen(1100))
    println(useWhen(0.1))
    /**
     * 使用区间（range）
     */
    println(useRange(12, 45))
    /**
     * 使用集合
     */
    println(useList("any"))
}

/**
 * sum函数：带有两个 Int 参数、返回 Int 的函数
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}

/**
 * sum1函数：将表达式作为函数体、返回值类型自动推断的函数
 */
fun sum1(a: Int, b: Int) = a + b

/**
 * sum2函数：函数返回无意义的值
 */
fun sum2(a: Int, b: Int): Unit {
    println("${a + b}")
}

/**
 * sum3函数：Unit 返回类型可以省略
 */
fun sum3(a: Int, b: Int) {
    println("${a + b}")
}

/**
 * maxNum函数：使用条件表达式
 */
fun maxNum(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

/**
 * 将string转换为int
 */
fun parseInt(str: String): Int? {
    return str.toIntOrNull()
}

/**
 * 打印String
 */
fun printString(a: String, b: String) {
    val x = parseInt(a)
    val y = parseInt(b)
    if (x != null && y != null) {
        println(x * y)
    } else {
        println("The $x or $y is not a number")
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

/**
 * 使用 for 循环
 */
fun useFor() {
    val lists = listOf("a", "v", "d")
    for (list in lists) {
        println(list)
    }
}

/**
 * 使用 while 循环
 */
fun useWhile() {
    val lists = listOf("a", "v", "d")
    var index = 0
    while (index < lists.size) {
        println("The result is:${lists[index]}")
        index++
    }
}

/**
 * 使用 when 表达式
 */
fun useWhen(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is Long -> "is not long"
            else -> "Unknown"
        }

/**
 * 使用区间（range）
 */
fun useRange(a: Int, b: Int): Unit {
    if (a in 1..b + 1) {
        println("$a in $b range")
    }
}

/**
 * 使用集合
 */
fun useList(a: String) {
    val lists = listOf("any", "some", "test", "love")
    when {
        a in lists -> println("$a in lists")
    }
}