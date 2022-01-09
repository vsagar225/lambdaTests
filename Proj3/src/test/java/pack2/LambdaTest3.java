package pack2;

interface A
{
	void show(int i);  // all methods are public by default
}

//class xyz implements A{
//	public void show()
//	{
//		System.out.println("Hello");
//	}
//}

public class LambdaTest3 {
	
	public static void main(String[] args)
	{
		A obj;
		
		//method 1
//		obj = new xyz();
//		obj.show();
		/////////////////////////////////
	
		
		//2nd method   // method inside a block is called a class block , this is called anonymous inner class
//		obj = new A()  
//				{
//					public void show()
//					{
//						System.out.println("Hello 2");
//					}
//				};
//				
//		obj.show();
		
		// we dont need return type, parameters are written twice.
		
		//obj = () -> System.out.println("Hello");  // zero param and no inner class -> one level
		
		obj = (i) -> System.out.println("Hello " + i);   //2nd level with single param.
			
		
		obj.show(10);
		
		
		
		
	}

}
