public class Main {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            System.out.println("Number: " + i);

            sum = sum + i;

            i++;
        }

        System.out.println("Total Sum = " + sum);
    }
}