import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxOfThreeTernaryTest {

    @Test
    void testMaxWithDistinctNumbersOne() {
        int result = MaxOfThreeTernary.findMax(5, 9, 3);
        assertEquals(9, result, "Max of 5, 9, 3 should be 9");
    }

    @Test
    void testMaxWithEqualNumbersDimo() {
        int result = MaxOfThreeTernary.findMax(7, 7, 7);
        assertEquals(7, result, "Max of 7, 7, 7 should be 7");
    }
    @Test
<<<<<<< HEAD
    void testMaxWithEqualNumbersPromqnaOtDimo() {
=======
    void testMaxWithEqualNumbersPromqnaOtMitko() {
>>>>>>> 22ebd4de7f3301c0de3213be3b2648de034adde8
        int result = MaxOfThreeTernary.findMax(7, 7, 7);
        assertEquals(7, result, "Max of 7, 7, 7 should be 7");
    }
}
