//�ԃN���X
class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����D");
	}
	public void setCar(int n, double g)
	{
 		num = n;
		gas = g;
		System.out.println("�i���o�[��"+ num +"�ɃK�\�����ʂ�"+ gas +"�ɂ��܂����D");
	}
	public String toString()
	{
		String str = "�i���o�["+ num +"�K�\������"+ gas +"�̎Ԃł��D";
		return str;
	}
}

class SampleP1
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		car1.setCar(1234, 20.5);

		System.out.println(car1);
		System.out.println("�{���M�m�[����CM!");
	}
}