package com.company;


import java.net.*;

public class Main {

    private static final String url = "localhost";
    private static final String ErrorMessage = "NO SERVIVCE!";
    private InetAddress ip;

    public Main(){

    }


    public void getMyInformation(){
        try {
            ip = InetAddress.getLocalHost();
            System.out.println("your ip is: "+ip);

        }catch (Exception e ){
            System.out.println("Exception by: "+e.toString());
        }
    }


    /*TODO:
    * 1.- find which protocols are running on the cellphones ?
    * 2.- How can i get information about that/those protocols ?
    *
    *Learn how the system of comunications like FDMA and CDMA (There are for
     * cellphones comunications) working for both
    *
    *
    *
    * */

    public static void main(String[] args) {

        InetAddress ip ;


        try {
            ip = InetAddress.getLocalHost();

            System.out.println("Initializaing PhoneTracker");

            System.out.println(ip);
            System.out.println(ip.getHostName());
        }catch (Exception e ){
            System.out.println(e.toString());
        }

        //fabiodionisio

        // first create socket connection

    }
}
