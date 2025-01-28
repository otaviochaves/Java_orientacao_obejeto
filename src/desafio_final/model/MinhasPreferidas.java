package desafio_final.model;

public class MinhasPreferidas {
    public void inclui (Audio audio) {
        if(audio.getClassificacao() >=8) {
            System.out.println(audio.getTitulo() + " É considerado sucesso");
        }else  {
            System.out.println(audio.getTitulo() + " Tambem é um titulo bom");
        }
    }
}
