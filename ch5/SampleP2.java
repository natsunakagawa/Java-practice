import java.io.*;

class SampleP2
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�Q�̐�������͂��Ă��������D");


		BufferedReader br = 
		 new BufferedReader(new InputStreamReader(System.in));

		String str1 = br.readLine();
		String str2 = br.readLine();

		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		int copy;
		

		if(num1 == num2) {
			System.out.println("�Q�̐��͓����ł��D");
		}
	
		else if(num1 > num2) {
			System.out.println(num2 +"���"+ num1 +"�̂ق����傫���l�ł��D");
		}
		
		else {
			System.out.println(num1 +"���"+ num2 +"�̂ق����傫���l�ł��D");
		}
	}
}			