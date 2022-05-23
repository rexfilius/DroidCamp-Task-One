class Arithmetic(
    private val x: Int,
    private val y: Int
) {

    fun add() {
        val result = x + y
        println("$x plus $y = $result")
    }

    fun subtract() {
        val result = x - y
        println("$x minus $y = $result")
    }

    fun multiply() {
        val result = x * y
        println("$x times $y = $result")
    }
}

fun main() {
    val arithmetic = Arithmetic(7, 6)
    arithmetic.add()
    arithmetic.subtract()
    arithmetic.multiply()
}

// move this code to another folder in my local machine,
// and I am testing if git will not bring up any issue.
// if this code successfully gets pushed, then git did not bring up any issue