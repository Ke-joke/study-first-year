package CS265FZ.Class_Example;

public class FlightSeatFit {
    enum Status {SUCCESS, FAILURE, ERROR};
    public Status fit(int passengers, boolean comfortFlag){
        Status status = Status.SUCCESS;
        if (passengers < 1)
            status = Status.ERROR;
        else if (passengers > 120||(passengers > 80&&comfortFlag))
            status = Status.FAILURE;
        return status;
    }
}
