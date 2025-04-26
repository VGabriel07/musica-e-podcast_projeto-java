package musicasfavoritas.principal;

import musicasfavoritas.modelos.Classificacao;
import musicasfavoritas.modelos.Musica;
import musicasfavoritas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica musicaFavorita = new Musica();
        musicaFavorita.setTitulo("Higher");
        musicaFavorita.setArtista("The Score");
        musicaFavorita.setAlbum("ATLAS");
        musicaFavorita.setGeneroMusical("Rock Alternativo");
        musicaFavorita.setDuracao(4);
        musicaFavorita.exibirFicha();

        Podcast podcast = new Podcast();
        podcast.setTitulo("Vrau Cast");
        podcast.setApresentador("Mike e Cauê");
        podcast.setDescricao("Aqui, ninguém pesquisa nada, só recebe pessoas pra ver se elas concordam com o que eles já acreditam, esse é o formato favorito do brasileiro!");
        podcast.setDuracao(35);
        podcast.exibirFicha();

        Classificacao classificacao = new Classificacao();

        for (int i = 0; i < 5000; i++) {
            musicaFavorita.reproduz();
        }

        for (int i = 0; i < 800; i++) {
            podcast.curte();
        }

        classificacao.classificacaoReproducoes(musicaFavorita);
        System.out.println("\nClassificação da Música: " + musicaFavorita.getClassificacao());

        classificacao.classificacaoCurtidas(podcast);
        System.out.println("Classificação do Podcast: " + podcast.getClassificacao() + "\n");
    }
}
