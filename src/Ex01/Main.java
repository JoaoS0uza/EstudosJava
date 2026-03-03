package Ex01;


public class Main
{
    public static void main(String[] args)
    {
        Caneta c1 = new Caneta();

        c1.ponta = 0.5f;
        // c1.carga = 100;
        c1.cor = "Azul";
        c1.modelo = "Bic";

        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.rabiscar();

    }
}