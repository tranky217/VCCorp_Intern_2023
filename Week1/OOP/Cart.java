package Week1.OOP;
import java.util.ArrayList;
import java.util.List;


public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20; // const
    private List<Media> itemsOrdered = new ArrayList<Media>();

    public void emptyCart() {
        itemsOrdered.clear();
    }

    public void addMedia(Media m) {
        if(itemsOrdered.size() < this.MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(m);
            System.out.println("The media has been added");
        }else {
            System.out.println("The cart is full");
        }
    }

    public void addMedia(Media... ms) {
        for(Media m: ms) {
            addMedia(m);
        }
    }


    public void removeMedia(Media m) {
        int count = 0;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            String temp = itemsOrdered.get(i).getTitle();
            if(temp.contains(m.getTitle())) {
                itemsOrdered.remove(i);
                count += 1;
            }
        }
        if(count != 0)
            System.out.println("Successfull removed: " + count + " items");
        else
            System.out.println("Not thing is removed");
    }

    public void removeMedia(String title) {
        int count = 0;
        for(int i = 0; i < itemsOrdered.size(); i++) {
            String temp = itemsOrdered.get(i).getTitle();
            if(temp.contains(title)) {
                itemsOrdered.remove(i);
                count += 1;
            }
        }
        if(count != 0)
            System.out.println("Successfull removed: " + count + " items");
        else
            System.out.println("Not thing is removed");
    }

    public float totalCost() {
        float sum = 0;

        for(Media m: itemsOrdered) {
            sum += m.getCost();
        }
        return sum;
    }

    public void print() {
        System.out.println("**********CART**********");
        System.out.println("Ordered Items: ");

        for(Media m: itemsOrdered) {
            System.out.println("Media - " + m.toString());
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("************************");
    }

    public Media searchById(int id){
        int found = 0;
        for(Media m : itemsOrdered){
            if(id == m.getId()){
//                System.out.println(m.toString());
                found = 1;
                return m;
//                break;
            }
        }
        if(found == 0)
            System.out.println("Item not found!");
        return null;
    }

    public Media searchByTitle(String title){
        boolean match = false;
        for(Media m : itemsOrdered){
            match = m.isMatch(title);
            if(match){
//                    System.out.println(m.toString());
                return m;
            }
        }
        if(!match)
            System.out.println("Item not found!");
        return null;
    }

    public List<Media> getItemsOrdered() {
        return itemsOrdered;
    }

    public void setItemsOrdered(List<Media> itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }

}
