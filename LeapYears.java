import java.util.Scanner;
public class LeapYears {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check whether it is leap year or not");
        int year = sc.nextInt();
        if((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
