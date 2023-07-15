package Week1.OOP;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private List<String> authors = new ArrayList<String>();

    public Book() {
        super();
    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }


    public void addAuthor(String authorName) {
        if(!authors.contains(authorName)) {
            authors.add(authorName);
//			System.out.println("Add author successfully");
        }else {
            System.out.println("Author existed");
        }
    }

    public void removeAuthor(String authorName) {
        if(authors.contains(authorName)) {
            authors.remove(authorName);
        }else {
            System.out.println("Author is not exist");
        }
    }

    public void showAuthors() {
        for(String author: authors) {
            System.out.println(author);
        }
    }
}
