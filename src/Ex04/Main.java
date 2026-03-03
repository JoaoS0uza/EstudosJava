package Ex04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int operacao = 0;
        Conta[] contas = new Conta[10];
        int numContas = 0;
        int acessoConta;


        while (operacao != 7) {
            switch (operacao) {

                case  0 :
                    System.out.println("Selecione a operacao:");
                    System.out.println("1.Abrir Conta");
                    System.out.println("2.Depositar Dinheiro");
                    System.out.println("3.Sacar Dinheiro");
                    System.out.println("4.Pagar Mensalidade");
                    System.out.println("5.Fechar Conta");
                    System.out.println("6.Consultar Status");
                    System.out.println("7.Sair");
                    operacao = scan.nextInt();
                    scan.nextLine();
                    break;

                case 1:
                    System.out.println("Voce esta criando uma conta:");
                    System.out.println("digite o seu nome: ");
                    String dono = scan.nextLine();
                    System.out.println("Digite o tipo de conta, CC ou CP: ");
                    String tipo = scan.nextLine();
                    contas[numContas] = new Conta(dono, tipo, numContas);
                    System.out.println("O numero da sua conta e: "+ numContas);
                    numContas++;
                    operacao = 0;
                    break;

                case 2:
                    System.out.println("Realizando Deposito");
                    System.out.println("Qual o numero da Conta: ");
                    acessoConta = scan.nextInt();
                    System.out.println("Quanto deseja depositar: ");
                    contas[acessoConta].deposito(scan.nextFloat());

                    operacao = 0;
                    break;

                case 3:
                    System.out.println("Realizando Saque");
                    System.out.println("Qual o numero da Conta: ");
                    acessoConta = scan.nextInt();
                    System.out.println("Quanto deseja sacar: ");
                    contas[acessoConta].saque(scan.nextFloat());

                    operacao = 0;
                    break;

                case 4:
                    System.out.println("Pagando mensalidade");
                    System.out.println("Qual o numero da Conta: ");
                    acessoConta = scan.nextInt();
                    contas[acessoConta].pagarMensalidade();

                    operacao = 0;
                    break;

                case 5:
                    int certeza;
                    System.out.println("Fechando Conta");
                    System.out.println("Qual o numero da Conta: ");
                    acessoConta = scan.nextInt();
                    System.out.println("Deseja fazer isso mesmo?");
                    System.out.println("1.Sim");
                    System.out.println("2.Nao");
                    certeza = scan.nextInt();
                    if (certeza == 1){
                        contas[acessoConta].fecharConta();
                    }else if (certeza == 2){
                        System.out.println("Certo, retornando.");
                        operacao = 0;
                        break;
                    }
                    operacao = 0;
                    break;

                case 6:
                    System.out.println("Consultando o status da conta");
                    System.out.println("Qual o numero da Conta: ");
                    acessoConta = scan.nextInt();
                    contas[acessoConta].infoConta();
                    operacao = 0;
                    break;
            }
        }
    }
}
