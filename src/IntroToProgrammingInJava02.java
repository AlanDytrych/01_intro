public class IntroToProgrammingInJava02 {
    public static void main(String[] args) {

        for (int i = 5; i < 9; i++) {
            uvitani("Dobrý den! ");
        }
        vypocet(24, 5);
        vypocet(35, 67);
        vypocet(10, 10);

    }

    private static void uvitani(String pozdrav) {
        System.out.println(pozdrav + "Vítejte ve výuce metod.");
    }

    private static void vypocet(int linkaA, int linkaB) {
        int vysledek = linkaA + linkaB;
        System.out.println("výsledek je " + vysledek);
    }


}

