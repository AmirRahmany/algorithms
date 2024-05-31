package org.example.count_list_items;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CountListItemsTest {

    @Test
    void count_the_number_of_items_in_a_list_by_recursive_function() {
        final CountListItem countListItem = new CountListItem();
        int[] array = {2, 4, 5, 3, 4};

        int count = countListItem.count(array);

        assertThat(count).isEqualTo(5);

    }
}
