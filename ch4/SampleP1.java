import java.io.*;

class SampleP1
{
	public static void main(String[] args)throws IOException
	{
		System.out.println("�����`�̕ӂ̒�������͂��Ă��������D");
		
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);

		System.out.println("�����`�̖ʐς�"+ num*num +"�ł��D");
	}
}

		