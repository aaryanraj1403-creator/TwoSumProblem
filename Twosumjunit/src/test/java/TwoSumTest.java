import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest {

    @Test
    public void testFindTwoSum_Success() {
        TwoSum solver = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.findTwoSum(nums, target);
        assertEquals(2, result.length);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void testFindTwoSum_AnotherSuccess() {
        TwoSum solver = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] result = solver.findTwoSum(nums, target);
        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    public void testFindTwoSum_NoSolution() {
        TwoSum solver = new TwoSum();
        int[] nums = {1, 2, 3};
        int target = 10;

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            solver.findTwoSum(nums, target);
        });

        assertEquals("No two sum solution", exception.getMessage());
    }
}
