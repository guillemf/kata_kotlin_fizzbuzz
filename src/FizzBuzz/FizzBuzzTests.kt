package FizzBuzz

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTests {
    @Test fun fizzBuzz() {
        assertThat(fizzBuzzOf(1), `is`("1"))
        assertThat(fizzBuzzOf(2), `is`("2"))
        assertThat(fizzBuzzOf(3), `is`("Fizz"))
    }

    private fun  fizzBuzzOf(n: Int): String {
        if (n == 3) return "Fizz"
        return n.toString()
    }
}