package CS161.src.lab6;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String(" A Java program must have one or more classes.The name of the source file and the name of the class must be the same.If we want make a Java program executable,we must provide a main method.The main method is an indicator and a signature for Java Virtual Machine to find the entry point of the program for execution.");
		s1=s1.replace(',',' ');
		s1=s1.replace('.',' ');
		String s2=new String("");
		String s3=new String("");
		int x;
		for(int n=s1.length()-2;n>=0;n--)
		{
			if(s1.charAt(n)==' ')
			{
				s2=s1.substring(n+1);
				x=s2.indexOf(' ');
				s3=s2.substring(0,x);
				if(s3.indexOf('a')>=0||s3.indexOf('e')>=0||s3.indexOf('i')>=0||s3.indexOf('o')>=0||s3.indexOf('u')>=0||s3.indexOf('A')>=0||s3.indexOf('E')>=0||s3.indexOf('I')>=0||s3.indexOf('O')>=0||s3.indexOf('U')>=0) System.out.print(s3); 
				System.out.print(s1.charAt(n)+"");
			}
		}
	}

}
