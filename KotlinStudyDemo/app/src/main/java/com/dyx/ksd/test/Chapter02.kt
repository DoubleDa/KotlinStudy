package com.dyx.ksd.test

import java.io.File

/**
 *
 * project name：KotlinStudyDemo
 * class describe：
 * create person：dayongxin
 * create time：2017/6/19 下午4:23
 * alter person：dayongxin
 * alter time：2017/6/19 下午4:23
 * alter remark：
 * @version
 *
 */
fun main(args: Array<String>) {
    println("Hello World!")
    /**
     * 创建 DTOs（POJOs/POCOs）
     */
    println(Person("哒哒", 18))
    /**
     * 函数的默认参数
     */
    function1()
    /**
     * 过滤 list
     */
    getList()
    /**
     * String 内插
     */
    insertString("哒哒")
    /**
     * 类型判断
     */
    judgeType(27.89)
    /**
     * 遍历 map/pair型list
     */
    useMap()
    /**
     * 使用区间
     */
    //useMyRange(101)
    //useMyRange(100)
    useMyRange(6)
    /**
     * 延迟属性
     */
    lazyAttribute()
    /**
     * If not null 缩写
     */
    ifNotNull()
    /**
     * If not null and else 缩写
     */
    ifNotNullAndElse()
    /**
     * “try/catch”表达式
     */
    useTryCatch()
}

fun useTryCatch() {
    val result = try {
        getData()
    } catch (e: Exception) {
        throw IllegalStateException(e)
    }
    println(result)
}

fun getData(): String {
    return "哒哒"
}

/**
 * If not null and else 缩写
 */
fun ifNotNullAndElse() {
    val files = File("test").listFiles()
    println(files?.size ?: "empty")
}

fun ifNotNull() {
    val files = File("test").listFiles()
    println(files?.size)
}


/**
 * 延迟属性
 */
fun lazyAttribute() {
    val p: String by lazy {
        "abcde"
    }
    println("the lazy string is $p")
}

fun useMyRange(a: Int) {
    //for (i in 1..100) { …… }  // 闭区间：包含 100
//    for (a in 1..100) {
//        println("$a  is in range!")
//    }
    //for (i in 1 until 100) { …… } // 半开区间：不包含 100
//    for (a in 1 until 100){
//        println("$a  is in range!")
//    }
    //for (x in 2..10 step 2) { …… }//跳过第二个数
//    for (a in 3..10 step 2) {
//        println("$a  is in range!")
//    }
    //for (x in 10 downTo 1) { …… }降序打印
//    for (a in 10 downTo 1) {
//        println("$a  is in range!")
//    }
    //if (x in 1..10) { …… }
    if (a in 1..10) {
        println("$a  is in range!")
    }
}

/**
 * 遍历 map/pair型list
 */
fun useMap() {
    val map = mapOf("a" to 1, "b" to "2", "c" to "abcd")
    for ((k, v) in map) {
        println("$k,$v")
    }
}

/**
 * 创建 DTOs（POJOs/POCOs）
 */
data class Person(val name: String, val age: Int)

/**
 * 函数的默认参数
 */
fun function1(a: Int = 0, b: String = "") {
    println("$a,$b")
}

/**
 * 过滤 list
 */
fun getList() {
    val lists = listOf(-2, 0, 1, 5)
    val position = lists.filter { x -> x > 0 }
    println("The position is $position")
}

/**
 * String 内插
 */
fun insertString(name: String) {
    println("my name is $name")
}

fun judgeType(result: Any) =
        when (result) {
            is String -> println("This is String!")
            is Long -> println("This is Long!")
            is Int -> println("This is Int!")
            is Double -> println("This is Double!")
            else -> println("Unknow")
        }
