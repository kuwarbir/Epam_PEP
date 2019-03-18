package epam_pep;

public class Calculator {

	int multiply(int x,int y)
	{
		return x*y;
	}
	int add(int x,int y)
	{
		return x+y;
	}
	double divide(double x,double y)
	{
		if(x!=0||y!=0)
			return x/y;
		else
		{
			throw new ArithmeticException("Cannot divide by zero");
		}
	}

}
