import p14.Car;

public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cars = new Car[2];
		
		car[0] = new Car();
		car[0].setCar(1234,20.5);

		car[1] = new RacingCar();
		car[1].setCar(4567,23.5);
		
		for(int i=0;i<cars.length;i++)
		{
			cars[i].show();
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
		
		public void setCar(int n,double g) {
			num = n ;
			gas = g ;
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
		
		public  RacingCar() {
			course =0;
			System.out.println("�Ͳ��F�ɨ�");
		}
		
		public void setCourse(int c)
		{
			course = c;
			System.out.println("�N�ɨ��s���]��"+course);
		}
	
		public void show() {
			System.out.println("�ɨ��������O"+num);
			System.out.println("�T�o�q�O"+gas);
			System.out.println("�ɨ��s���O"+course);
		}
	
	}
}
