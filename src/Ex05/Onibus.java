package Ex05;

import java.lang.invoke.VolatileCallSite;

public class Onibus implements Transportes {

    private final double tarifa;
    private boolean emViagem;
    public double valorViagem;

    public Onibus() {
        this.tarifa = 0.5f;
        this.emViagem = false;
    }

    @Override
    public void iniciarViagem(double distancia) {
        if (!emViagem){
            if (this.calcularTarifa(distancia)>0){
                this.emViagem = true;
                System.out.println("Voce iniciou a viagem uma onibus");
                System.out.printf("Ficou no valor de: R$ %.2f%n", this.valorViagem);
            }
        }else{
            System.out.println("Voce ja esta em viagem.");
        }
    }

    @Override
    public void finalizarViagem() {
        if (emViagem) {
            System.out.println("Voce finalizou a viagem");
            this.emViagem = false;
        }else {
            System.out.println("Este veiculo nao esta em viagem.");
        }
    }

    @Override
    public double calcularTarifa(double distancia) {
        if (distancia>0) {
            this.valorViagem = (distancia * this.tarifa);
            return valorViagem;
        }else{
            return 0;
        }
    }
}
