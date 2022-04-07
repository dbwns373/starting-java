package free_method;

class Calculator {

	int left, right;
	
	public Calculator(int left, int right)
	{
		this.left = left;
		this.right = right;
		
	}
	
	
	public int sum()
	{
		return this.left + this.right;
	}
	
	public int avg()
	{
		return (this.left + this.right) /2;
	}
	
}
	

