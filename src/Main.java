import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //arraylist to hold authors
        ArrayList<Author> authors = new ArrayList<>();
        //creates authors
        authors.add(new Author("Steve"));
        authors.add(new Author("Bo"));
        authors.add(new Author("Marge"));

        //adding books to created authors
        (authors.get(0)).addTitle(new AudioBook("Bird calls","FAG",5,120));
        (authors.get(0)).addTitle(new PrintedBook("Birds of Europe","FAG",5,500));
        (authors.get(1)).addTitle(new PrintedBook("Lille dreng på eventyr","BI",10,40));
        (authors.get(2)).addTitle(new PrintedBook("Danske digte","LYRIK",2,1000));

        //loops through authors and calculates the royalties
        for (Author a : authors) {
            System.out.println(a.getName() + "skal betales: " + a.calculateTotalPay());
        }
    }



}