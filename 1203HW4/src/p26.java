
public class p26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i=0;i<cars.length;i++)
		{
			Class cl = cars[i].getClass();
			System.out.println("��"+(i+1)+"�Ӫ������O�O"+cl);
		}
	}

}
