package Ex05;

public class Bicicleta implements Transportes{
    private final double tarifa;
    private boolean emViagem;
    public double valorViagem;

    public Bicicleta() {
        this.tarifa = 0.2f;
        this.emViagem = false;
    }

    @Override
    public void iniciarViagem(Double distancia) {
        if (!emViagem){
            if (this.calcularTarifa(distancia)>0){
                this.emViagem = true;
                System.out.println("Voce iniciou uma viagem de bicicleta");
                System.out.println("Ficou no valor de: R$ "+this.valorViagem);
            }
        }else{
            System.out.println("Voce ja esta em viagem.");
        }
    }

    @Override
    public void finalizarViagem() {
        this.emViagem = false;
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
