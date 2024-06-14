package part2;
/*
@ASSESSME.USERID: nm4680
@ASSESSME.AUTHOR: Nadja Matkovic
@ASSESSME.LANGUAGE: JAVA
@ASSESSME.DESCRIPTION: ASS10.1
@ASSESSME.ANALYZE: YES
*/
import java.util.ArrayList;
import java.util.List;

public class Woolies {

    public static void main(String[] args) {
        Bridge troll = new Bridge();
        List<Woolie> woolies = new ArrayList<>();
        woolies.add(new Woolie("Bruce", 7, Woolie.City.COURTWALD, Woolie.City.GLASSDELL));
        woolies.add(new Woolie("Bobby", 8, Woolie.City.GLASSDELL, Woolie.City.COURTWALD));
        woolies.add(new Woolie("Ahmed", 5, Woolie.City.COURTWALD, Woolie.City.GLASSDELL));
        woolies.add(new Woolie("Chris", 6, Woolie.City.GLASSDELL, Woolie.City.COURTWALD));

        for (Woolie woolie : woolies) {
            Thread thread = new Thread(woolie); 
            thread.start();
        }
    }
}
