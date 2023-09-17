import java.util.Scanner;

public class Socialka {

    public static void main(String[] args) {
        Scanner vstup = new Scanner(System.in);

        System.out.println("Vítejte ve sociálce");
        System.out.println("Nyní bude následovat dotazník o vaší situaci.");

        System.out.println("Máte dítě:");
        String odpoved = vstup.nextLine();
        System.out.println("vaše odpověď: " + odpoved);

        //boolean maDite = (odpoved.equals("ano")) ? true : false;
        boolean maDite = jeSouhlas(odpoved);

        int vek = 0;
        if (maDite == false) {
            System.out.println("Nemate narok na prispevek");
            System.exit(0);
        } else {
            System.out.println("Vyplňte věk dítěte?");
            vek = vstup.nextInt();
            System.out.println("vaše odpověď: " + vek);
        }                

        System.out.println("Máte práci?");
//        String prace = vstup.nextLine();
        boolean maPraci = vstup.nextBoolean();
//        System.out.println("vaše odpověď: " + prace);
//        boolean maPraci = jeSouhlas(prace);

        int plat = 1;
        if (maPraci == true) {
            System.out.println("Vyplňte váš plat");
            plat = vstup.nextInt();
            System.out.println("vaše odpověď: " + plat);
        }

        System.out.println("Vyhodnocení dotazníku:");

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
}
