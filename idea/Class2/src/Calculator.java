public class Calculator {
    public Calculator() {

    }
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("not possible");
            return 0.0;
        }
        return (double)  a / b;
    }
}
