import java.io.*;

class SampleP1
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("�T�l�̃e�X�g�̓_������͂��Ă��������D");

		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		int [] test = new int[5];
		
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}

		int max = test[0];

		for(int s=1; s<test.length; s++) {
			if(max < test[s]) {
				max = test[s];
			}
		}

		for(int j=0; j<test.length; j++) {
			System.out.println( (j+1) +"�Ԗڂ̐l�̓_����"+ test[j] +"�ł��D");
		}
		
		System.out.println("�ō��_��"+ max +"�ł��D");
	}
}			 