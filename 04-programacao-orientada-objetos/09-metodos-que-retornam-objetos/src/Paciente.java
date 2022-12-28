public class Paciente {
  double altura;
  int peso;

  IndiceMassaCorporal calcularIndiceMassaCorporal() {
    IndiceMassaCorporal imc = new IndiceMassaCorporal();
    imc.peso = peso;
    imc.altura = altura;
    imc.resultado = peso / (altura * altura);

    return imc;
  }
}
