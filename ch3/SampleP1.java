import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("���Ȃ��͉��΂ł���?");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println("���Ȃ���"+ str +"�΂ł�.");
	}
}