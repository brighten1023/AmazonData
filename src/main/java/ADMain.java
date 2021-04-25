import java.io.*;
import  java.util.HashMap;
import java.util.HashSet;

public class ADMain {
    public static void main(String[] args){
        //Fault Check
        FaultCheck.getFault();
        /*HashMap<String,String> cmap = new HashMap<String,String>();
        cmap.put("None","None");
        HashSet<String> cset = new HashSet<String>();
        HashSet<String> keywords = new HashSet<String>();
        keywords.add("category code");
        keywords.add("title");
        keywords.add("subtitle");
        keywords.add("description");
        keywords.add("imgsrc");
        keywords.add("modeltype");
        keywords.add("status");
        keywords.add("size");
        keywords.add("weight");
        keywords.add("availabledate");
        keywords.add("curprice");
        String mapPath = "/home/bright/Documents/AmazonScData/BTGTSV/AmazonInventory.tsv";
        String oldPath = "/home/bright/Documents/AmazonScData/BTGTSV/SummaryInfoPage1.tsv";
        String finalPath = "/home/bright/Documents/AmazonScData/BTGTSV/AmazonDataSummary.tsv";

        BuidMap.getMap(mapPath,cmap);
        try{
            File readTsv1 = new File(oldPath);
            BufferedReader readerPage = new BufferedReader(new FileReader(readTsv1));
            File writeTsv = new File(finalPath);
            BufferedWriter writePage = new BufferedWriter(new FileWriter(writeTsv,true));
            String line = null;
            while((line=readerPage.readLine())!=null){
                String itemPage[] = line.split("\t");
                String itemAttrSet = "";
                String code = CleanCatecode.getCode(itemPage[1]);
                if(!code.equals("!")) {
                    for (int i=3;i<itemPage.length;i++){
                        if(!itemPage[i].equals("N/A")) {
                            itemAttrSet = itemAttrSet + itemPage[i];
                        }
                    }
                    String itemAttr = CleanAttribute.getAttr(itemAttrSet,keywords);
                    String[] subCode = code.trim().split(":");
                    int len = subCode.length;
                    writePage.write(subCode[len - 2] + "\t" + subCode[len - 1] + "\t" + cmap.get(subCode[len - 1]) + itemAttr);
                    writePage.flush();
                    writePage.newLine();
                    cset.add(subCode[len - 2] + ":" + subCode[len - 1]);
                    while (((len - 2) != 0)) {
                        len--;
                        if (!cset.contains(subCode[len - 2] + ":" + subCode[len - 1])) {
                            cset.add(subCode[len - 2] + ":" + subCode[len - 1]);
                            writePage.write(subCode[len - 2] + "\t" + subCode[len - 1] + "\t" + cmap.get(subCode[len - 1]));
                            writePage.flush();
                            writePage.newLine();
                        }
                    }
                    //writePage.newLine();
                }

            }

            writePage.close();
            readerPage.close();
            System.out.println("Done!!!!!!!!!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
