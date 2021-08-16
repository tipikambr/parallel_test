package tests

import org.junit.Test

class Test1 : BasicTest(){
    @Test
    fun test1() {
        println("test 1.1")
    }

    @Test
    fun test2() {
        Thread.sleep(2000)
        println("test 1.2")
    }

    @Test
    fun test3() {
        println("test 1.3")
    }

    @Test
    fun test4() {
        println("test 1.4")
    }

    @Test
    fun test5() {
        println("test 1.5")
    }



}