package Week1.OOP;

import javax.swing.JOptionPane;

public class Track implements Playable{
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Track() {}

    public Track(String title, int length) {
        // TODO Auto-generated constructor stub
        this.title = title;
        this.length = length;
    }

    public void play() {
        if(this.length <= 0) {
            JOptionPane.showMessageDialog(null, this.getTitle() + " can not be played because of short length");
        }else {
            JOptionPane.showMessageDialog(null, "Playing track: " + this.getTitle() + "\n" + "Track length: " + this.getLength());
//			System.out.println("Playing track: " + this.getTitle());
//			System.out.println("Track length: " + this.getLength());
        }
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Track) {
            if(this.getTitle().equals(((Track) o).getTitle()) && this.getLength() == ((Track)o).getLength()) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

}
