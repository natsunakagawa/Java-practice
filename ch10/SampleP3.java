import java.io.*;

class SampleP3
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�������Q���͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		int ans = Math.min(num1, num2);

		System.out.println(num1 +"��"+ num2 +"�̂����������ق���"+ ans +"�ł��D");
	}
}