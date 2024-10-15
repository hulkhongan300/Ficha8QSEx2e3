import org.example.NumberFunc;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberFuncTest {
    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    void isPrimeTest(int number) {
        assertTrue(new NumberFunc().isPrime(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    void isEvenTest(int number) {
        assertTrue(new NumberFunc().isEven(number));
    }
    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    void isMultipleTest(int number) {
        assertTrue(new NumberFunc().isMultiple(23,number));
    }

}
