public class PrintedBook extends Title {
    //the amount of pages which the book has
    private int pages;
    //constructor
    PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }
    //calculates the points the book is worth
    protected double calculatePoints(){
        return pages * calculateLiteraturePoints() * copies;
    }

    //calculates the multiplier based on a books literature type
    protected double calculateLiteraturePoints(){
        switch (getLiteratureType()){
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
        }
        //if the book has a mispelt or wrong named it will print out an error message and return 0, making it so the author isn't paid for the work until the error is resolved
        //this is not perfect, but it is what it is
        System.out.println("error: NOT A CATEGORIZED BOOK");
        return 0;
    }
}
