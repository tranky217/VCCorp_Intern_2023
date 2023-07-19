package Week1.OOP;

import javax.swing.JOptionPane;

public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(title, category, director, length, cost);
    }

    @Override
    public String toString() {
        return this.getId() + " - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " - " + this.getCost();
    }

    public boolean isMatch(String title) {
        return this.getTitle().contains(title);
    }

    public void play() {
        if(this.getLength() <= 0) {
            JOptionPane.showMessageDialog(null, this.getTitle() + " can not be played because of short length");
//			System.out.println(this.getTitle() + " can not be played because of short length");
        }else {
            JOptionPane.showMessageDialog(null, "Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength());
//			System.out.println("Playing DVD: " + this.getTitle());
//			System.out.println("DVD length: " + this.getLength());
        }
    }

}
