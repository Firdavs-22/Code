public class Main {
    public static void main(String[] args) {
        String phrase = "",
             upPhrase = null;
        if (phrase != null && !phrase.equals("")){
            String[] txt_list = phrase.split("");
            upPhrase = "";
            boolean isUp = true;

            for (String txt : txt_list) {
                upPhrase += isUp ? txt.toUpperCase() : txt;
                isUp = false;
                if (txt.equals(" ")) isUp = true;
            }
        }

        System.out.println(upPhrase);
    }
}

