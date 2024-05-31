package org.example.find_max_number;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindMaxNumberTests {

    @Test
    void find_the_maximum_number_in_a_list() {
        final FindMaxNumber findMaxNumber = new FindMaxNumber();
        int[] list = {5,2,0,12,7,6};

        assertThat(findMaxNumber.findMaxIn(list)).isEqualTo(12);
    }
}
