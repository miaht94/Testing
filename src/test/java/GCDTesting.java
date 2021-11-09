import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class GCDTesting {
    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            "150,    0,   -1",
            "150,    1,    1",
            "150,    2,    0",
            "150,  299,    1",
            "150,  300,    0",
            "150,  301,   -1",
            "150,  150,    0",
            "  0,  150,   -1",
            "  1,  150,    1",
            "  2,  150,    0",
            "299,  150,    1",
            "300,  150,    0",
            "301,  150,   -1",

    })
    @DisplayName("Kiểm thử biên")
    void TestType1(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }

    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            "151, 0, -1",
            " 30, 29, 1",
            " 14, 26, 0",
    })
    @DisplayName("Kiểm thử lớp tương đương giá trị output")
    void TestType2(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }

    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            "100, 160, 0",
            "100, 161, 1",
            " 60,  29, 1",
            " 51,  50, 1",
            " 51,  49, 1",
            " 51,  41, 1",
            "211,  30, 1",
            "211,  31, 1",
            "211,  11, 1",
            "  1,  10, 1",
            "  1,  21, 1",
            "  1,  11, 1",
            "  1,   1, 1",
            " 40,   1, 1",
            "121,   1, 1",
            " 41,   1, 1",
    })
    @DisplayName("Kiểm thử lớp tương đương từng input")
    void TestType3(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }

    @ParameterizedTest(name = "gcd({0}, {1}) return {2}")
    @CsvSource({
            " 20,  20, 0",
            " 50,  25, 0",
            " 29,  58, 0",
    })
    @DisplayName("Kiểm thử lớp tương đương miền cả 2 dữ liệu đầu vào")
    void TestType4(int x, int y, int expectedResult) {
        Main main = new Main();
        assertEquals(expectedResult, main.gcd(x, y),
                () -> "gcd(" + x + ", " + y + ")"+ " should return " + expectedResult);
    }
}
