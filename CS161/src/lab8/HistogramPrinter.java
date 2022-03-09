package CS161.src.lab8;

public class HistogramPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num = new String("1022473578476949426110832338899437170338449409627474102214022150928");
		int[] count =new int[10];
		int x = 0;
		while(x < count.length) {
			for (int i=0;i<num.length();i++) {
				if ((Integer.parseInt(num.charAt(i)+""))==x) {
					count[x]++;
				}
			} 
			x++;
		}
		int largest = count[0];
		for(int i = 0;i < count.length;i++) {
			if(count[i]>largest) {
				largest = count[i];
			}
		}
		for (int i = 0;i < largest;i++) {
			x = 0;
			while (x < count.length) {
				if (count[x] < (largest-i)&(x==0|x==9)) {
					System.out.print("    ");
				}else if(count[x] < (largest-i)&(x != 0|x != 9)) {
					System.out.print("     ");
				}else if(count[x] >= (largest-i)&x==0) {
					System.out.print("["+x+"] ");
				}else if(count[x] >= (largest-i)&x==9) {
					System.out.print(" ["+x+"]");
				}else {
					System.out.print(" ["+x+"] ");
				}
				x++;
			}
			System.out.println("");
		}
	}

}