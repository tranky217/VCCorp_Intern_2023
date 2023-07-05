package Week1.oop;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private List<Track> tracks = new ArrayList<Track>();

    public String getArtist() {
        return artist;
    }
    public CompactDisc() {
        super();
    }

    public CompactDisc(String artist) {
        // TODO Auto-generated constructor stub
        super();
        this.artist = artist;
    }

    public CompactDisc(String title, String category, float cost) {
        super(title, category, cost);
    }

    public CompactDisc (String title, String category, String director, int length, float cost, String artist) {
        super(title, category, director, length, cost);
        this.artist = artist;
    }

    public void addTrack(Track track) {
        if(!tracks.contains(track)) {
            tracks.add(track);
        }else {
            System.out.println("Track is already on the list");
        }
    }

    public void removeTrack(Track track) {
        if(tracks.contains(track)) {
            tracks.remove(track);
        }else {
            System.out.println("Track is not on the list");
        }
    }

    public int getLength() {
        int totalLength = 0;
        for(Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        if(this.getLength() <= 0) {
            JOptionPane.showMessageDialog(null, this.getTitle() + " can not be played because of short length");
//			System.out.println(this.getTitle() + " can not be played because of short length");
        }else {
            JOptionPane.showMessageDialog(null, "Playing CD: " + this.getTitle() + "\n" + "CD length: " + this.getLength());
//			JOptionPane.showMessageDialog(null, this.getTitle() + " can not be played because of short length");
//			System.out.println("Playing CD: " + this.getTitle());
//			System.out.println("CD length: " + this.getLength());

            for(Track t: tracks) {
                t.play();
            }
        }
    }
}
