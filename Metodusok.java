/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodusok;

public class Metodusok {

    public static void main(String[] args) {

    }

    public static void elso10SzamOsszege() {
//�sszead
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
//ki�r
        System.out.println("Az els� 10 sz�m �sszege: " + osszeg);
    }

    public static void osszead(int a, int b) {
//�sszead �s ki�r
        System.out.printf("%d + %d = %d\n", a, b, a+b);
    }
}
