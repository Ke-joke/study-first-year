package CS161.src.lab5;

public class SquareSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S_1=0,S_2=0,i=13,a,b;
		for(int num=1;num<=100;num++) {
			if(num%13==0) {
				a=num;
				S_1=S_1+a;
			}
			b=num*num;
			S_2=S_2+b;
		}
		System.out.println("The sum of all numbers divisible by "+i+" is "+S_1);
		System.out.println("The sum of all squares is "+S_2);
	}

}
