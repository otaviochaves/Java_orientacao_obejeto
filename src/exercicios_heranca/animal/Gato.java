package exercicios_heranca.animal;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }

    public  void arranharMoveis() {
        System.out.println("Barulho arranhando moveis");
    }
}
