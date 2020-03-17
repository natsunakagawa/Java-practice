//�̂���̃C���^�[�t�F�C�X
interface iVehicle
{
	void show();
}

//�ԃN���X
class Car implements iVehicle
{
	private int num;
	private double gas;
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�["+ num +"�K�\������"+ gas +"�̎Ԃ��쐬���܂����D");
	}
	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��"+ num +"�ł��D");
		System.out.println("�K�\�����ʂ�"+ gas +"�ł��D");
	}
}

//��s�@�N���X
class Plane implements iVehicle
{
	private int flight;

	public Plane(int f)
	{
		flight = f;
		System.out.println("��"+ flight +"�̔�s�@���쐬���܂����D");
	}
	public void  show()
	{
	System.out.println("��s�@�̕ւ�"+ flight +"�ł��D");
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		iVehicle[] ivc;
		ivc = new iVehicle[2];
	
		ivc[0] = new Car(1234,20.5);
		
		ivc[1] = new Plane(232);

		for(int i=0; i<ivc.length; i++) {
			ivc[i].show();
		}
	}
}
