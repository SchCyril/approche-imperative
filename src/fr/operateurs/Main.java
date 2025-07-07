package fr.operateurs;

public class Main {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;
        boolean testEt = a > 0 && b < 10;
        boolean testOu = a > 0 || b < 20;




        System.out.println("valeur de testEt: " + testEt);
        System.out.println("valeur de testOu: " + testOu);
        System.out.println("valeur de a " + a);
        a = a + 1;
        System.out.println( "valeur de a: " + a);
        a++;
        System.out.println( "valeur de a: " + a);

        String c = a > 0 ? "a est plus grand de 0": "a est inférieur à 0";
        System.out.println( "valeur de c : " + c);



    }
}
