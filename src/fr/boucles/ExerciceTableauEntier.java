package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(array[0]);
        System.out.println(array.length);
        System.out.println(array.length - 1);
        System.out.println(array[4] = 8);

        for (int i : array) {
            System.out.println(i);
        }
    }
}
