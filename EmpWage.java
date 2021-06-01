
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
			int MaxHours = 0;
			int WorkingHrs = 0;
			int month = Month + 1;
			int maxHours = MaxHours + WorkingHrs ;
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
			
			if(maxHours == 100 && month == 20 )	{
				System.out.println("Monthly Wage : " + MonthDay*MaxHours*WagePerHour);
			break;
			
			else
				System.out.println("No Monthly wage,employee is absent" + Month);
		
		}
	}
}
