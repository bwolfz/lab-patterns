package dio.strategy;

public class ComportamentoAgressivo implements Comportamento {
    @Override
    public void mover() {
        System.out.println("Está se movendo agressivamente.");
    }
}
