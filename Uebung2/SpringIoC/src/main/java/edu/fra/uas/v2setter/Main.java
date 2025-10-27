package edu.fra.uas.v2setter;

import edu.fra.uas.v1instantiating.MasterV1;

public class Main {
      public static void main (String [] args) {
        MasterV2 master = new MasterV2();
        master.setJourneymanAndWork(new Journeyman(), new Drilling());
        master.delegateWork();
    }


}
