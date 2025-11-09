import java.util.Scanner;

public class Trial {
    static void main(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N: ");
        int N = input.nextInt();

        int sum = TillInt(N);
        System.out.println(sum);
        System.out.print("Enter 4 digit number: ");
        int number = input.nextInt();

        int answer = multipication(number);
        System.out.println(answer);
    }
    static int TillInt(int N){
        int sum = 0;
        for (int i = 0; i < N; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        return sum;
    }
    static int multipication(int n){
        int answer = 1;
        for (int i = 1; i <= 4; i++){
            answer = answer * (n % 10);
            n /= 10;
        }
        return answer;
    }
}
