package Ex04;

public class Conta{

    private int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(String dono, String tipo, int numConta) {

        this.abrirConta(dono, tipo, numConta);
    }

    public void abrirConta(String dono, String tipo, int numConta){

        this.dono = dono;
        this.tipo = tipo;
        this.status = true;
        this.numConta = numConta;
        if (tipo.equals("CC")){

            setSaldo(50f);

        }else if(tipo.equals("CP")) {

            setSaldo(150f);
        }
    }

    public void fecharConta(){
        this.status = false;
    }

    public void deposito(float valorDeposito){
        if (this.status){
            this.saldo+= valorDeposito;
            System.out.println("Seu saldo atual agora e: "+this.saldo);
        }else{
            System.out.println("A conta esta fechada");
        }
    }

    public void saque(float valorSaque){

        if (this.isStatus()){
            if (valorSaque <= this.saldo){
                this.saldo-= valorSaque;
                System.out.println("Seu saldo atual agora e: "+this.saldo);
            }else{
                System.out.println("Saldo insulficiente");
            }
        }else{
            System.out.println("A conta esta fechada");
        }

    }

    public void pagarMensalidade(){
        if (this.isStatus()){
            if (tipo.equals("CC")){

                System.out.println("Esta sendo debitado de sua conta: R$ ");
                setSaldo(this.saldo - 12f);
                System.out.println("Seu saldo atual agora e: "+this.saldo);

            }else if(tipo.equals("CP")) {

                System.out.println("Esta sendo debitado de sua conta: R$ ");
                setSaldo(this.saldo - 20f);
                System.out.println("Seu saldo atual agora e: "+this.saldo);
            }
        }else{
            System.out.println("A conta esta fechada");
        }
    }

    public void infoConta(){
        System.out.println("Numero: "+numConta);
        System.out.println("Dono: "+dono);
        System.out.println("Tipo: "+tipo);
        System.out.println("Saldo: R$ "+saldo);
        System.out.println("Status: "+ ((isStatus()) ? "Aberta" : "Fechada"));
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

