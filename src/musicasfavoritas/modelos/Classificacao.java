package musicasfavoritas.modelos;

public class Classificacao {
    public void classificacaoReproducoes(Audio audio) {
        if (audio.getTotalReproducao() >= 3000) {
            audio.setClassificacao(10); // Excelente
        } else if (audio.getTotalReproducao() >= 1500) {
            audio.setClassificacao(8); // Muito bom
        } else if (audio.getTotalReproducao() >= 800) {
            audio.setClassificacao(6); // Bom
        } else {
            audio.setClassificacao(4); // Ruim
        }
    }


    public void classificacaoCurtidas(Audio audio) {
        if (audio.getTotalCurtidas() >= 1000) {
           audio.setClassificacao(10); // Excelente
        } else if (audio.getTotalCurtidas() >= 700) {
            audio.setClassificacao(8); // Muito bom
        } else if (audio.getTotalCurtidas() >= 300) {
            audio.setClassificacao(6); // bom
        } else {
            audio.setClassificacao(4); // Ruim
        }
    }
}
