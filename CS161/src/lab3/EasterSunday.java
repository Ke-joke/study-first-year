package CS161.src.lab3;

public class EasterSunday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,num11,num12,num13;
		num1=year%19;
		num2=year/100;
		num3=year%100;
		num4=num2/4;
		num5=num2%4;
		num6=(num2*8+13)/25;
		num7=(num1*19+num2-num4-num6+15)%30;
		num8=num3/4;
		num9=num3%4;
		num10=(num1+num7*11)/319;
		num11=(num5*2+num8*2-num9-num7+num10+32)%7;
		num12=(num7-num10+num11+90)/25;
		num13=(num7-num10+num11+num12+19)%32;
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		System.out.println("num3="+num3);
		System.out.println("num4="+num4);
		System.out.println("num5="+num5);
		System.out.println("num6="+num6);
		System.out.println("num7="+num7);
		System.out.println("num8="+num8);
		System.out.println("num9="+num9);
		System.out.println("num10="+num10);
		System.out.println("num11="+num11);
		System.out.println("num12="+num12);
		System.out.println("num13="+num13);
		System.out.println("The Easter day is:"+year+"."+num12+"."+num13);
	}

}
