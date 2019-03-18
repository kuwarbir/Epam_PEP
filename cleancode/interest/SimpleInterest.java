package epam_pep;

public class SimpleInterest {

	double si(double p, double rate,double time)
	{
		return (p*(rate/100)*time);
	}
 double ci(double p, double rate,int time)
	{
	return  p * 
             (Math.pow((1 + rate / 100), time)); 
	}
}
