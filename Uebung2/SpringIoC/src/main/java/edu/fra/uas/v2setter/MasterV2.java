package edu.fra.uas.v2setter;

public class MasterV2 {
    Journeyman journeyman; //journeyman ist ein azubi 

    public void setJourneymanAndWork(Journeyman journeyman, Work work) {
        this.journeyman = journeyman;
        this.journeyman.setWork(work);
    }

    public void delegateWork() {
        journeyman.performWork();
    }
}
