import java.util.Scanner;
public class CheckPrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whether a prime number or not");
        int n = sc.nextInt();
        boolean Isprime = true;
        if(n<=1){
            Isprime = false;
        }else{
            for(int i = 2; i<=n/2;i++){
                if(n%i==0){
                    Isprime = false;
                    break;
                }
            }
        }
        if(Isprime){
            System.out.println(n+ " is Prime number");
        }else{
            System.out.println(n+ " is not a Prime number");
        }
    }
}