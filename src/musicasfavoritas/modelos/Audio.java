package musicasfavoritas.modelos;

public class Audio {
    private String titulo;
    private int totalReproducao;
    private int totalCurtidas;
    private int duracao;
    private int classificacao;

    public void curte() {
        this.totalCurtidas++;
    }

    public void reproduz() {
        this.totalReproducao++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public int getClassificacao() {
        return classificacao;
    }
}
