public class AudioBook extends Title {
    //the length of the audiobook in minutes
    private int durationInMinutes;

    //constructor
    AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    //magic number for the fact that audiobooks get paid half per minute compared to written media
    protected double calculatePoints() {
        return durationInMinutes * calculateLiteraturePoints() * copies;
    }

    //calculates the multiplier based on a audiobooks literature type
    protected double calculateLiteraturePoints(){
        switch (getLiteratureType()){
            case "BI":
                return 1.5;
            case "TE":
                return 1.5;
            case "LYRIK":
                return 3;
            case "SKØN":
                return 0.85;
            case "FAG":
                return 0.5;
        }
        //if the book has a mispelt or wrong named it will print out an error message and return 0, making it so the author isn't paid for the work until the error is resolved
        //this is not perfect, but it is what it is
        System.out.println("error: NOT A CATEGORIZED BOOK");
        return 0;
    }
}
