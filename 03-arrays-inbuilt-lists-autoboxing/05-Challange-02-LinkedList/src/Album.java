import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<Song>();
  }

  public boolean addSong(String title, double duration) {
    Song foundSong = findSong(title);

    if (foundSong == null) {
      Song newSong = new Song(title, duration);
      System.out.println("Música '" + title + "' adicionada com sucesso.");
      this.songs.add(newSong);
      return true;
    }

    System.out.println("Não foi possível adicionar a música '" + title + "'. Ela já existe no álbum.");
    return false;
  }

  public boolean addSongToPlaylist(String title, LinkedList<Song> playlist) {
    Song foundSong = findSong(title);

    if (foundSong == null) {
      System.out.println("Não foi possível adicionar a música '" + title + "' na playlist.");
      return false;
    }

    playlist.add(foundSong);
    return true;
  }

  public Song findSong(String title) {
    for (Song song : this.songs) {
      if (song.getTitle().equals(title)) {
        return song;
      }
    }

    return null;
  }
}
