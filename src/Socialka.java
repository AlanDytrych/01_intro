import java.util.Scanner;

public class Socialka {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Vítejte ve sociálce");
        System.out.println("Nyní bude následovat dotazník o vaší situaci.");

        System.out.println("Máte dítě:");
        boolean maDite = vstup.nextBoolean();
        System.out.println("vaše odpověď: " + maDite);

        System.out.println("Vyplňte věk dítěte?");
        int vek = vstup.nextInt();
        System.out.println("vaše odpověď: " + vek);

        System.out.println("Vyplňte váš plat");
        int plat = vstup.nextInt();
        System.out.println("vaše odpověď: " + plat);

        System.out.println("Máte práci?");
        boolean maPraci =vstup.nextBoolean();
        System.out.println("vaše odpověď: " + maPraci);

        System.out.println("Vyhodnocení dotazníku :");

        if (maDite == true
                && vek <= 18 && vek >= 5
                && (plat <= 15000 || maPraci == false)) {
            // kdyz je splnena podminka
            System.out.println(" ");
            System.out.println("Ma narok na prispevek");
        } else { // jinak
            // kdyz neni splnena podminka
            System.out.println(" ");
            System.out.println("Nema narok na prispevek");
        }
    }

}
