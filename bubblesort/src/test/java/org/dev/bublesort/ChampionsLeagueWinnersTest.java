package org.dev.bublesort;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ChampionsLeagueWinnersTest {

    @Test
    void sort_champions_league_winners_list_in_order_by_years_to_ascending() {
        int[] realMadridUCLWinnerYears = {1956, 2014, 1960, 1957, 2016, 1958, 1966, 2018, 2000, 1959, 2002, 2017, 1998, 2022};

        final BubbleSort bubbleSort = new BubbleSort();

        int[] result = bubbleSort.sortAscending(realMadridUCLWinnerYears);


        assertThat(result).isEqualTo(new int[]{1956, 1957, 1958, 1959, 1960, 1966, 1998, 2000, 2002, 2014, 2016, 2017, 2018, 2022});

    }

    @Test
    void name() {
        char ch = '\u0031' + '\u0035';
     /*   ch -= 'a';
        ch++;
        ch+='b';
        int z = 'z';*/
       // char mystery = z - 10;
        System.out.println(ch);
    }
}
