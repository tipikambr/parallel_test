package suites

import org.junit.ClassRule
import org.junit.Rule
import org.junit.rules.ExternalResource
import org.junit.runner.RunWith
import org.junit.runners.Suite
import rules.MainPathRule
import tests.Test1
import tests.Test2
import utils.MySuite

@RunWith(MySuite::class)
@Suite.SuiteClasses(Test1::class, Test2::class)
class TestSuiteMainPath(override var login: String) : TestSuiteInterface {
    @Rule
    val beforeEach = MainPathRule()

    companion object {
        @ClassRule
        @JvmField
        val testRule = object : ExternalResource() {
            override fun before() {
                println("login 1")
            }
        }
   }
}