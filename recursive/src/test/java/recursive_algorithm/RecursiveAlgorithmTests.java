package recursive_algorithm;

import org.example.RecursiveAlgorithm;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class RecursiveAlgorithmTests {

    @ParameterizedTest
    @CsvSource(value = {
            "3,6",
            "4,24",
            "5,120",
            "6,720"
    })
    void calculate_the_factorial_of_entered_number(int number, int fact) {
        final RecursiveAlgorithm recursiveAlgorithm = new RecursiveAlgorithm();

        int result = recursiveAlgorithm.factorialOf(number);

        assertThat(result).isEqualTo(fact);
    }
}
