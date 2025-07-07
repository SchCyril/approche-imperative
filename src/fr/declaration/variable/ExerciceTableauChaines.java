package fr.declaration.variable;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villesFrancaise = {"Montpellier", "Lyon", "Paris", "Bordeaux", "Toulon"};

        for (String i : villesFrancaise) {
            System.out.println("liste des villes : " + i);
        }

        System.out.println("longueur du tableau : " + villesFrancaise.length);

        String villeReims = "Reims";
        System.out.println(villesFrancaise[3] = villeReims);
        for (String i : villesFrancaise) {
            System.out.println("liste des villes : " + i);
        }

    }
}
