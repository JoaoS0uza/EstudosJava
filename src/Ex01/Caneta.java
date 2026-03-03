package Ex01;

public class Caneta
{
    public String modelo;
    public String cor;
    private int carga;
    protected float ponta;
    protected boolean tampada;

    public void status()
    {
        System.out.println("Modelo: "+ this.modelo);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Carga: "+ this.carga);
        System.out.println("Tipo de ponta: "+ this.ponta);
        System.out.println("Esta tampada: "+ this.tampada);
    }

    public void rabiscar()
    {
        if (!tampada)
        {
            System.out.println("Rabiscando");
        }else
        {
            System.out.println("ERRO!");
        }

    }

    protected void tampar()
    {
        this.tampada = true;
    }

    protected void destampar()
    {
        this.tampada = false;
    }
}
