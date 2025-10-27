package edu.fra.uas.v1instantiating;

public class MainTest {

    //Zusatz Test um zu sehen wie die Abhängigkeitskette funktioniert 
    public static void main (String [] args) {
        MasterV1 master = new MasterV1();
        master.delegateWork();
    }

}
