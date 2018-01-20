package by.itacademy.task14.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 1/20/18
 */
public class Artist {
    private String nameArtist;
    private List<Album> albums = new ArrayList<>();

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }
}
