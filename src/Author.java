import java.util.ArrayList;

public class Author {
    //authors name
    private String name;
    //used to store a authors books that are caried
    private ArrayList<Title> titles = new ArrayList<>();

    //constructor
    public Author(String name) {
        this.name = name;
    }

    //for adding a title to the list of the authors caried books
    public void addTitle(Title title) {
        titles.add(title);
    }

    //gets the sum royalties for the authors work and returns the double
    public double calculateTotalPay(){
        double total = 0;
        for (Title t : titles) {
            //function of titles that returns and individual books royalties
            total += t.calculateRoyalty();
        }
        return total;
    }

    //GETTER for variable name
    public String getName() {
        return name;
    }
}
