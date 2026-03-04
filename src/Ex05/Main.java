package Ex05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Transportes> meiosTransportes = new ArrayList<Transportes>();
        meiosTransportes.add(new Onibus());
        meiosTransportes.add(new Trem());
        meiosTransportes.add( new Bicicleta());

        Scanner scan = new Scanner(System.in);

        int operacao = 0;
        while (operacao!= 3) {
            switch (operacao) {

                case 0:
                    System.out.println("____MENU DE VIAGEM____");
                    System.out.println("1.Inciar uma viagem.");
                    System.out.println("2.Finalizar uma viagem.");
                    System.out.println("3.Sair");
                    operacao = scan.nextInt();
                    scan.nextLine();
                    break;

                case 1:
                    int meio;
                    double distancia;

                    System.out.println("Voce esta iniciando uma viagem.");
                    System.out.println("Escolha um meio de transporte: ");
                    System.out.println("1.Onibus");
                    System.out.println("2.Trem");
                    System.out.println("3.Bicicleta");
                    meio = scan.nextInt();

                    System.out.println("Qual distancia percorrera: ");
                    distancia = scan.nextDouble();

                    meiosTransportes.get(meio - 1).iniciarViagem(distancia);
                    operacao = 0;
                    break;
                case 2:

                    System.out.println("Voce esta finalizando uma viagem.");
                    System.out.println("Utilizou qual meio de transporte: ");
                    System.out.println("1.Onibus");
                    System.out.println("2.Trem");
                    System.out.println("3.Bicicleta");
                    meio = scan.nextInt();
                    meiosTransportes.get(meio - 1).finalizarViagem();
                    operacao = 0;
                    break;
            }
        }
    }
}
