class CarException extends Exception
{
}
//�ԃN���X
class Car
{
	private int num;
	private double gas;

	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����D");
	}
	public void setCar (int n, double g) throws CarException
	{
		if(g < 0) {
			CarException e = new CarException();
			throw e;
		}
		else {
			num = n;
			gas = g;
			System.out.println("�i���o�[��"+ num +"�ɃK�\�����ʂ�"+ gas +"�ɂ��܂����D");
		}
	}
	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
}

class Sample5
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		try {
			car1.setCar(1234, -10.0);
		}
		catch(CarException e) {
			System.out.println(e +"�����o����܂����D");
		}
		car1.show();
	}
}
