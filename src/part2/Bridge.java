package part2;

/*
@ASSESSME.USERID: nm4680
@ASSESSME.AUTHOR: Nadja Matkovic
@ASSESSME.LANGUAGE: JAVA
@ASSESSME.DESCRIPTION: ASS10.1
@ASSESSME.ANALYZE: YES
*/

public class Bridge{
    private boolean occupied;

    public synchronized boolean enterBridge(){
        if (!occupied) {
            occupied = true;
            return true;
            
        }
        return false;
    }

    public synchronized void leaveBridge(){
        occupied = false;
        notify();
    }
}
