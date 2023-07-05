package Week1.oop;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

//    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
//    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    private static int nbMedia = 0;

    public Media() {
        // TODO Auto-generated constructor stub
        this.id = nbMedia + 1;
    }

    public static void setNbMedia(int nbMedia) {
        Media.nbMedia = nbMedia;
    }

    public Media(String title, String category, float cost) {
        //does not have id
        this.id = nbMedia + 1;
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public static int getNbMedia() {
        return nbMedia;
    }

    public Media(String title) {
        this.title = title;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Media) {
            if(this.getTitle().equals(((Media) o).getTitle())) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getTitle() + " " + this.getCategory() + " " + this.getCost();
    }
    public boolean isMatch(String title) {
        return this.getTitle().contains(title);
    }

}
