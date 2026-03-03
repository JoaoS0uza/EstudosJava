package Ex02;

public class Correr
{
    String local;
    int km;
    int tempo;
    String pace;
    boolean aquecido;

    void Status()
    {
        System.out.println("local: "+ this.local);
        System.out.println("Quilometragem: "+ this.km);
        System.out.println("Esta aquecido: "+ this.aquecido);
        System.out.println("Tempo: "+ this.tempo);
        System.out.println("Seu pace sera: "+ this.pace);
    }

    void Aquecer()
    {
        this.aquecido = true;
    }

    void Correr()
    {
        if (aquecido)
        {
            System.out.println("Correndo");
        }else
        {
            System.out.println("Aqueca primeiro demonio");
        }
    }
}
