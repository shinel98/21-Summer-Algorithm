package week4;


//5-4
/*
public class DayOfTheYear {

}
class Solution() {
	public  int dayOfYear(String date) {
			String[] s = date.split("-");
			int[] ms = {31,28,31,30,31,30,31,31,30,31,30,31};
			int y = Integer.parseInt(s[0]);
			int m = Integer.parseInt(s[1]);
			int d = Integer.parseInt(s[2]);
			if(y % 4 == 0 && y %100 != 0 ||y % 400 == 0)ms[1]=29;
			int days = 0;
			for(int i = 0;i < m - 1; i++) {
				days+=ms[i];
			}
			days+=d;
			return days;
	
	}
}*/

