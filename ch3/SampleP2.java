import java.io.*;

class SampleP2
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�~�����̒l�͂����ł����H");
		
		BufferedReader br = 
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println("�~�����̒l��"+ str +"�ł��D");
	}
}