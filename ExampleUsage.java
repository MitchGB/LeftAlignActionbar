public class ExampleUsage {
    public String actionBarString(){
        String statusBar = "";

        String temp = "";
        temp += "MY STRING.....";
        temp += UnicodeSpaceUtil.getNeg(10); //get negative 10 spacing
        temp += CharRepo.MYEXAMPLEUNICODE;

        //calculate offset
        int pixelOffset = CharRepo.getPixelWidth(temp);
        statusBar += UnicodeSpaceUtil.getSpace(pixelOffset - 182);
        statusBar += temp;

        return statusBar;
    }
}
