package CS161.src.lab3;

public class WCTCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=20;
		double num1=0.16;
		double Tf=31.4;
		double Twc;
		double p=Math.pow(v,num1);
		double Cwc;
		if(v<2&&Tf<-51&&Tf>41) {} 
		else {
		Twc=35.74+0.6215*Tf-35.75*p+0.4275*p*Tf;
		Cwc=(Twc-32)*5/9;
		System.out.println("Cwc="+Cwc+" degrees Celsius");
		}
	}

}
