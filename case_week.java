import java.util.Scanner;
class case_week
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int week; String day;
		week=s.nextInt();
		switch(week)
		{
			case 1:
				day="sunday";
				break;
			case 2:
				day="monday";
				break;
			case 3:
				day="Tues";
				break;
			case 4:
				day="wed";
				break;
			case 5:
				day="thurs";
				break;
			case 6:
				day="fri";
				break;
			case 7:
				day="satur";
				break;
			default:
				day="Ivalid";
				break;
			}
		System.out.println(day);
	}
}
