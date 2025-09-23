package br.com.alura.screenmatch.Calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    //public void incluir(Filme f){
    //    tempoTotal += f.getDuracaoEmMinutos();
    //}

    //public void incluir(Serie s){
    //   tempoTotal = s.getDuracaoEmMinutos();
    //}

    public void incluir(Titulo titulo){
        System.out.println("Adicionando duração em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
