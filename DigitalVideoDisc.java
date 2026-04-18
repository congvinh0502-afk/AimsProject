public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    // Class member (static)
    private static int nbDigitalVideoDiscs = 0;

    // Instance members
    private int id;
    // Constructor main
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
    // Constructor 1
    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0);
    }

    // Constructor 2
    public DigitalVideoDisc(String category, String title, float cost) {
        this(title, category, null, 0, cost);
    }

    // Constructor 3
    public DigitalVideoDisc(String director, String category, String title, float cost) {
        this(title, category, director, 0, cost);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}