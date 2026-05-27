public class Main {
    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        do {
            System.out.println("Number: " + i);

            sum = sum + i;

            i++;

        } while (i <= 10);

        System.out.println("Total Sum = " + sum);
    }
}