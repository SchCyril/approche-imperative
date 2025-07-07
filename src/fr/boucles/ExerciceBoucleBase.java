package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tous les chiffres + 10 : " + i);
        }

        for (int i = 1; i <= 20; i++) {
            System.out.println("Cyril Schneidenbach " + i + " fois");
        }

        for (int i = 2; i <= 100; i++) {
            int reste = i % 2;
            if (reste == 0) {
                System.out.println("Nombres pairs : " + i);
            }
        }

        for (int i = 0; i < 100; i++) {
            int reste = i % 2;
            if (reste != 0) {
                System.out.println("Nombres impairs : " + i);
            }
        }
    }
}
