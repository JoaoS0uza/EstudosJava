package Ex06;

import java.util.Random;

import static java.lang.Math.random;

public class Luta {

            private Lutador desafiado, desafiante;
            private int rounds;
            private  boolean aprovada;



            public void marcarLuta(Lutador desafiado, Lutador desafiante){
                if ((desafiado.getCategoria() == desafiante.getCategoria()) && (!desafiado.equals(desafiante))){
                    this.aprovada = true;
                    Lutador l1 = desafiado;
                    Lutador l2 = desafiante;
                }else{
                    this.aprovada = false;
                }
            }

            public void lutar(Lutador l1, Lutador l2) {
                if (aprovada) {
                    desafiado.apresentar();
                    desafiante.apresentar();
                    int vencedor = (int) (Math.random() * 3);
                    switch (vencedor) {

                        case 0:
                            System.out.println("Empatou");
                            desafiante.empatarLuta();
                            desafiado.empatarLuta();
                        case 1:
                            System.out.println("Lutador " + desafiado.getNome() + " Ganhou");
                            desafiado.ganharLuta();
                            desafiante.perderLuta();
                        case 2:
                            System.out.println("Lutador " + desafiante.getNome() + " Ganhou");
                            desafiante.ganharLuta();
                            desafiado.perderLuta();
                    }
                } else {
                    System.out.println("A luta nao pode acontecer");
                }
            }
}