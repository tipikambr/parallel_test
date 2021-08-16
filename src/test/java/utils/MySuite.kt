package utils

import org.junit.runner.Runner
import org.junit.runners.Suite
import org.junit.runners.model.InitializationError
import org.junit.runners.model.RunnerBuilder
import java.lang.String
import java.util.*
import kotlin.reflect.KClass

class MySuite(klass: Class<*>?, builder: RunnerBuilder?) : Suite(null, getRunners(getAnnotatedClasses(klass))) {
    companion object {
        private fun getAnnotatedClasses(klass: Class<*>?): Array<Class<*>> {
            val annotation = klass?.getAnnotation(SuiteClasses::class.java)
                ?: throw InitializationError(String.format("class '%s' must have a SuiteClasses annotation", klass!!.name))
            return annotation.value.map { it.java }.toTypedArray()
        }

        fun getRunners(classes: Array<Class<*>>): List<Runner> {
            val runners = LinkedList<Runner>()
            for (klass in classes)
                runners.add(MyRunner(klass))

            return runners
        }

    }
}