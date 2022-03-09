package CS161.src.lab2;

public class UsingMod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=123;
		int digital1=0;
		int digital2=0;
		int digital3=0;
		digital1=num/100;
		digital2=num/10%10;
		digital3=num%10;
		System.out.println("The digits in the number "+num+" are");
		System.out.println(digital1);
		System.out.println(digital2);
		System.out.println(digital3);
	}

}
