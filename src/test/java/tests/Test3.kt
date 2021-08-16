package tests

import org.junit.Test
import kotlin.test.assertEquals

class Test3 : BasicTest()  {
    @Test
    fun test1() {
       println("test 3.1")
    }

    @Test
    fun test2() {
       println("test 3.2")
    }

    @Test
    fun test3() {
       println("test 3.3")
    }

    @Test
    fun test4() {
       println("test 3.4")
    }

    @Test
    fun test5() {
        Thread.sleep(2000)
        println("test 3.5")
        assertEquals(0, 1)
    }
}