public class Main {
    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.sum(10,10));
        System.out.println(main.sum(10.4,20.5));
    }
}