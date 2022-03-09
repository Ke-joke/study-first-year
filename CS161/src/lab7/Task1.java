package CS161.src.lab7;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = new String ("");
		String integeres="",fractions="",characteres="";
		String s2=("0123456789");
		while((s1=sc.nextLine()).equals("exit")==false) {
			for(int i=0;i<s1.length();i++){
				integeres=s1;
				if(s2.indexOf(integeres.charAt(i))==-1) break;	
			}
			if(integeres.indexOf(".")==-1) {
				characteres=integeres;
				if(characteres.charAt(0)>='a'&&characteres.charAt(0)<='z'||characteres.charAt(0)>='A'&&characteres.charAt(0)<='Z') {
					System.out.println(s1+" cannot be converted into a type byte!");
					System.out.println(s1+" cannot be converted into a type short!");
					System.out.println(s1+" cannot be converted into a type int!");
					System.out.println(s1+" cannot be converted into a type long!");
					System.out.println(s1+" cannot be converted into a type float!");
					System.out.println(s1+" cannot be converted into a type double!");
				}
				else {
					if(Long.parseLong(integeres)>=Byte.MIN_VALUE&&Long.parseLong(integeres)<=Byte.MAX_VALUE) {
						System.out.println(s1+" can be converted into a type byte!");
					}
					else System.out.println(integeres+" cannot be converted into a type byte!");
					if(Long.parseLong(integeres)>=Short.MIN_VALUE&&Long.parseLong(integeres)<=Short.MAX_VALUE) {
						System.out.println(integeres+" can be converted into a type short!");
					}
					else System.out.println(integeres+" cannot be converted into a type short!");
					if(Long.parseLong(integeres)>=Integer.MIN_VALUE&&Long.parseLong(integeres)<=Integer.MAX_VALUE) {
						System.out.println(integeres+" can be converted into a type int!");
					}
					else System.out.println(integeres+" cannot be converted into a type int!");
					if(Long.parseLong(integeres)>=Long.MIN_VALUE&&Long.parseLong(integeres)<=Long.MAX_VALUE) {
						System.out.println(integeres+" can be converted into a type long!");
					}
					else System.out.println(integeres+" cannot be converted into a type long!");
					if(Long.parseLong(integeres)>=Float.MIN_VALUE&&Long.parseLong(integeres)<=Float.MAX_VALUE) {
						System.out.println(integeres+" can be converted into a type float!");
					}
					else System.out.println(integeres+" cannot be converted into a type float!");
					if(Long.parseLong(integeres)>=Double.MIN_VALUE&&Long.parseLong(integeres)<=Double.MAX_VALUE) {
						System.out.println(integeres+" can be converted into a type double!");
					}
					else System.out.println(integeres+" cannot be converted into a type double!");
				}
			}
			if(integeres.indexOf(".")>0) {
				fractions=integeres;
				System.out.println(s1+" cannot be converted into a type byte!");
				System.out.println(s1+" cannot be converted into a type short!");
				System.out.println(s1+" cannot be converted into a type int!");
				System.out.println(s1+" cannot be converted into a type long!");
				if(Double.parseDouble(fractions)>=Float.MIN_VALUE&&Double.parseDouble(fractions)<=Float.MAX_VALUE) {
					System.out.println(fractions+" can be converted into a type float!");
				}
				else System.out.println(fractions+" cannot be converted into a type float!");
				if(Double.parseDouble(fractions)>=Double.MIN_VALUE&&Double.parseDouble(fractions)<=Double.MAX_VALUE) {
					System.out.println(fractions+" can be converted into a type double!");
				}
				else System.out.println(fractions+" cannot be converted into a type double!");	
			}
			continue;
		}
		sc.close();
	}
}
