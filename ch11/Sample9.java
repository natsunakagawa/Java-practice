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
}

class Sample9
{
	public static void main(String[] args)
	{
		Car[] cars;
		cars = new Car[2];

		cars[0] = new Car();
		cars[1] = new RacingCar();

		for(int i=0; i<cars.length; i++) {
			Class c1 = cars[i].getClass();
			System.out.println((i+1) +"�Ԗڂ̃I�u�W�F�N�g�̃N���X��"+ c1 +"�ł��D");
		}
	}
}