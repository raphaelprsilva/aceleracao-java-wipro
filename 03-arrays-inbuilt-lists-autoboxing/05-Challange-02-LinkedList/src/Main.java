import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Album> albums = new ArrayList<Album>();

    Album album = new Album("Classics", "Massacration");

    album.addSong("Não aprendi dizer adeus", 2.3);
    album.addSong("Aprendi dizer adeus", 3.5);
    album.addSong("Choram as rosas", 3.2);
    album.addSong("Menino da porteira", 5.4);

    albums.add(album);

    album = new Album("For those about rock", "AC/DC");

    album.addSong("Boate azul", 1.2);
    album.addSong("Na sola da bota", 5.5);
    album.addSong("Dormi na praça", 4.3);
    album.addSong("Filha", 2.7);

    albums.add(album);

    LinkedList<Song> playlist = new LinkedList<Song>();

    albums.get(0).addSongToPlaylist("Aprendi dizer adeus", playlist);
    albums.get(0).addSongToPlaylist("Choram as rosas", playlist);
    albums.get(1).addSongToPlaylist("Filha", playlist);

    menu(playlist);
  }

  public static void menu(LinkedList<Song> playlist) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean goingFoward = true;

    ListIterator<Song> listIterator = playlist.listIterator();

    if (playlist.isEmpty()) {
      System.out.println("Não existem músicas na sua playlist.");
      return;
    } else {
      printMenu();
      System.out.println("---------------------------------");
      System.out.println("Tocando agora: " + listIterator.next().toString());
    }

    while(!quit) {
      System.out.println("Digite uma opção: ");
      int option = scanner.nextInt();
      scanner.nextLine();

      switch (option) {
        case 0:
          System.out.println("Bye bye.");
          quit = true;
          break;
        case 1:
          if (!goingFoward) {
            if (listIterator.hasNext()) {
              listIterator.next();
            }
            goingFoward = true;
          }
          if (listIterator.hasNext()) {
            System.out.println("Música atual: " + listIterator.next());
          } else {
            System.out.println("Chegou ao final da lista!");
            goingFoward = false;
          }
          break;
        case 2:
          if (goingFoward) {
            if (listIterator.hasPrevious()) {
              listIterator.previous();
            }
            goingFoward = false;
          }
          if (listIterator.hasPrevious()) {
            System.out.println("Música atual: " + listIterator.previous());
          } else {
            System.out.println("Chegou no início da playlist");
            goingFoward = true;
          }
          break;
        case 3:
          // Reproduzir música atual
          if (goingFoward) {
            if (listIterator.hasPrevious()) {
              System.out.println("Tocando novamente a música " + listIterator.previous());
              goingFoward = false;
            } else {
              System.out.println("Estamos no início da lista");
            }
          } else {
            if (listIterator.hasNext()) {
              System.out.println("Tocano novamente " + listIterator.next());
              goingFoward = true;
            } else {
              System.out.println("Chegamos ao fim da lista.");
            }
          }
//          if (listIterator.hasNext()) {
//            String currentSong = listIterator.previous();
//            System.out.println("Música atual: " + currentSong);
//          }
          break;
        case 4:
          // Listar músicas da playlist
          showPlayList(playlist);
          break;
        case 5:
          printMenu();
          break;
        case 6:
          // remover música atual
          if (playlist.size() > 0) {
            listIterator.remove();
            if (listIterator.hasNext()) {
              System.out.println("Agora está tocando " + listIterator.next());
            } else if (listIterator.hasPrevious()) {
              System.out.println("Agora está tocando " + listIterator.previous());
            }
          }
          break;
      }
    }
  }

  public static void printMenu() {
    System.out.println("---------------------------------");
    System.out.println("Selecione uma opção:");
    System.out.println("0 - Para sair");
    System.out.println("1 - Mostrar próxima música da playlist");
    System.out.println("2 - Mostrar música anterior da playlist");
    System.out.println("3 - Reproduzir música atual");
    System.out.println("4 - Listar músicas da playlist");
    System.out.println("5 - Mostrar menu");
    System.out.println("6 - Remover música atual da playlist");
  }

  public static void showPlayList(LinkedList<Song> playList) {
    System.out.println("Lista de músicas ---------------");
//    for (int index = 0; index < playList.size(); index += 1) {
//      System.out.println((index + 1) + " - " + playList.get(index));
//    }

    Iterator<Song> iterator = playList.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    System.out.println("--------------------------------");

  }
}
