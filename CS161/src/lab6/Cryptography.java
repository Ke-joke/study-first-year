package CS161.src.lab6;

public class Cryptography {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		String s1 =new String("p apgp roziopc cjfl spgn zun zo czon ehpffnf lsn upcn zb lsn fzjoen bkhn puy lsn upcn zb lsn ehpff cjfl qn lsn fpcn kb mn mpul cptn p apgp roziopc nvnejlpqhn mn  cjfl rozgkyn p cpku cnlszy lsn cpku cnlszy kf pu kuykeplzo puy p fkiupljon bzo apgp gkoljph cpeskun lz bkuy lsn nulox rzkul zb lsn roziopc bzo nvnejlkzu");
		s1=s1.toUpperCase();
		String lex =new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		String keys=new String("PQEYNBISKATHCUZRDOFLJGMVXW");
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')	System.out.print(s1.charAt(i)+"");
			else
			{
				for(int n=0;n<lex.length();n++)
				{
					if(s1.charAt(i)==keys.charAt(n)) System.out.print((lex.charAt(n)+"").toLowerCase());
				}
			}
		}
	}
	
}
