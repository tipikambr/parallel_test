package utils

import org.junit.Ignore
import org.junit.rules.RunRules
import org.junit.runner.notification.RunNotifier
import org.junit.runners.BlockJUnit4ClassRunner
import org.junit.runners.model.FrameworkMethod
import rules.SimpleRule
import java.util.*

class MyRunner(klass: Class<*>) : BlockJUnit4ClassRunner(klass) {
    override fun runChild(method: FrameworkMethod?, notifier: RunNotifier?) {
        val description = describeChild(method)
        if (method?.getAnnotation(Ignore::class.java) != null)
            notifier?.fireTestIgnored(description)
        else {
            if (description.getAnnotation(Deprecated::class.java) != null)
                println("name=${description.methodName} + annotations=${description.annotations}")
            val runRules = RunRules(methodBlock(method), Collections.singletonList(SimpleRule("TODO")), description)
            runLeaf(runRules, description, notifier)
        }
    }
}