package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.Calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.Calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());
        System.out.println("Incluido no plano: " + meuFilme.isIncluidoNoPlano());
        System.out.println("Duração: " + meuFilme.getDuracaoEmMinutos());
        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração do Filme: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.incluir(meuFilme);
        calculadora.incluir(lost);
        calculadora.incluir(outroFilme);
        System.out.println("Soma de minutos para maratonar: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.get(0).getNome();
        listaDeFilmes.size();
        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes.toString());
        System.out.println(meuFilme);
        System.out.println("Primeiro filme " + listaDeFilmes.get(1));

    }
}