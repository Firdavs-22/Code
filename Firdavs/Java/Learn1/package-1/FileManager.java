import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    public static void main(String[] args) {
//        create("Hallo.txt",study.direct);
//        write(study.direct+"Hallo.txt","Hello worldajpojpsdk!!! \r\n kaposjfpivspd ");
//        read(study.direct+"Hallo.txt");
//        infoFile(study.direct+"Hallo.txt");
//        deleteFile(study.direct+"Hallo.txt");
//        deleteFolder(study.direct);
    }

    static boolean deleteFolder(String url){
        File fileObj = new File(url);
        if (fileObj.delete()) {
            System.out.println("Deleted the folder: " + fileObj.getName());
            return true;
        } else {
            System.out.println("Failed to delete the folder.");
            return false;
        }
    }
    static boolean deleteFile(String url){
        File fileObj = new File(url);
        if (fileObj.delete()) {
            System.out.println("Deleted the file: " + fileObj.getName());
            return true;
        } else {
            System.out.println("Failed to delete the file.");
            return false;
        }

    }
    static boolean infoFile(String url){
        File fileObj = new File(url);
        if (fileObj.exists()){
            System.out.println("File name: " + fileObj.getName());
            System.out.println("Absolute path: " + fileObj.getAbsolutePath());
            System.out.println("Writeable: " + fileObj.canWrite());
            System.out.println("Readable " + fileObj.canRead());
            System.out.println("File size in bytes " + fileObj.length());
            return true;
        }else {
            System.out.println("You have not this file "+url);
            return false;
        }
    }
    static boolean read(String url){
        try {
            File fileObj = new File(url);
            Scanner read = new Scanner(fileObj);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
            return true;
        } catch (FileNotFoundException error){
            error.printStackTrace();
            return false;
        }
    }
    static boolean write(String url,String text){
        try {
            FileWriter fileObj = new FileWriter(url);
            fileObj.write(text);
            fileObj.close();
            return true;
        }catch (Exception error){
            error.printStackTrace();
            return false;
        }
    }
    static boolean create(String fileName,String url){
        try {
            String direct = ((url != "" && url != " ") ? url+fileName:fileName);
            File fileObj = new File(direct);
            if (fileObj.createNewFile()){
                System.out.println("this file: "+direct+" created");
                return true;
            }else {
                System.out.println(direct+" this file already have");
                return false;
            }
        }catch (Exception error){
            System.out.println("Error code"+error);
            return false;
        }
    }

    static void commands(){
        File hello = new File("hello.txt");
        System.out.println("canRead: "+hello.canRead());
        System.out.println("canWrite: "+hello.canWrite());
//        System.out.println("delete: "+hello.delete());
        System.out.println("exists: "+hello.exists());
        System.out.println("getName: "+hello.getName());
        System.out.println("getAbsolutePath: "+hello.getAbsolutePath());
        System.out.println("length: "+hello.length());

        File get = new File("");
        System.out.println(get.list());
        System.out.println(get.mkdir());
    }

    static void creating(){
        File obj = new File(study.direct+"hello.txt");
        try {
            if (obj.createNewFile()){
                function.write("file created");
            }else {
                function.write("file already created");
            }
        } catch (Exception e){
            function.write("Error code:");
            function.write(e);
        }
    }

    static void writeTest(){
        try {
            FileWriter obj = new FileWriter(study.direct+"Hllo.txt");
            obj.write("Hello World");
            obj.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static void readTest(){
        try {
            File fileObj = new File(study.direct+"Hello.txt");
            Scanner read = new Scanner(fileObj);
            while (read.hasNextLine()){
                System.out.println(read.nextLine());
            }
            read.close();
        } catch (FileNotFoundException error){
            error.printStackTrace();
        }
    }
}