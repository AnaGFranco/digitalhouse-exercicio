package ExerciciosJAVA.DAKAR;

public class Carro extends Veiculo{

    private static double PESO_CARRO = 1000.0;
    private static int QNT_RODAS = 4;

    public Carro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa, PESO_CARRO, QNT_RODAS);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
