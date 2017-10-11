package FizzBuzz

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTests {
    @Test fun fizzBuzz() {
        assertThat(fizzBuzzOf(1), `is`("1"))
    }

    private fun  fizzBuzzOf(n: Int): String {
        return "1"
    }
}