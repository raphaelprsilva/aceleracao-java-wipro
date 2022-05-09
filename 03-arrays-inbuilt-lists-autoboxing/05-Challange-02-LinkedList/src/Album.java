import java.util.ArrayList;

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

  public Song findSong(String title) {
    for (Song song : songs) {
      if (song.getTitle().equals(title)) {
        return song;
      }
    }

    return null;
  }
}
