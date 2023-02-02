package com.elraphael.tempo;

public class CalculadoraTempo {

    public static double converterSegundosParaMinutos(double segundos) {
        return segundos / TempoConstants.SEGUNDOS_POR_MINUTO;
    }

    public static double converterSegundosParaHoras(double segundos) {
        return segundos / TempoConstants.SEGUNDOS_POR_HORA;
    }
}
