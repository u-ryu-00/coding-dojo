import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        System.out.println("연도: " + year);
        boolean rule1 = year % 4 == 0;
        boolean rule2 = year % 100 != 0;
        boolean rule3 = year % 400 == 0;

        if(year>=1900 && year<=2022){
            if (rule1 && rule2 || rule3){
                System.out.println("ture");
            }
            else{
                System.out.println("false");
            }
        }

    }
}

