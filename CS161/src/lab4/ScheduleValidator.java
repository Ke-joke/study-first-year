package CS161.src.lab4;

public class ScheduleValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sT2=new String("0820");
		int s1=1215,e1=2030;
		int s2=Integer.parseInt(sT2),e2=1345;
		if(s1<s2) {
			if(e1<=s2) {
				System.out.println("Perfectly scheduled!");
			}
			else if(e1>s2) {
				System.out.println("Appointment1-Appoint2");
			}
		}
		else if(s1>s2) {
			if(s1>=e2) {
			System.out.println("Perfectly scheduled!");
			}
			else if(s1<e2) {
				System.out.println("Appointment2-Appointment1");
			}
		}
	}

}
