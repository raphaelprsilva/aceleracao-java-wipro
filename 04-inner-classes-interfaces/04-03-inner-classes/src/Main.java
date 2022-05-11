public class Main {
  public static void main(String[] args) {

    OuterClass outer = new OuterClass();
    outer.heyThere();

    // Uma maneira de instanciar a innerClass sem InnerClass sem estática
    // OuterClass.InnerClass innerClass = outer.new InnerClass();

    // Criando um objeto a partir de InnerClass, mas com a classe InnerClass estática
    OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
    innerClass.whatsUp();
  }
}
