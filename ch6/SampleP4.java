import java.io.*;

class SampleP4
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("2�ȏ�̐�������͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		if(num < 1) {
			System.out.println("2�ȏ�̐�������͂��Ă��������D");
		}

		else {
			for(int i=2; i<=num; i++) {
				if(i == num) {
					System.out.println(num +"�͑f���ł��D");
				}
				else if(num % i == 0) {
					System.out.println(num +"�͑f���ł͂���܂���D");
					break;
				}
			}
		}
	}	
}