import java.io.*;

class SampleP2
{
	public static void main(String[] args) throws IOException
	{	
		System.out.println("���������͂��Ă��������D");
	
		BufferedReader br =
	 	 new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();

		System.out.println("a�̑}���ʒu�𐮐��œ��͂��Ă��������D");

		String str2 = br.readLine();
		int num = Integer.parseInt(str2);

		char ch = 'a';
		
		StringBuffer sb = new StringBuffer(str1);
		sb.insert(num, ch);

		System.out.println(sb +"�ɂȂ�܂����D");
	}
}
		
		