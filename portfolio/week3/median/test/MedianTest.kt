// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus
import io.kotest.matchers.should

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "single value test"
    { median(listOf(2.0f)) shouldBe 2.0f }
    //single value test should return the only element in list
    "even value test"
    { median(listOf(3.0f,1.0f)) shouldBe 3.0f plusOrMinus tolerance }
    //floating point numbers cant be represented accurately sometimes so tolerance is needed
    "Ordering & odd test"
    { median(listOf(10.0f, 3.0f, 7.0f)) shouldBe 7.0f }
    //tests that sorted() is used
    "Ordering & even test"
    { median(listOf(10.0f, 3.0f, 7.0f, 5.0f)) shouldBe 6.0f plusOrMinus tolerance }
    //tests sorted() is used plus and returns the correct value including tolerance for the calculations



})
