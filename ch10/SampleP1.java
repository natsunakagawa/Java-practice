import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("���������͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringBuffer sb = new StringBuffer(str);
		sb.reverse();

		System.out.println(str +"���t���ɂ����"+ sb +"�ł��D");
	}
}