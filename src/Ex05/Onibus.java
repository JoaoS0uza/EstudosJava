package Ex05;

public class Onibus implements Transportes {

    private final double tarifa;
    private boolean emViagem;
    public double valorViagem;

    public Onibus() {
        this.tarifa = 0.5f;
        this.emViagem = false;
    }

    @Override
    public void iniciarViagem(Double distancia) {
        if (!emViagem){
            if (this.calcularTarifa(distancia)>0){
                this.emViagem = true;
                System.out.println("Voce iniciou a viagem uma onibus");
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
