package com.dyx.ksd.test

/**
 *
 * project name：KotlinStudyDemo
 * class describe：
 * create person：dayongxin
 * create time：2017/6/19 下午6:01
 * alter person：dayongxin
 * alter time：2017/6/19 下午6:01
 * alter remark：
 * @version
 *
 */

fun main(args: Array<String>) {

}

open class NewPerson(name: String, age: Int)

class NewStudent(name: String, age: Int, schoolName: String, country: String) : NewPerson(name, age)