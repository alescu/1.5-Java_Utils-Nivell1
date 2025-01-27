import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main_Exercici_2 {
    public static void main(String[] args){

        // Exercici 2 : Afegeix a la classe de l’exercici anterior, la funcionalitat de llistar
        // un arbre de directoris amb el contingut de tots els seus nivells (recursivament) de manera
        // que s'imprimeixin en pantalla en ordre alfabètic dins de cada nivell, indicant a més
        // si és un directori (D) o un fitxer (F), i la seva última data de modificació.
        if (args.length == 0) {
            System.out.println("Error: Cal especificar un camí de directori");
            System.out.println("Ús: java main.java <camí_del_directori>");
            return;
        }

        File file = new File(args[0]);

        File[] arrFile = null;
        if(file.exists() && file.isDirectory()){
            arrFile = file.listFiles();
        }else{
            System.out.println("Error: Cal especificar un camí de directori");
            System.out.println("Ús: java main.java <camí_del_directori>");
            return;
        }


        Arrays.sort(arrFile, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

        for (File fitxer : arrFile) {
            System.out.println("  " + (fitxer.isDirectory() ? "[D] " : "[F] ") + fitxer.getName());
        }

    }
}
