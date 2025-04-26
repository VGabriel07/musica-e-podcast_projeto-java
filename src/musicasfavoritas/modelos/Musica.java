package musicasfavoritas.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private String generoMusical;
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public void exibirFicha() {
        System.out.println("\nSobre a Música:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Álbum: " + album);
        System.out.println("Gênero: " + generoMusical);
        System.out.println("Duração " + getDuracao() + " min(s)");
    }
}
