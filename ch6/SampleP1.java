import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�e�X�g�̓_������͂��Ă��������D(0�ŏI��)");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in)); 

		int sum = 0;
		int res = 0;�@

		do {
			
			
			String str = br.readLine();
			res = Integer.parseInt(str);
			
			sum += res;

		}while(res != 0);

		System.out.println("�e�X�g�̍��v�_��"+ sum +"�ł��D");
	}
}