package Ex06;

import java.util.Random;

import static java.lang.Math.random;

public class Luta {

            private Lutador desafiado, desafiante;
            private int rounds;
            private  boolean aprovada;



            public void marcarLuta(Lutador l1, Lutador l2){
                if ((l1.getCategoria().equals(l2.getCategoria())) && (!l1.equals(l2))){
                    this.aprovada = true;
                    this.desafiado = l1;
                    this.desafiante = l2;
                }else{
                    this.aprovada = false;
                }
            }

            public void lutar() {
                if (aprovada) {
                    desafiado.apresentar();
                    desafiante.apresentar();
                    int vencedor = (int) (Math.random() * 3);
                    switch (vencedor) {

                        case 0:
                            System.out.println("__________________________");
                            System.out.println("Empatou");
                            System.out.println("__________________________");
                            desafiante.empatarLuta();
                            desafiado.empatarLuta();
                            break;
                        case 1:
                            System.out.println("__________________________");
                            System.out.println("Lutador " + desafiado.getNome() + " Ganhou");
                            System.out.println("__________________________");
                            desafiado.ganharLuta();
                            desafiante.perderLuta();
                            break;
                        case 2:
                            System.out.println("__________________________");
                            System.out.println("Lutador " + desafiante.getNome() + " Ganhou");
                            System.out.println("__________________________");
                            desafiante.ganharLuta();
                            desafiado.perderLuta();
                            break;
                    }
                } else {
                    System.out.println("A luta nao pode acontecer");
                }
            }
}