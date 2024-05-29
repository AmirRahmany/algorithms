import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMaxSubsequenceTest {

    private MaxSubcequence maxSubcequence;

    @BeforeEach
    void setUp() {
        maxSubcequence = new MaxSubcequence();
    }

    @Test
    void find_sum_max_subsequence_in_array_with_order_n3() {
        assertThat(maxSubcequence.maxSumON3(getArray())).isEqualTo(20);
    }

    @Test
    void find_sum_max_subsequence_in_array_with_order_n2() {
        assertThat(maxSubcequence.maxSumON2(getArray())).isEqualTo(20);
    }

    @Test
    void find_sum_max_subsequence_in_array_with_order_n() {
        assertThat(maxSubcequence.maxSumON(getArray())).isEqualTo(20);
    }

    private static int[] getArray() {
        return new int[]{-1, 11, -4, 13, -5, -2};
    }
}
