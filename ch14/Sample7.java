import java.io.*;

class Sample7
{
	public static void main(String[] args)
	{
		try{
			PrintWriter pw = new PrintWriter
			(new BufferedWriter(new FileWriter("test1.txt")));

			pw.println("Hello!");
			pw.println("Goodbye!");
			System.out.println("�t�@�C���ɏ������݂܂����D");
		
			pw.close();
		}
		catch(IOException e) {
			System.out.println("���o�̓G���[�ł��D");
		}
	}
}