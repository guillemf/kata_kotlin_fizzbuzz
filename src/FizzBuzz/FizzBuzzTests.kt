package FizzBuzz

import org.hamcrest.CoreMatchers.*
import org.junit.Assert.*
import org.junit.Test

class FizzBuzzTests {
    @Test fun fizzBuzz() {
        assertThat(fizzBuzzOf(1), `is`("1"))
        assertThat(fizzBuzzOf(2), `is`("2"))
        assertThat(fizzBuzzOf(3), `is`("Fizz"))
        assertThat(fizzBuzzOf(4), `is`("4"))
        assertThat(fizzBuzzOf(5), `is`("Buzz"))
        assertThat(fizzBuzzOf(9), `is`("Fizz"))
        assertThat(fizzBuzzOf(10), `is`("Buzz"))
    }

    private fun  fizzBuzzOf(n: Int): String {

        if (n % 3 == 0) return "Fizz"
        if (n % 5 == 0) return "Buzz"

        return n.toString()
    }
}