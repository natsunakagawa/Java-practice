import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("テストの点数を入力してください．(0で終了)");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in)); 

		int sum = 0;
		int res = 0;　

		do {
			
			
			String str = br.readLine();
			res = Integer.parseInt(str);
			
			sum += res;

		}while(res != 0);

		System.out.println("テストの合計点は"+ sum +"です．");
	}
}