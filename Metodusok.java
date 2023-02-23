/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusok;

public class Metodusok {

    public static void main(String[] args) {
        int osszeg = elso10szamOsszege();
        String kimenet = "Az els� 10 sz�m �sszege: " + osszeg + "\n";
        kiir(kimenet);
        
        int szam1 = 7, szam2 = 4;
        kiir("%d + %d = %d\n".formatted(szam1, szam2, szam1+sza,2));
    }

    private static int elso10SzamOsszege() {
//�sszead
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
//ki�r
        //System.out.println("Az els� 10 sz�m �sszege: " + osszeg);
    }

    private static int osszead(int a, int b) {
        return a + b;
//�sszead �s ki�r
        //System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    private static void kiir(String szoveg) {
        System.out.print(szoveg);
    }
}
