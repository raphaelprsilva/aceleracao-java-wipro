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

  private Song findSong(String title) {
    for (Song song : this.songs) {
      if (song.getTitle().equals(title)) {
        return song;
      }
    }

    return null;
  }

  public boolean addToPlayList(int trackSongNumber, LinkedList<Song> songs) {
    int albumSize = this.songs.size();

    if (trackSongNumber > albumSize) {
      System.out.println("Não foi possível adicionar a música na sua playlist." +
          "\nA música com o número " + trackSongNumber + " não existe e/ou não foi adicionada em um álbum.");
      return false;
    }

    Song foundSong = this.songs.get(trackSongNumber - 1);

    if (foundSong != null) {
      songs.add(foundSong);
      return true;
    }

    return false;
  }

  public boolean addToPlayList(String title, LinkedList<Song> playlist) {
    // Preciso verificar se a música passada, já existe em algum álbum
    // se tiver, eu adiciono ela no meu album e retorno true
    // caso contrário, mando uma mensagem para o usuário e retorno false
    Song foundSong = findSong(title);

    if (foundSong != null) {
      playlist.add(foundSong);
      return true;
    }

    System.out.println("Não foi possível adicionar a música na sua playlist." +
        "\nA música '" + title + "' não existe e/ou não foi adicionada em um álbum.");
    return false;
  }
}
