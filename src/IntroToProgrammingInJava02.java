public class IntroToProgrammingInJava02 {

    public static void main(String[] args) {
        int vysledek = nasobilka(7,6);
        System.out.println("vysledek je " + vysledek);
        vypocetD();
        vypocetD666(666.666, 789.11);
        boolean k0n3c = jeSouhlas("nope");
        System.out.println("Return je " + k0n3c);

        for (int i = 5; i < 9; i++) {
            uvitani1();
            uvitani2("Dobrý den! ");
        }
        vypocet1();

        int prvniVysledek = vypocet2(24, 5); // 29

        int druhyVyskedek = vypocet2(35, 67); // 102

        int celkovyVypocet = vypocet2(prvniVysledek, druhyVyskedek); // 131
        System.out.println("Celkovy vypocet je " + celkovyVypocet);
    }

    private static void uvitani1() {
        System.out.println("Ahoj. Vítejte ve výuce metod.");
    }

    private static void uvitani2(String pozdrav) {
        System.out.println(pozdrav + "Vítejte ve výuce metod.");
    }

    private static void vypocet1() {
        int linkaA = 10;
        int linkaB = 20;
        int vysledek = linkaA + linkaB;
        System.out.println("výsledek je " + vysledek);
    }

    private static int vypocet2(int linkaA, int linkaB) {
        int vysledek = linkaA + linkaB;
        System.out.println("výsledek je " + vysledek);
        return vysledek;
    }

    private static void vypocetD() {
        double linkaD1 = 17.666;
        double linkaD2 = 57.567089;
        double vysledek = linkaD1 + linkaD2;
        System.out.println("výsledek je " + vysledek);
    }

    private static void vypocetD666(double linkaD1, double linkaD2) {
        double linkaa3 = 15.5;
        double vysledek = linkaD1 + linkaD2 + linkaa3;
        System.out.println("výsledek je " + vysledek);
    }

    private static boolean jeSouhlas(String odpoved) {
        boolean vyhodnoceni;

        if (odpoved.equals("ano")) {
            vyhodnoceni = true;
        } else {
            vyhodnoceni = false;
        }
        System.out.println("vyhodnocení je " + vyhodnoceni);
        return vyhodnoceni;
    }

    private static int nasobilka(int nasobek, int nasobek2) {
        int vysledek = nasobek * nasobek2;
        //System.out.println("výsledek je " + vysledek);
        return vysledek;
    }
}

