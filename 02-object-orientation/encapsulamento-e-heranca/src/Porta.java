public class Porta {
  private int tamanho;
  private String material;
  protected boolean estaAberta;

  public Porta() {
    this.estaAberta = false;
  }

  public int getTamanho() {
    return this.tamanho;
  }

  public String getMaterial() {
    return this.material;
  }

  public boolean estaAberta() {
    return this.estaAberta;
  }

  public void abrePorta() {
    if (this.estaAberta) {
      System.out.println("A porta já estava aberta!");
    } else {
      this.estaAberta = true;
      System.out.println("Porta foi aberta!");
    }
  }

  public void fecharPorta() {
    if (!this.estaAberta) {
      System.out.println("A porta já estava fechada!");
    } else {
      this.estaAberta = false;
      System.out.println("A porta foi fechada!");
    }
  }
}
