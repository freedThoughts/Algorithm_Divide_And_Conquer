package problemSet_1;

public class DivideAndConquer implements IDivideAndConquer{

	@Override
	public int power(int x, int y){
		if(y == 0)
			return 1;
		
		// Dividing problem into subproblem by dividing y by 2
		int value = power(x, y/2);
		
		boolean isEven = y % 2 == 0;
		if(isEven)
			return value * value;
		else
			return x * value * value;
	}
	
	public static void main(String[] arg){
		
		DivideAndConquer object = new DivideAndConquer();
		
		int value1 = object.power(2, 2);
		System.out.println(value1);
	}

}
