import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main_Exercici_1 {
    public static void main(String[] args){

        // Exercici 1 : Llegir carpeta i llistar contingut
        if (args.length == 0) {
            System.out.println("Error: Cal especificar un camí de directori");
            System.out.println("Ús: java main.java <camí_del_directori>");
            return;
        }

        File file = new File(args[0]);

        File[] arrFile = null;
        if(file.exists() && file.isDirectory()){
            arrFile = file.listFiles();
        }

        Arrays.sort(arrFile, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));

        for (File fitxer : arrFile) {
            System.out.println("  " + (fitxer.isDirectory() ? "[D] " : "[F] ") + fitxer.getName());
        }

    }
}
