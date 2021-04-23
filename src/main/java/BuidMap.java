import java.io.*;
import java.util.HashMap;
import java.util.Locale;

public class BuidMap {
    public static void getMap(String path,HashMap site){
        try {
            File readTsv1 = new File(path);
            BufferedReader readerPage = new BufferedReader(new FileReader(readTsv1));
            String line = null;
            while((line=readerPage.readLine())!=null){
                String[] s = line.split("\t");
                site.put(s[0].trim(),s[1].trim());
            }
            System.out.println("HashMap construction completed!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
