package fr.boucles;

public class ExerciceBoucleEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] reversed = new int[array.length];

        for (int i : array) {
            System.out.println(i);
        }

        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        for (int i : reversed) {
            if (i > 3) {
                System.out.println("valeur supérieur à 3 : " + i);
            }
        }

        for (int i = 0; i < reversed.length-1; i++) {
            if (reversed[i] % 2 == 0 ) {
                System.out.println( "valeur des index Pairs : " + i);
            }
        }

        for (int i : reversed) {
            if (i % 2 == 0 ) {
                System.out.println("valeur des entiers pairs : " + i);
            }
        }
        for (int i : reversed) {
            if (i % 2 != 0 ) {
                System.out.println("entiers impairs : " + i);
            }
        }


    }
}
