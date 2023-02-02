import com.elraphael.tempo.CalculadoraTempo;

public class Main {
    public static void main(String[] args) {
        double segundos = 3600;
        double minutos = CalculadoraTempo.converterSegundosParaMinutos(segundos);
        double horas = CalculadoraTempo.converterSegundosParaHoras(segundos);
        System.out.println(segundos + " segundos = " + minutos + " minutos");
        System.out.println(segundos + " segundos = " + horas + " horas");
    }
}