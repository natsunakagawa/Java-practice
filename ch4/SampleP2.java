import java.io.*;

class SampleP2
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�O�p�`�̍����ƒ�ӂ�����͂��Ă��������D");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		double num1 = Double.parseDouble(str1);
		double num2 = Double.parseDouble(str2);

		System.out.println("�O�p�`�̖ʐς�"+ (num1*num2)/2 +"�ł��D");
	}
}

		