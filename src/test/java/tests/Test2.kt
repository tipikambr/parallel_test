package tests

import org.junit.Test

class Test2 : BasicTest()  {
    @Test
    fun test1() {
        println("test 2.1")
    }

    @Test
    fun test2() {
        println("test 2.2")
    }

    @Test
    fun test3() {
        println("test 2.3")
    }

    @Test
    fun test4() {
        Thread.sleep(2000)
        println("test 2.4")
    }

    @Test
    fun test5() {
        println("test 2.5")
    }
}