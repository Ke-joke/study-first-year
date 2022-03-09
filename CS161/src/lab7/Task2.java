package CS161.src.lab7;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a valid octal Number:");
		String valid = new String("");
		String exit="exit";
		String s2 =new String("01234567"), s3 =("0123456789ABCDE");
		while((valid=sc.nextLine()).equals(exit)==false) {  
			int invaild=0;
			for(int i=0;i<valid.length();i++) {
				if(s2.indexOf(valid.charAt(i))==-1) {
					invaild=1;
					System.out.println("Please input a valid Octal Number:");
					break;
				}
			}
			if(invaild!=1){
				int octal=Integer.parseInt(valid);
				int power=0,dec=0;
				while(octal>0) {
					dec=dec+(octal%10)*(int)(Math.pow(8,power));
					power++;
					octal=octal/10;
				}
				int digit=0;
				String hex="";
				while(dec>0) {
					digit=dec%16;
					hex=s3.charAt(digit)+hex;
					dec=dec/16;
				}
				System.out.println("Hexadecimal number:"+hex);
			}
			continue;
		}	
		sc.close();
	}
}
