//���W�N���X
class MyPoint
{
	private int x;
	private int y;
	
	public MyPoint()
	{
		x = 0;
		y = 0;
	}
	
	public MyPoint(int px, int py)
	{
		x = px;
		y = py;
	}

	public void setX(int px)
	{
		if(px >= 0 && px <= 100) x = px; else x = 0;
	}
	
	public void setY(int py)
	{
		if(py >= 0 && py <= 100) y =py; else y = 0;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
}

class SampleP1
{
	public static void main(String[] args)
	{
		MyPoint p1 = new MyPoint();
		p1.setX(5); p1.setY(10);
		
		int px1 = p1.getX();
		int py1 = p1.getY();

		System.out.println("x���W��"+ px1 +"��y���W��"+ py1 +"�ł��D");
		
		MyPoint p2 = new MyPoint(50, 100);
		
		int px2 = p2.getX();
		int py2 = p2.getY();
		
		System.out.println("x���W��"+ px2 +"��y���W��"+ py2 +"�ł��D");
	}
}