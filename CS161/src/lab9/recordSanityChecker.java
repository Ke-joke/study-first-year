package CS161.src.lab9;

import java.io.*;

public class recordSanityChecker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream f = new FileInputStream("C:/Users/lkj/Desktop/introtuce to computer science lab/StudentScore.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(f));
		String s1;
		while((s1=br.readLine())!=null) {
			String[] s2 = s1.split("	| ");
			String s3 = s2[0];
			if(s2.length==2&&((s3.substring(3).length())!=6||!s3.substring(0,3).equals("T00")||Integer.parseInt(s2[1])<0||Integer.parseInt(s2[1])>100)) {
				System.out.println(s1);
			}else if(s2.length!=2) System.out.println(s1);
		}
		br.close();
		f.close();
	}

}