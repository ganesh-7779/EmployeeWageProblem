
public class EmpWage {
<<<<<<< HEAD
	
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
=======


	public static void main (String []args) {
>>>>>>> 0851c72631f1cf21703859cfb47b3d9eee7c9ce4
		
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
			
<<<<<<< HEAD
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
=======
			//Daily wage calculation
			
			int WagePerHour = 20;
			int FullDayHours = 8;
			int PartTimeHours = 4;
			int PartTime = 1;
			int MonthDay= 20;
			int Month = 0;
			if(fullTime == empCheck)
			
			System.out.println("DailyWage : " + WagePerHour*FullDayHours);
			
			else
				System.out.println("No Daily Wage, Employee is Absend");
			
			if (PartTime == empCheck)
				System.out.println("Part Time Wage :" + PartTimeHours*WagePerHour);
			else
				
				System.out.println("No Part Time  Wage, Employee is Absend");
>>>>>>> 0851c72631f1cf21703859cfb47b3d9eee7c9ce4
			
			case FULL_TIME:
				maxWage=FULL_TIME*WAGE_PER_HRS*DAY_PER_MONTH;
				maxWage+=maxWage;
				countHrs+=8;
				countDay++;
				
<<<<<<< HEAD
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
=======
				System.out.println("Month Wage : " + WagePerHour*FullDayHours*MonthDay);

			else
				System.out.println("No Monthly  Wage, Employee is Absend");
						
				final int IS_PART_TIME = 1;
				final int IS_FULL_TIME = 2;
			final int EMP_RATE_PER_HOURS = 20;
			final int MAX_HRS_IN_MONTH=100;
				int emphours=0;
				int totalEmpWage=0;
				int totalEmpHrs=0;
				int totalWorkingDay=0;
				final int NUM_OF_WORK_DAY=2;
				
				
				while (totalEmpHrs <=MAX_HRS_IN_MONTH && totalWorkingDay < NUM_OF_WORK_DAY) {
					totalWorkingDay++;
				}
				
				for (int day = 0; day < NUM_OF_WORK_DAY; day++) {
	int empCheck2 =(int) Math.floor(Math.random()*10%3);
				
			switch (empCheck2) {
			case IS_PART_TIME:
				emphours=4;
				break;
			case IS_FULL_TIME:
				emphours=8;
				break;
				default:
					emphours=0;
					
			}
					int empWage = emphours*EMP_RATE_PER_HOURS;
                    totalEmpWage +=  empWage;
		            totalEmpHrs += emphours;
		            System.out.println("Day#:" + totalWorkingDay +  "emp hrs  "  + emphours);
		            
				}
			        System.out.println("Emp Wage : " + emphours*EMP_RATE_PER_HOURS);
				
				     System.out.println("Total Emp Wage :" + totalEmpWage);
			
			
				}
		}
	
>>>>>>> 0851c72631f1cf21703859cfb47b3d9eee7c9ce4

