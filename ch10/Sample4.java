import java.io.*;

class Sample4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("���������͂��Ă��������D");

		BufferedReader br = 
		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();

		System.out.println("�ǉ����镶������͂��Ă��������D");

		String str2 = br.readLine();

		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);

		System.out.println(str1 +"��"+ str2 +"��ǉ������"+ sb +"�ł��D");
	}
}