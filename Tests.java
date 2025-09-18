import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MaxOfThreeTernaryTest {

    @Test
    void testMaxWithDistinctNumbersOne() {
        int result = MaxOfThreeTernary.findMax(5, 9, 3);
        assertEquals(9, result, "Max of 5, 9, 3 should be 9");
    }

    @Test
    void testMaxWithEqualNumbers() {
        int result = MaxOfThreeTernary.findMax(7, 7, 7);
        assertEquals(7, result, "Max of 7, 7, 7 should be 7");
    }
}