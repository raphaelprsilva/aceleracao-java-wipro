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
    // Preciso verificar se a música já existe
    // Se não existir, adicionar no album e retornar true
    // Se existir, não adicionar e retornar false
    Song foundSong = findSong(title);

    if (foundSong != null) {
      System.out.println("A música '" + title + "' já existe no álbum.");
      return false;
    }

    Song newSong = new Song(title, duration);
    this.songs.add(newSong);
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
