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
	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
}

//���[�V���O�J�[�N���X
class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����D");
	}
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�R�[�X�ԍ���"+ course +"�ɂ��܂����D");
	}
	public void show()
	{	
		System.out.println("���[�V���O�J�[�̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
		System.out.println("�R�[�X�ԍ���"+ course +"�ł��D");
	}
}

class Sample5
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new RacingCar();
		
		car1.setCar(1234, 20.5);
		
		car1.show();
	}
}