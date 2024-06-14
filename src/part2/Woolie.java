package part2;


/*
@ASSESSME.USERID: nm4680
@ASSESSME.AUTHOR: Nadja Matkovic
@ASSESSME.LANGUAGE: JAVA
@ASSESSME.DESCRIPTION: ASS10.1
@ASSESSME.ANALYZE: YES
*/

public class Woolie extends Thread{
    private String name;
    private int crossingTime;
    private City startCity;
    private City destinationCity;

    public enum City {
        COURTWALD, GLASSDELL;
    
        @Override
        public String toString(){
            return name().substring(0,1) + name().substring(1).toLowerCase();
        }
    }

    public Woolie(String name, int crossingTime, City startCity, City destinationCity) {
        this.name = name;
        this.crossingTime = crossingTime;
        this.startCity = startCity;
        this.destinationCity = destinationCity;
    }

    @Override
    public void run(){
        System.out.println(name + " has arrived at the bridge at " + startCity + ".");

        
            System.out.println(name + " is starting to cross.");

        
           for (int time = 1; time <= crossingTime; time++) {
                try {
                    Thread.sleep(1000); 
                    if (time == 1) {
                        System.out.println("\t" + name + ": " + time + " second.");
                    } else {
                        System.out.println("\t" + name + ": " + time + " seconds.");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
        

        System.out.println(name + " arrives at " + destinationCity + ".");
        
    }

    public static void main(String[] args) {
        Woolie woolie1 = new Woolie("Ahmed", 5, City.COURTWALD, City.GLASSDELL);
        Woolie woolie2 = new Woolie("Chris", 6, City.GLASSDELL, City.COURTWALD);
        Woolie woolie3 = new Woolie("Bruce", 7, City.COURTWALD, City.GLASSDELL);
        Woolie woolie4 = new Woolie("Bobby", 8, City.GLASSDELL, City.COURTWALD);

        woolie1.start();
        woolie2.start();
        woolie3.start();
        woolie4.start();
    }

    

}