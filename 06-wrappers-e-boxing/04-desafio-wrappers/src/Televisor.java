import java.util.Objects;

public class Televisor {
  Integer canal = 130;
  Integer volume = 20;

  void mudarCanal(Integer novoCanal) {
    if (this.canal.equals(novoCanal)) {
      System.out.println("Novo canal é também o canal atual.");
    } else {
      this.canal = novoCanal;
      System.out.println("Canal alterado para " + this.canal);
    }
  }

  void mudarVolume(Integer novoVolume) {
    if (this.volume.equals(novoVolume)) {
      System.out.println("Novo volume é também o volume atual.");
    } else {
      this.volume = (int) novoVolume.byteValue();
      System.out.println("Volume alterado para " + volume);
    }
  }
}