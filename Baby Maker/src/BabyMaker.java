
public class BabyMaker {

	public static void main(String[] args) 
	{
		Baby myB1 = new Baby("Joe", 9.2, false);
		Baby myB2 = new Baby("Jose", 16.7, true);
		
		System.out.println("My first baby was " + myB1.name);
		if(myB2.isGirl) {
			System.out.println("pretty");
		}
		
		
		
		System.out.println("More changes");
myB1.barf();
myB1.laugh();
myB1.cry();
	}

}
