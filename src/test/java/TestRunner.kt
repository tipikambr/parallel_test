import org.junit.experimental.ParallelComputer
import org.junit.runner.JUnitCore
import suites.TestSuiteMainPath
import suites.TestSuiteSidePath

fun main(){
    val result = JUnitCore.runClasses(
        ParallelComputer.classes(),
        TestSuiteMainPath::class.java,
        TestSuiteSidePath::class.java
    )

    for (failure in result.failures){
        print(failure.toString())
        print(failure.trace)
    }
    print(result.wasSuccessful())
}