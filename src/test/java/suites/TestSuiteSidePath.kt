package suites

import org.junit.ClassRule
import org.junit.Rule
import org.junit.rules.ExternalResource
import org.junit.runner.RunWith
import org.junit.runners.Suite
import rules.SidePathRule
import tests.Test3
import utils.MySuite

@RunWith(MySuite::class)
@Suite.SuiteClasses(Test3::class)
class TestSuiteSidePath(override var login: String) : TestSuiteInterface {
    @Rule
    val beforeEach = SidePathRule()

    companion object {
        @ClassRule
        @JvmField
        val testRule = object : ExternalResource() {
            override fun before() {
                println("login 2")
            }
        }
    }
}