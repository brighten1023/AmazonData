public class CleanCatecode {
    public static String getCode(String code){
        String laststring;
        try {
            String newstring = code.substring(code.indexOf("&rh=n%3A") + 1, code.indexOf("&dc&"));
            laststring = newstring.replace("%2Cn%3A", ":");
            if((laststring.split(":").length)%2==1){
                laststring = "None :" + laststring;
            }
        }catch (StringIndexOutOfBoundsException e){
            return "!";
        }
        return laststring;

    }
}
