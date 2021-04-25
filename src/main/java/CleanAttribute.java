import java.util.HashSet;
public class CleanAttribute {
    public static String getAttr(String attr,HashSet keywords){
        String extrattr = "";
        String[] s = attr.split(";");
        for (int i = 0; i<s.length;i++){
            if(!keywords.contains(s[i].toLowerCase())){
                if(!s[i].equals("")) {
                    extrattr = extrattr + "\t" + s[i];
                }else{
                    continue;
                }
            }
        }

        return extrattr;
    }
}
