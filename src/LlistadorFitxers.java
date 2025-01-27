import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class LlistadorFitxers {
    private String directori;

    public String getDirectori() {
        return directori;
    }

    public void setDirectori(String directori) {
        this.directori = directori;
    }

    public LlistadorFitxers(String directori) {
        this.directori = directori;
    }

    public File[] getFiles(File directori){

        return null;
    }
/*
    public File[] ordenarFiles(File[] arrFile){

        return Arrays.sort(arrFile, Comparator.comparing(File::getName, String.CASE_INSENSITIVE_ORDER));
    }
    */

}
