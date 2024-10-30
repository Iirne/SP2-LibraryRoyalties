public abstract class Title {
    //the Name of the book
    private String title;
    //the category of literature of the work
    private String literatureType;
    //how many copies of a title is caried
    protected int copies;
    // the point -> royalties rate
    protected static double rate;

    //constructor
    public Title(String title, String literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
        rate = 0.067574;
    }

    //calculates royalties out from the point->royalteies conversion rate
    public double calculateRoyalty(){
        return calculatePoints() * rate;
    }

    //abstract class which is used to calculate points for royalties
    protected abstract double calculatePoints();

    //plantuml categorized it as abstract
    //as implemented it could be 1 function in title which gets multiplied by 0.5 in AudioBook.java with the same results
    //still diagram has been followed.
    //abstract function for getting literature points multiplier
    protected abstract double calculateLiteraturePoints();

    //getter
    public String getLiteratureType() {
        return literatureType;
    }
}
