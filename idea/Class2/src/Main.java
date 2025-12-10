
import java.util.Scanner;
public class Main {
    public static void main() {
//        calc();
        bank();
        library();
    }
    public static void calc(){
        Scanner input  = new Scanner(System.in);
        System.out.print("First number: ");
        int number1 = input.nextInt();
        System.out.print("Second number: ");
        int number2 = input.nextInt();
        System.out.print("operator: ");
        String operator = input.next();

        Calculator calculator = new Calculator();
        switch(operator) {
            case "+":
                int addResult = calculator.add(number1, number2);
                System.out.println("result : " + addResult);
                break;
            case "-":
                int subResult = calculator.sub(number1, number2);
                System.out.println("result : " + subResult);
                break;
            case "*":
                int mulResult = calculator.mul(number1, number2);
                System.out.println("result : " + mulResult);
                break;
            case "/":
                double divResult = calculator.div(number1, number2);
                System.out.println("result : " + divResult);
                break;

        }

    }
    public static void bank() {
        Scanner input = new Scanner(System.in);
        System.out.print("Account number: ");
        int num = input.nextInt();
        System.out.print("balance: ");
        double balance = input.nextDouble();
        System.out.print("Name : ");
        String name = input.next();
        Bank bank = new Bank(num, balance, name);
        String cont ;
        input.nextLine();
        do {
            System.out.println("1. Add Money, 2. Remove Money, 3. Show balance");
            String  choice = input.nextLine();
            switch(choice) {
                case "1":
                    System.out.print("Money Amount : ");
                    bank.addMoney(input.nextDouble());
                    input.nextLine();
                    break;
                case "2":
                    System.out.print("Money Amount : ");
                    bank.subtractMoney(input.nextDouble());
                    input.nextLine();
                    break;
                case "3":
                    System.out.println("Account : " + bank.getAccountNumber() + ", Balance : " + bank.getBalance());
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.print("Do you want to continue? [Y/N]: ");
            cont = input.nextLine();
        }while (cont.equalsIgnoreCase("Y"));

    }
    public static void library(){
        Scanner input = new Scanner(System.in);
        Library lib = new Library();
        String cont;
        do {
            System.out.println("1. Add Book, 2. Add Author, 3. Remove Book, 4. Remove Author 5. Show Books");
            String  choice = input.nextLine();
            switch (choice) {
                case "1":
                    lib.addBook();
                    break;
                case "2":
                    lib.addAuthor();
                    break;
                case "3":
                    System.out.println("Enter Book Name: ");
                    lib.removeBook(input.nextLine());

                    break;
                case "4":
                    System.out.println("Enter Author Name: ");
                    lib.removeAuthor(input.nextLine());
                    break;
                case "5":
                    lib.showBooks();
                    break;


            }
            System.out.print("Do you want to continue? [Y/N]: ");
            cont = input.nextLine();
        }while (cont.equalsIgnoreCase("Y"));
    }
}
