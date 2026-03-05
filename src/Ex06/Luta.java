package Ex06;

public class Luta extends Lutador{

    private String desafiado, desafiante;
    private int rounds;
    private  boolean aprovada;



    public void marcarLuta(String desafiado, String desafiante){
        if (desafiado.super.categoria == desafiante.super.peso){
            this.aprovada = true;
        }else{
            this.aprovada = false;
        }
    }

    public void lutar(){
        if(aprovada){

        }

    }
}
