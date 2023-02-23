/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        feladatok();
    }

    private static void feladatok() {
        int osszeg = elso10SzamOsszege();
        String kimenet = "Az elsõ 10 szám összege: " + osszeg + "\n";
        kiir(kimenet);

        int szam1 = 7, szam2 = 4;
        int szam3 = 5, szam4 = 8;

        osszeg = osszead(szam1, szam2) + osszead(szam3, szam4);
        kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, osszeg));

        osszeg = osszead(1, 2);
        osszeg += osszead(3, 4);
        kiir("1 + 2 + 3 + 4 = " + osszeg + "\n");

        int a = 3, b = 4, c = 2;
        osszeg = osszead(a, b);
        osszeg += osszead(osszeg, c);
        String s = "%d + %d + %d gyöke:".formatted(a, b, c);
        double gyok = Math.sqrt(osszeg);
        kimenet = String.format("%s %.4f\n", s, gyok);
        kiir(kimenet);
    }

    private static int elso10SzamOsszege() {
//összead
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
//kiír
        //System.out.println("Az elsõ 10 szám összege: " + osszeg);
    }

    private static int osszead(int a, int b) {
        return a + b;
//összead és kiír
        //System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}
