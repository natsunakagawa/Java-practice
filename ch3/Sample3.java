import java.io.*;

class Sample3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("���������͂��Ă��������D");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		System.out.println(str +"�����͂���܂����D");
	}
}