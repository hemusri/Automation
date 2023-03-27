package careJavaPrograms;
public class BudgetDemo
{
	/*void houseCharges()
	{
		int rent = 1000;
		int childFee = 2000;
		int totalCharges = rent +childFee;
		System.out.println(totalCharges);
	}*/	
	int houseCharges2()
	{
		System.out.println("houseCharges2 is invoking");
		int rent = 1000;
		int childFee = 2000;
		int totalCharges = rent + childFee;
		return totalCharges;
	}
	public static void main(String[] args)
	{
		int grossSalary = 10000;
		System.out.println(grossSalary);
		
		BudgetDemo bd1 = new BudgetDemo();
		
		int charges = bd1.houseCharges2();
		
		System.out.println(charges);
		
		int netSalary = grossSalary-charges;
		System.out.println(netSalary);
		
		int taxCal = charges*30;
		System.out.println(taxCal);		
	}
}