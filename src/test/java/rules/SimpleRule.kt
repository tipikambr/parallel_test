package rules

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

open class SimpleRule(val login : String) : TestRule {
    override fun apply(p0: Statement?, p1: Description?): Statement {
        return object : Statement() {
            override fun evaluate() {
                println(login)
                p0?.evaluate()
                println("after $login")
            }
        }
    }
}