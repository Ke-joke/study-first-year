package CS161.src.lab5;

public class Song {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		while(num>=1)
		{
			if(num>1) {
				System.out.println(num+" in a bed and the little one said,");
				System.out.println("'Roll over,roll over'");
				System.out.println("They all rolled over and one fell out,");
			}
			else {
				System.out.println(num+" in a bed and the little one said,");
				System.out.println("'Alone at last'");
			}
			num--;
		}
	}

}
