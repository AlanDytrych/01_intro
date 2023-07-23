
public class IntroToProgrammingInJava {

    public static void main(String[] args) {
        System.out.println("Hello and \"welcome\"!");

        for (int i = 1; i <= 5; i++) {
            // vytiskne text hi i = s aktuálním stavem proměnné
            System.out.println("hi  i = " + i);
        }
        int test = 50 + 40;
        System.out.println("proměná test = " + test);
        test += 40;
        System.out.println("proměná test = " + test);
        test -= 30;
        System.out.println("proměná test = " + test);
        test *= 20;
        System.out.println("proměná test = " + test);
        test = (10 + 5) * test;
        System.out.println("proměná test = " + test);

        int mInt = 70;
        mInt += 1;
        mInt++;
        mInt--;
        ++mInt;
        --mInt;
        System.out.println("mInt = " + mInt);

        test /= 13.5;

        double testd = test / 13.5;
        System.out.println("proměná testd = " + testd);
        long test2 = 19999999999999L;
        System.out.println("proměná test2 = " + test2);
        int modulo = 22 % 5;
        System.out.println("modulo = " + modulo);

        double test3 = 10.11;
        double testdd = 25.25;
        System.out.println("proměná test3 = " + test3 + testdd);

        //udělat součet s pomocí nových promněnních

        String test5 = "String!?";
        String test6 = "String!?";
        String testst = test5 + test6;
        System.out.println(testst);

        char test4 = '7';
        char testc = '7';
        int testi = test4 + testc;

        System.out.println(testi);

        boolean bTest = true;
        boolean bbtest = false;
        System.out.println(bTest);
        System.out.println(bbtest);

        int a = 5;
        int b = 5;
        boolean porovnani = a == b;
        System.out.println("porovnani = " + porovnani);
        porovnani = a != b;
        System.out.println("porovnaniN = " + porovnani);
        porovnani = a > b;
        System.out.println("porovnaniV = " + porovnani);
        porovnani = a >= b;
        System.out.println("porovnaniVR = " + porovnani);

        boolean porovnani2 = test4 == testc;
        System.out.println("porovnani2 = " + porovnani2);

        boolean porovnani3 = test5 == test6;
        System.out.println("porovnani3 = " + porovnani3);

        boolean gg = false;
        boolean hh = false;
        boolean chch = true;
        boolean poB = gg && hh && chch; // AND / A
        System.out.println("porovnaniB = " + poB);

        boolean poP = gg || hh || chch; // OR / NEBO
        System.out.println("porovnaniP = " + poP);

        int q = 2;
        int w = 3;
        int e = 4;
        int matematika = q * (w + e); // 2 * (3 + 4) --> 2 * 7 --> 14
        System.out.println("matematika = " + matematika);

        // && = AND = logicky soucin / nasobeni
        // || = OR  = logicky soucet / scitani
        // true = 1, false 0
        boolean u = false;

        boolean r = true;
        boolean t = true;
        boolean kombinace = u && (r || t);
        // false && (false || true) --> false && true --> false
        // 0 * (0+1) --> 0*1 --> 0
        // 0 * (1+1) --> 0*1 --> 0
        System.out.println("kombinace = " + kombinace);

        // boolean pop3 <-- true, kdyz gg i hh je true anebo kdyz chch je true
        boolean pop3 = gg && hh || chch; // (false && false) || true


        boolean maDite = true;
        int vek = 8;
        int plat = 1444;
        boolean maPraci = false;
        if (maDite == true
                && vek <= 18 && vek >= 5
                && (plat <= 15000 || maPraci == false)) {
            // kdyz je splnena podminka
            System.out.println("Ma narok na prispevek");
        } else { // jinak
            // kdyz neni splnena podminka
            System.out.println("Nema narok na prispevek");
        }






    }
}