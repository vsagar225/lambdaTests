package pack2;

import java.util.Arrays;
import java.util.List;

public class ForLambdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		
		for (int i=0;i<values.size();i++)
		{
			System.out.println("values in for loop "+values.get(i));
			
		}
		

		for (int i : values)
		{
			System.out.println("values in 2nd for loop "+i);
			
		}		
		values.forEach(i -> System.out.println(i));
	}

}
