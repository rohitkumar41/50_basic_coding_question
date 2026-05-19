import java.util.Scanner;
public class SumOfDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers for which you want the sum");
        int n = sc.nextInt();
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
