package CS161.src.lab4;

public class ExpresswayTollFee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='c',m='m',b='b',t='t',v='v';
		char vehicle='m';
		if(vehicle==c) {
			System.out.println("Car2-2.00");
		}
		else if(vehicle==m) {
			System.out.println("Motorbike-1.10");
		}
		else if(vehicle==b) {
			System.out.println("Bus-4.25");
		}
		else if(vehicle==t) {
			System.out.println("Truck-6.70");
			}
		else if(vehicle==v){
			System.out.println("Van-4.00");
		}
	}
}

