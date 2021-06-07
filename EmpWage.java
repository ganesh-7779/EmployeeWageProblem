
/**
 * @author Ganesh
 *
 */
/**
 * @author Ganesh
 *
 */

public class EmpWage{
	final static int PART_TIME = 1;
	final static int FULL_TIME=2;
	private int partTimeHrs;
	private int fullTimeHrs;
	private String Company;
	private int WAGE_PER_HRS;
	private int DAY_PER_MONTH;
	private  int MAX_HRS;

	public EmpWage (String Company, int fullTimeHrs, int partTimeHrs, int WAGE_PER_HRS, int DAY_PER_MONTH, int MAX_HRS)
	{
		this.Company=Company;
		this.partTimeHrs=partTimeHrs;
		this.fullTimeHrs=fullTimeHrs;
		this.WAGE_PER_HRS=WAGE_PER_HRS;	
		this.DAY_PER_MONTH=DAY_PER_MONTH;
		this.MAX_HRS=MAX_HRS;
	}
	
	/**
	 * Displays information about company
	 */
	
	private void dispCompanyInfo() {
		System.out.println("Company name   : "+Company);
		System.out.println("Full Day hours : "+fullTimeHrs);
		System.out.println("Part Day hours : "+partTimeHrs);
		System.out.println("Working days in month : "+DAY_PER_MONTH);
		System.out.println("Wage Per Hr : "+WAGE_PER_HRS);
	}
	
	/**
	 * checking for employee is present or absent
	 */
	private void Attaindence() {
			
			int fullTime = 1;
			double empCheck= Math.floor(Math.random()*10)%2;
				if ( fullTime == empCheck )
					System.out.println("emp is present");

				else
					System.out.println("emp is absent");
	}
	/**
	 * @return daily employee wage
	 */
	private double CalculateDailyWage() {
		int empCheck= (int) Math.floor(Math.random()*10)%2+1;
		double empWage=0;
		switch (empCheck) {
		
		case FULL_TIME:
			empWage=fullTimeHrs*WAGE_PER_HRS;
			break;
		case PART_TIME:
			empWage=partTimeHrs*WAGE_PER_HRS;
			break;
		}	
		
		return empWage;	
	}
	private double monthlyWage() {
		
		int empCheck= (int) Math.floor(Math.random()*10)%2+1;
		double monthlyWage=0;
		switch (empCheck) {
		
		case FULL_TIME:
			monthlyWage=fullTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
			break;
		case PART_TIME:
			monthlyWage=partTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
			break;
		}
		   return monthlyWage;
	}
	/**
	 * till max condition reach
	 * @return maximum wage
	 */
	private double maxEmpWage() {
		
		int empCheck= (int) Math.floor(Math.random()*10)%2+1;
		double maxWage=0;
		int countHrs=0;
		int countDay=0;
		while (countHrs<MAX_HRS && countDay<DAY_PER_MONTH) {
			switch (empCheck) {
			
			case FULL_TIME:
				maxWage=fullTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
				maxWage+=maxWage;
				countHrs+=8;
				countDay++;
				
				break;
			case PART_TIME:
				maxWage=partTimeHrs*WAGE_PER_HRS*DAY_PER_MONTH;
				maxWage+=maxWage;
				countHrs+=4;
				countDay++;
				break;
			}
		}
		
		return maxWage;
	}
/**
 * @param args
 */
/**
 * @param args
 */
public static void main (String []args) {
		
		System.out.println("welcome to employeewage");
		EmpWage Dmart =new EmpWage("DMart",8,4,20,20,100);
		
		Dmart.Attaindence();
		Dmart.CalculateDailyWage();
		Dmart.monthlyWage();
		Dmart.maxEmpWage();
		Dmart.dispCompanyInfo();
		EmpWage Reliance = new EmpWage("Reliance",12,6,25,26,150);
		Reliance.Attaindence();
		Reliance.CalculateDailyWage();
		Reliance.monthlyWage();
		Reliance.maxEmpWage();
		Reliance.dispCompanyInfo();

		}
}