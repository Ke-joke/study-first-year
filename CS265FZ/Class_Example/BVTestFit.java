package CS265FZ.Class_Example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import CS265FZ.Class_Example.FlightSeatFit.Status;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BVTestFit {
    FlightSeatFit fsf = new FlightSeatFit();
    @DisplayName("BV Test fit")
    @ParameterizedTest(name = "{index} {0} {1} {2}")
    @MethodSource("parameterDataProvider")
    void bv_test(int passengers, boolean comfortFlag, Status status){
        assertEquals(status, fsf.fit(passengers, comfortFlag));
    }
    private static Stream<Arguments> parameterDataProvider(){
        return Stream.of(
                Arguments.of(1, false, "SUCCESS"),
                Arguments.of(80, true, "SUCCESS"),
                Arguments.of(80, false, "SUCCESS"),
                Arguments.of(120, true, "FAILURE"),
                Arguments.of(121, true, "FAILURE"),
                Arguments.of(Integer.MAX_VALUE, true, "FAILURE"),
                Arguments.of(Integer.MIN_VALUE, false, "ERROR"),
                Arguments.of(0, false, "ERROR")
        );
    }
}