package exercicios.exercicios_interface.calcular_sala_retangular;

public class CalcularSalaRetangular implements CalculoGeometrico {

    @Override
    public void calcularArea(double altura, double largura) {
        if (altura <= 0 && largura <= 0) {
            System.out.println("Altura ou largura precisa ser maior que zero");
        }
        double area = altura * largura;
        System.out.println("A area tem a medida de: " + area + " m²");
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        if (altura <= 0 && largura <= 0) {
            System.out.println("Altura ou largura precisa ser maior que zero");
        }
        double perimetro = 2 * (altura + largura);
        System.out.println("O perimetro tem a medida de: " + perimetro + " metros");
    }
}
