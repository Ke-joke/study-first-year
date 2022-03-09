package CS161.src.lab3;

public class VolumeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r1=23.5,r2=17.39,r3=4.39;
		double h1=24.3293,h2=23.16,h3=31.0,h4=20.0,h5=11.9999;
		double V;
		double a=Math.PI;
		double b=Math.pow(r1, 2), c=Math.pow(r2, 2),d=Math.pow(r3,2);
		V=a*(d*h5+(d+r3*r2+c)/3*h4+c*h3+(c+r2*r1+b)/3*h2+b*h1);
		System.out.println("V="+V+" cm^3");
	}

}
