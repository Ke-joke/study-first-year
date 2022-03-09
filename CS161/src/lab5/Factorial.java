package CS161.src.lab5;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i=1, s=1,n;
		while(i<=17)
		{
			s=s*i;
			i++;	
		}
		n=i-1;
		System.out.println("The fatorial of "+n+" is "+s);
	}

}
