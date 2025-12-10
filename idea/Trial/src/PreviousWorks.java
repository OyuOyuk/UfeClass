import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class PreviousWorks {
    static void main(){
        PreviousWorks();
    }
    static void PreviousWorks() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = input.nextInt();
        System.out.print(DayToName(day));

    }
    static String DayToName(int Day){
        String[] DaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",  "Sunday"};
        if(Day <= 1){
            Day = 1;
        }else if(Day >= 7){
            Day = 7;
        }
        return DaysOfWeek[Day - 1];
    }
    static int DivideBySeven(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i = 1; i <= 4; i++){
            int number = input.nextInt();
            if(number % 7 == 0){
                count++;
            }
        }
        return count;
    }
}
