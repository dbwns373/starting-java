package free_method;

public class Test3 {

	public static void main(String[] args) {
		
		
		System.out.print("----");
		System.out.println("---");
		System.out.print("|");
		System.out.print("33");
		System.out.print("|");
		System.out.print("22");
		System.out.print("|");
		System.out.print("11");
		System.out.println("|");
		System.out.print("----");
		System.out.print("---");
		System.out.println("---");
		
		int[] num = new int[5];
		for(int i = 0 ; i<num.length ; i++)
			num[i] = i;
		if(num[0] < 10)
			System.out.print("---");
		else
			System.out.print("----");
		
		for(int i = 0 ; i < num.length;i++)
		{
			if(num[i] < 10)
				System.out.print("--");
			else
				System.out.print("---");
			
		}
		System.out.println("");
		
		for(int i = 0 ; i < num.length ; i++)
		{
			System.out.print("|");
			System.out.print(num[i]);
		}
	}

}
