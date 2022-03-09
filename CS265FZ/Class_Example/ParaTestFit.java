package CS265FZ.Class_Example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import CS265FZ.Class_Example.FlightSeatFit.Status;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ParaTestFit {
    FlightSeatFit fsf = new FlightSeatFit();

    @DisplayName("EC Test")
    @ParameterizedTest
    @CsvSource({
            "40, false, SUCCESS",
            "101, true, FAILURE",
            "200, false, FAILURE",
            "-100, false, ERROR"})
    void test_ec_1_to_4(int passengers, boolean comfortFlag, Status status){
        assertEquals(status,fsf.fit(passengers, comfortFlag));
    }
}