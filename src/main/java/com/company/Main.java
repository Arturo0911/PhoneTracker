package com.company;


import java.net.*;

public class Main {

    private static final String url = "localhost";
    private static final String ErrorMessage = "NO SERVIVCE!";


    /*TODO:
    * 1.- find which protocols are running on the cellphones ?
    * 2.- How can i get information about that/those protocols ?
    *  Learn how the system of comunications like FDMA and CDMA (There are for
    * cellphones comunications.
    * 3.- Frequency division multiple access and Code division multiple access
    *       are develop to distinguish signals from serveral different transmitters
    *   3.1.- In FDMA every time in transmitting and receiving signal from a cell is different with the
    *       transmission with the cell neighboting
    *
    *
    * How a cellphone work ?
    *
    * The cellphone use a protocols of comunications arre
    *
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
