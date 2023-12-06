public class Main {
    //recursion is where method calls itself
    /*used static so that at main method will not create object
    because static mtd can b accessed without creating class object
     */

    public static int sum(int k) {
        if (k == 0) {
            return 1;
        } else {
            return k * sum(k - 1);
        }
    }

    public static void main(String[] args) {
        /*Main.sum(5) only used instead of Main main = new Main();
        main.sum(5).this is beacuse of use of static keyword
         */
        System.out.println("factorial of 5 is :" + Main.sum(5));
    }
}