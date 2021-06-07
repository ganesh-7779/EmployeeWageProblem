public class WageCalculator {
	
	final static int WAGE_PER_HRS = 20;
	final static int FULL_DAY_HRS = 8;
	final static int PART_TIME_HRS = 4;
	final static int FULL_TIME_HRS = 8;
	final static int PART_TIME = 1;
	final static int FULL_TIME=2;
	final static int DAY_PER_MONTH=20;
	final static int MAX_HRS=100;
	
	/**
	 * checking for employee is present or absent
	 */
	private static void Attaindence() {
		
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
	private static double CalculateDailyWage() {
		int empCheck= (int) Math.floor(Math.random()*10)%2+1;
		double empWage=0;
		switch (empCheck) {
		
		case FULL_TIME:
			empWage=FULL_TIME_HRS*WAGE_PER_HRS;
			break;
		case PART_TIME:
			empWage=PART_TIME_HRS*WAGE_PER_HRS;
			break;
		}	
		
		return empWage;	
	}	
	/**
	 * @return employee monthly wage
	 */
	private static double monthlyWage() {
		
			int empCheck= (int) Math.floor(Math.random()*10)%2+1;
			double monthlyWage=0;
			switch (empCheck) {
			
			case FULL_TIME:
				monthlyWage=FULL_TIME*WAGE_PER_HRS*DAY_PER_MONTH;
				break;
			case PART_TIME:
				monthlyWage=PART_TIME_HRS*WAGE_PER_HRS*DAY_PER_MONTH;
				break;
			}
			return monthlyWage;
		}
	/**
	 * till max condition reach
	 * @return maximum wage
	 */
	private static double maxEmpWage() {
		
		int empCheck= (int) Math.floor(Math.random()*10)%2+1;
		double maxWage=0;
		int countHrs=0;
		int countDay=0;
		while (countHrs<MAX_HRS && countDay<DAY_PER_MONTH) {
			switch (empCheck) {
			
			case FULL_TIME:
				maxWage=FULL_TIME*WAGE_PER_HRS*DAY_PER_MONTH;
				maxWage+=maxWage;
				countHrs+=8;
				countDay++;
				
				break;
			case PART_TIME:
				maxWage=PART_TIME_HRS*WAGE_PER_HRS*DAY_PER_MONTH;
				maxWage+=maxWage;
				countHrs+=4;
				countDay++;
				break;
			}
		}
		
		return maxWage;
	}
	public static void main (String []args) {
		
		System.out.println("welcome to employeewage");
		Attaindence();
		System.out.println(CalculateDailyWage());
		System.out.println(monthlyWage());
		System.out.println(maxEmpWage());

		}
	}

