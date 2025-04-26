package musicasfavoritas.modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;

    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void exibirFicha() {
        System.out.println("\nSobre o Podcast:");
        System.out.println("Nome: " + getTitulo());
        System.out.println("Apresentador: " + apresentador);
        System.out.println("Descrição: " + descricao);
        System.out.println("Duração " + getDuracao() + " min(s)");
    }
}
