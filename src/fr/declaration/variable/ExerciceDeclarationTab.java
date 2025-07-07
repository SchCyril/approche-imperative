package fr.declaration.variable;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        //Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14,
        //17, 9
        int[] array = {8, -7, 12, 1, -2, 14, 17, 9};

        //Affichez l’élément du tableau d’index 0 du tableau
        System.out.println( "element du tableau à l'index 0 : " + array[0]);

        // Affichez la longueur du tableau
        System.out.println("Longueur du tableau : " + array.length);

        // Affichez l’entier positionné au dernier index du tableau
        System.out.println("Entier à l'index à la dernière position : " + array[7]);

        //Affichez l’entier d’index 10. Pourquoi cela échoue ? Affichez un commentaire dans
        //votre code pour l’expliquer
        System.out.println("Entier à l'index 10 : " + array[10]);
        // erreur de type ArrayIndexOutOfBoundsException car le tableau est plus petit que l'index demandé (ici 10)
        // car le tableau ne fait qu'une longueur de 8.
    }



}
