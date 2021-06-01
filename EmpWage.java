
public class EmpWage {


	public static void main (String []args) {
		
		int fullTime = 1;
		double empCheck= Math.floor(Math.random()*10)%2;
			System.out.println("Welcome to empolyee wage Computation");
			if ( fullTime == empCheck )
				System.out.println("Emp is Present");
			else
				System.out.println("emp is absent");
			
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
			
			if(Month == empCheck)
				
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
	

