package com.database;

public class db
{
    String db_name,pass,host;
    private boolean connection = false;



    public db(String db_name,String pass,String host){
        if (db_name != "" && pass != "" && host != "") {
            this.db_name = db_name;
            this.pass = pass;
            this.host = host;
            connection = true;
        }
        init();
    }

    final private void init(){
        if (connection){
            System.out.println("Connection success");
        }else {
            System.out.println("Connection failed");
        }
    }
}
