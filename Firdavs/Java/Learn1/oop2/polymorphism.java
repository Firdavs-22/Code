public class polymorphism {
    public static String[] myTalant = {};
    public void getMyTalant(){
       talants(myTalant);
    }

    public static void talants(String[] obj){
        String result = "";
        for (String talant : obj){
            result += talant+'\n';
        }
        System.out.print(result);
    }
}
