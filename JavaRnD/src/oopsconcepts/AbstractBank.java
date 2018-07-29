package oopsconcepts;

public abstract class AbstractBank
{
     //partial abstraction   
	//abstract and non abstract method use here
	//hiding the implementation logic ----called abstraction
	//
	
	//abstract method
	public abstract  void loan();
	
	//non abstract method
	public void credit(){
		
		System.out.println("Inside Bank Credit method");
	}
	
     public void debit(){
		
		System.out.println("Inside Bank Debit method");
	}

    public void janDhanAccount(){
	
	System.out.println("Inside Bank JanDhanAccount method");
    }
	
	
        
        
        
        
}
