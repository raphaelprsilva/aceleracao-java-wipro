public class Main {
  public static void main(String[] args) {
    Paciente novoPaciente = new Paciente();
    novoPaciente.peso = 78;
    novoPaciente.altura = 1.74;

    IndiceMassaCorporal imcNovoPaciente = novoPaciente.calcularIndiceMassaCorporal();
    System.out.printf("IMC Paciente: %.2f%n", imcNovoPaciente.resultado);
  }
}
