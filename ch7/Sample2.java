import java.io.*;

class Sample2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
		 new BufferedReader(new InputStreamReader(System.in));

		int [] test = new int[5];
		System.out.println( test.length +"�l�̓_������͂��Ă��������D");
		
		for(int i=0; i<test.length; i++) {
			String str = br.readLine();
			test[i] = Integer.parseInt(str);
		}
		
		for(int s=0; s<test.length-1; s++) {
			for(int t=s+1; t<test.length; t++) {
				if(test[t] > test[s]) {
					int tmp = test[t];
					test[t] = test[s];
					test[s] = tmp;
				}	
			}
		}

		for(int j=0; j<test.length; j++) {
			System.out.println( (j+1) +"�Ԗڂ̐l�̓_����"+ test[j] +"�ł��D");
		}
	}
}