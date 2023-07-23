import java.util.Scanner;

public class Vstup {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        String s = vstup.nextLine();
        System.out.println("You entered string " + s);

        int a = vstup.nextInt();
        System.out.println("You entered integer " + a);

        boolean w = vstup.nextBoolean();
        System.out.println("You entered Boolean " + w);

    }
}
