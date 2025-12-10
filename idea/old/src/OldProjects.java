import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OldProjects {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        DaysOfWeekClass1(input.nextInt());
    }
    public static void DaysOfWeekClass1(int DayInNumber){
        String[] DaysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        if (DayInNumber > 7 ){
            DayInNumber = 7;
        } else if (DayInNumber < 1) {
            DayInNumber = 1;
        }

        System.out.println(DaysOfWeek[DayInNumber - 1]);
    }
    public static void DivideBy7(){
        Scanner input = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 4; i++){
            int number = input.nextInt();
            if(number%7 == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
    public static void Plus60(){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 4; i++){
            int number = input.nextInt();
            if (number >= 60){
                sum += number;

            }
        }
        System.out.println(sum);
    }
    public static void  OddNumbers(){
        Scanner input = new Scanner(System.in);
        if (input.nextInt()%2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");

        }
    }
    public static void TillN(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(i);

        }
    }
    public static void TillNOdd(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    public static void PrimeNumber(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }

        }
        System.out.println(isPrime ? "Yes" : "No");
    }
    public static void CommonDivider(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int smaller = (Math.min(a, b));
        for(int i = smaller; i > 0; i--){
            if(a % i == 0 && b % i == 0){
                System.out.println(i);
                break;
            }
        }
    }
    public static void HowManyNumbers(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int count = 0;
        while(number != 0){
            number /= 10;
            count++;

        }
        System.out.println(count);

    }
    public static void Matrix(){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int[][]arr = new int[x][y];

        for(int i = 0; i < x; i++){

            for(int j = 0; j < y; j++){
                arr[i][j] = 0;
            }

        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void SumOfDividedby5(){
        int[][] arr = new int[5][5];
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = (int)( Math.random() * 10);

            }
        }
        int sum = 0;
        for(int[] i : arr){
            for(int j : i){
                if(j % 5 == 0){
                    sum += j;
                }

            }
        }
        System.out.println("sum :" +sum);
    }
    public static void DiagonalChoice(){
        int[][] arr = new int[5][5];
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = (int) (Math.random() * 10);

            }
        }
        for (int y = 1; y <= 5; y++){
            for (int x = 1; x <= 5; x++){
                if(x == y){
                    arr[x][y]= 0;
                }

            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
    public static void  DiagonalChoiceReverse (){
        int[][] arr = new int[5][5];
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = (int)( Math.random() * 10);

            }
        }
        for (int y = 1; y <= 5; y++){
            for (int x = 1; x <= 5; x++){
                if(x == arr.length - y - 1){
                    arr[x][4 - y]= 0;
                }

            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void MultipyEdges(){
        int[][] arr = {{2, 1, 1}, {1, 2, 1}, {1, 1, 1}};
        int answer = 1;
        for (int y = 0; y < arr.length; y++){
            for(int x = 0; x < arr[y].length; x++){
                if(x == 0 || x == arr.length - 1 || y == 0 || y == arr.length - 1){
                    answer *= arr[y][x];
                }
            }
        }
        System.out.println(answer);
    }
    public static void Dividable(){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i] = input.nextInt();

        }
        System.out.println("divided by :");
        int divider = input.nextInt();
        int count = 0;
        for(int i : arr){
            if(i % divider == 0){
                count++;
            }

        }
        System.out.println(count);
    }
    public static void MostRepeatedNumber() {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int)(Math.random() * 10); // 0-9
        }

        int[] freq = new int[10]; // for numbers 0-9

        for (int n : arr) {
            freq[n]++;
        }

        int bestNum = 0;
        int bestCount = 0;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > bestCount) {
                bestCount = freq[i];
                bestNum = i;
            }
        }

        System.out.println("Most repeated number: " + bestNum);
    }

    public static void SumOfEven(){
        int[][] arr = new int[5][5];
        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= 5; j++){
                arr[i][j] = (int) (Math.random() * 10);

            }
        }
        int sum = 0;
        for (int[] y : arr){
            for (int n : y){
                if(n %2 == 0){
                    sum = sum + n;
                }

            }
        }
        System.out.println(sum);
    }
}