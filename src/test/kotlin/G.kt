import io.kotest.core.spec.style.DescribeSpec
import kotlinx.coroutines.launch

class G : DescribeSpec() {
    init {
        describe("Kotest swallows exception in coroutine") {
            launch {
                val seq =
                    sequence {
                        val values = listOf(1, 2, 3)

                        yield(values.get(0))
                        yield(values.get(1))
                        yield(values.get(2))
                        yield(values.get(3))
                    }

                seq.forEach {
                    println(it)
                }
            }.join()
        }
    }
}
