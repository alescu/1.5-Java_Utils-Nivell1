import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        // javac ./src/main.java
        // java ./src/main.java
        // java ./src/main.java c:/

        // Exercici 1
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


        // Exercici 2


    }
}
