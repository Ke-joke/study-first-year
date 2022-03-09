package CS161.src.lab2;

public class SalePrediction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1=230.1;
		double x2=44.5;
		double x3=17.2;
		double x4=151.5;
		double x5=180.8;	
		double x6=8.7;
		double x7=57.5;
		double x8=120.2;
		double x9=8.6;
		double x10=199.8;
		double y1=22.1;
		double y2=10.4;
		double y3=9.3;
		double y4=18.5;
		double y5=12.9;
		double y6=7.2;
		double y7=11.8;
		double y8=13.2;
		double y9=4.8;
		double y10=10.6;
		double x_=0;
		double y_=0;
		double beta1=0;
		double beta0=0;
		double beta1_up=0;
		double beta1_down=0;
		double sale=0;
		x_=(x1+x2+x3+x4+x5+x6+x7+x8+x9+x10)/10;
		y_=(y1+y2+y3+y4+y5+y6+y7+y8+y9+y10)/10;
		beta1_up=(x1-x_)*(y1-y_)+(x2-x_)*(y2-y_)+(x3-x_)*(y3-y_)+(x4-x_)*(y4-y_)+(x5-x_)*(y5-y_)+(x6-x_)*(y6-y_)+(x7-x_)*(y7-y_)+(x8-x_)*(y8-y_)+(x9-x_)*(y9-y_)+(x10-x_)*(y10-y_);
		beta1_down=(x1-x_)*(x1-x_)+(x2-x_)*(x2-x_)+(x3-x_)*(x3-x_)+(x4-x_)*(x4-x_)+(x5-x_)*(x5-x_)+(x6-x_)*(x6-x_)+(x7-x_)*(x7-x_)+(x8-x_)*(x8-x_)+(x9-x_)*(x9-x_)+(x10-x_)*(x10-x_);
		beta1=beta1_up/beta1_down;
		beta0=y_-beta1*x_;
		sale=beta0+beta1*350;
		System.out.println("x_="+x_);
		System.out.println("y_="+y_);
		System.out.println("beta1_up="+beta1_up);
		System.out.println("beta1_down="+beta1_down);
		System.out.println("beta1="+beta1);
		System.out.println("beta0="+beta0);
		System.out.println("sale="+sale);
	}

}
