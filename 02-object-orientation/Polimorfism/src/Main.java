public class Main {
  public static void main(String[] args) {
    for (int index = 0; index < 11; index += 1) {
      Movie movie = randomMovie();
      System.out.println("Movie #" + index + ": "
          + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
    }
  }

  public static Movie randomMovie() {
    int randomNumber = (int) (Math.random() * 5) + 1;
    System.out.println("Random number generated was: " + randomNumber);

    switch (randomNumber) {
      case 1:
        return new Jaws();
      case 2:
        return new IndependecyDay();
      case 3:
        return new MazeRunner();
      case 4:
        return new StarWars();
      case 5:
        return new ForgetableMovie();
    }
    return null;
  }
}
