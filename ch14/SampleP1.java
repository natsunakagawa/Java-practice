import java.io.*;

class SampleP1
{
	public static void main(String[] args)
	{
		try {
			PrintWriter pw = new PrintWriter
			 (new BufferedWriter(new FileWriter("testP1.txt")));

			pw.println("A long time ago,");
			pw.println("There was a little girl.");
			
			pw.close();
		}
		catch(IOException e) {
			System.out.println("���o�̓G���[�ł��D");
		}
	}
}