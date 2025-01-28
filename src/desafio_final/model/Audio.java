package desafio_final.model;

public class Audio {
    private String titulo;
    private int totalDeReproducao;
    private int totalCurtida;
    private int classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducao() {
        return totalDeReproducao;
    }

    public int getTotalCurtida() {
        return totalCurtida;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curtir () {
        this.totalCurtida++;
    }

    public void reproduzir(){
        this.totalDeReproducao++;
    }
}
