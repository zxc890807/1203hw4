
public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RacingCar rccar1 = new RacingCar();
		
		rccar1.newShow();
	}
}
	
	class Car
	{
		protected int num;
		protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show() {
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}
	
	class RacingCar extends Car
	{
		private int course;
		
		public RacingCar()
		{
			course = 0 ;
			System.out.println("�Ͳ��F�ɨ�");
		}
		
		public void setCourse() 
		{
			course = c;
			System.out.println("�N�ɨ��s���]��"+course);
		}
		
		public void newShow() {
			System.out.println("�ɨ��������O"+num);
			System.out.println("�T�o�q�O"+gas);
			System.out.println("�ɨ��s���O"+course);

		}
	}
	
