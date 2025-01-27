import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class LlistadorFitxers {

    public static File[] llegirDirectori(File directori){
        return directori.listFiles();
    }

    public static void publicaFiles(File[] arrFile){
        Arrays.sort(arrFile, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
        for (File fitxer : arrFile) {
            if(fitxer.isDirectory()){
                llegirDirectori(fitxer);
            }else{
                System.out.println("  " + (fitxer.isDirectory() ? "[D] " : "[F] ") + fitxer.getName());
            }
        }
    }

}
