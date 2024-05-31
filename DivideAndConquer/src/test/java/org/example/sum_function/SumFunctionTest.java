package org.example.sum_function;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SumFunctionTest {


    @Test
    void sum_elements_of_array_by_divide_and_conquer_algorithm() {
        final SumFunction sumFunction = new SumFunction();
        int[] array = {2,4,6};

        assertThat(sumFunction.sum(array)).isEqualTo(12);
    }
}
