package epam_pep;

public class ConstructionCost {
	public static int cost( String material) 
	{
		int rate = 0;
		
 if( material=="standard")
 {
	 rate=1200;
 }
 else if( material==" abovestandard")
 {
	 rate=1500;
 }
 else if( material==" highstandard")
 {
	
		 rate=1800;
 }
	 else if(material=="highstandardautomated")
	 {
		 rate=2500;
	 }
 
 return rate;
	}
 
}
