package Ex05;

public class Trem implements Transportes{
    private final double tarifa;
    private boolean emViagem;
    public double valorViagem;

    public Trem() {
        this.tarifa = 0.8f;
        this.emViagem = false;
    }

    @Override
    public void iniciarViagem(double distancia) {
        if (!emViagem){
            if (this.calcularTarifa(distancia)>0){
                this.emViagem = true;
                System.out.println("Voce iniciou uma viagem de trem");
                System.out.printf("Ficou no valor de: R$ %.2f%n", this.valorViagem);
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
