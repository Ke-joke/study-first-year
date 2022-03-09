package CS161.src.lab4;

public class SquareIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1=6,y1=7,length1=3;
		int x2=4,y2=5,length2=7;
		double a1=x1-length1/2,a2=x1+length1/2,
			a3=y1-length1/2,a4=y1+length1/2;
		double b1=x2-length2/2,b2=x2+length2/2,
			b3=y2-length2/2,b4=y2+length2/2;
		if(a1<b2&&a3<b4) {
			if(a1<=b1&&a2>=b2&&a3<=b3&&a4>=b4) {
				System.out.println("Square1 contains Square2");
			}
			else if(a2<=b2&&a1>=b1&&a4<=b4&&a3>=b3) {
				System.out.println("Square2 contains Square1");
			}
			else if(a2<=b1||a4<=b3) {
				System.out.println("The two squares are apart from each other");
			}
			else {
				System.out.println("Square1 intersects with Square2");
			}
		}
		else {
			System.out.println("The two squares are apart from each other");
		}
	}

}
