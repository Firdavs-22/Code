public class function
{
    static void write(String text){
        System.out.println(text);
    }
    static void write(int text){write(""+text);}
    static void write(double text){write(""+text);}
    static void write(Object obj){write(obj+"");}
    static void write(boolean bool){write(bool+"");}

    static int getCountWord(String text){return text.split("\\s").length;}

    static String removeChachepter(String text,String chachepter){return text.replaceAll("["+chachepter+"]","");}
}
