import java.io.*;

class SampleP2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("２つの整数を入力してください．");


		BufferedReader br = 
		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		int copy;
		

		if(num1 == num2) {
			System.out.println("２つの数は同じです．");
		}
	
		else if(num1 > num2) {
			System.out.println(num2 +"より"+ num1 +"のほうが大きい値です．");
		}
		
		else {
			System.out.println(num1 +"より"+ num2 +"のほうが大きい値です．");
		}
	}
}			