import java.io.*;

class Sample8
{
	public static void main(String[] args)
	{
		try {
			BufferedReader br = 
			 new BufferedReader(new FileReader("test1.txt"));
			
			String str1 = br.readLine();
			String str2 = br.readLine();

			System.out.println("�t�@�C���ɏ������܂�Ă���2�̕������");
			System.out.println(str1 +"�ł��D");
			System.out.println(str2 +"�ł��D");

			br.close();
		}
		catch(IOException e) {
			System.out.println("���o�̓G���[�ł��D");
		}
	}
}