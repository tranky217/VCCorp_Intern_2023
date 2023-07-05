package Week1.oop;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Media> itemsInStore = new ArrayList<Media>();
    private int qtyItems = 0;

    public Store() {}

    public List<Media> getItemsInStore() {
        return itemsInStore;
    }

    public void setItemsInStore(List<Media> itemsInStore) {
        this.itemsInStore = itemsInStore;
    }

    public void addMedia(Media m) {
        if(!itemsInStore.contains(m)) {
            itemsInStore.add(m);
            qtyItems += 1;
            System.out.println("Item added successfully!");
        }else {
            System.out.println("Item already existed");
        }

    }

    public void addMedia(Media...medias) {
        for(Media m: medias) {
            addMedia(m);
            qtyItems += 1;
        }
    }

    public int removeMedia(String media) {
        int count = 0;
        for(int i = 0; i < itemsInStore.size(); i ++) {
            String temp = itemsInStore.get(i).getTitle();
            if(temp.equals(media)) {
                itemsInStore.remove(i);
                count += 1;
            }
        }
        if(count != 0)
            System.out.println("Successfully deleletd " + count + " items");
        qtyItems -= count;
        return count;
    }


    public Media searchByTitle(String title){
        boolean match = false;
        for(Media d : itemsInStore){
            if(d != null){
                match = d.isMatch(title);
                if(match){
//                    System.out.println(d.toString());
                    return d;
                }
            }else break;
        }
        if(!match)
            System.out.println("Not found");
        return null;
    }
    public void showStore(){
        for(Media d : itemsInStore){
            if(d != null)
                System.out.println(d.toString());
            else
                break;
        }
    }


}
