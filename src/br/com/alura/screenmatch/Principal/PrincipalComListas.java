package br.com.alura.screenmatch.Principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;
import java.util.function.DoubleFunction;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Serie lost = new Serie("Lost",2000);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao()>2){
            System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");
        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);


        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);




    }
}
