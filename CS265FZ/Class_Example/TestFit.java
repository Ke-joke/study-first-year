package CS265FZ.Class_Example;

import CS265FZ.Class_Example.FlightSeatFit.Status;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TestFit {
    FlightSeatFit fsf = new FlightSeatFit();
    @Test
    void test1_1() {//Cases:EC-2, 5, 7
        assertEquals(fsf.fit(1,false), Status.SUCCESS);
    }

    @Test
    void test1_2(){//Case:EC-3, 6, 8
        assertEquals(fsf.fit(101,true), Status.FAILURE);
    }

    @Test
    void test1_3(){//Case:EC-4
        assertEquals(fsf.fit(200,false), Status.FAILURE);
    }

    @Test
    void test1_4(){//Case:EC-1, 9
        assertEquals(fsf.fit(-100,false), Status.ERROR);
    }

}