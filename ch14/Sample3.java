class Sample3
{
	public static void main(String[] args)
	{
		try {

			int[] test;
			test = new int[5];
	
			System.out.println("test[10]�ɒl�������܂��D");

			test[10] = 80;
			System.out.println("test[10]��80�������܂����D");
		
		}	
		catch(ArrayIndexOutOfBoundsException e){
		
			System.out.println("�z��̗v�f�𒴂��Ă��܂��D");
		}
		finally {
			System.out.println("�Ō�ɕK�����̏��������܂��D");
		}			
		System.out.println("�����I�����܂���.");
	}
}	