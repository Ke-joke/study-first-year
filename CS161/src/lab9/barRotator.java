package CS161.src.lab9;

import java.util.Scanner;

public class barRotator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1=("");
		while((s1=sc.nextLine()).equals("exit")==false) {
			int[][] r= new int[12][12];
			for (int i = 0;i < r.length;i++) {
				for(int j = 0;j < r[i].length;j++) {
					if(i==5|i==6) r[i][j]=0;
					else r[i][j]=1;
				}
			}
			for(int i = 0;i< r.length;i++) {
				for(int j = 0;j < r[i].length;j++) {
					if(Integer.parseInt(s1)==0||Integer.parseInt(s1)==180||Integer.parseInt(s1)==360) System.out.print(r[i][j]+" ");
					else if(Integer.parseInt(s1)==45||Integer.parseInt(s1)==225){
						r[i][j]=1;
						if(i < r.length-1) r[i][i+1]=0;
						if(i > 0) r[i][i-1]=0;
						System.out.print(r[i][j]+" ");
					}else if(Integer.parseInt(s1)==90||Integer.parseInt(s1)==270) {
						r[i][j]=1;
						if(j==5||j==6) r[i][j]=0;
						System.out.print(r[i][j]+" ");
					}else if(Integer.parseInt(s1)==135||Integer.parseInt(s1)==315) {
						r[i][j]=1;
						if(10-i >= 0) r[i][10-i]=0;
						if(12-i >= 0&&12-i < r.length) r[i][12-i]=0;
						System.out.print(r[i][j]+" ");
					}else {
						System.out.println("Please input correct rotation:");
						i=r[i].length;
						break;
					}if(j == r[j].length-1) System.out.println();
				}
			}continue;
		}
		sc.close();
	}

}
