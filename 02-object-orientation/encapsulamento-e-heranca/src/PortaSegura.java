public class PortaSegura extends Porta {
  private String chave;
  private boolean estaTrancada;

  public PortaSegura(String chave) {
    super();
    this.chave = chave;
    this.estaTrancada = false;
  }

  public void trancarPortaSegura() {
    if (this.estaTrancada) {
      System.out.println("A porta já está trancada");
    } else {
      if (this.estaAberta) {
        super.fecharPorta();
      }
    }
  }
}
