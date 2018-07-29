package oopsconcepts;

public class TestBank
{

	public static void main(String[] args)
	{
		HDFCBANK hd=new HDFCBANK();
		//access all method of parrent class
		hd.loan();
		hd.agloan();
		hd.credit();
		hd.debit();
		hd.janDhanAccount();

	}

}