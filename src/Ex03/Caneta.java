package Ex03;

import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignedObject;

public class Caneta
{
    public String modelo;
    private float ponta;

    public void status(){

        System.out.println("A ponte e: "+ getPonta());
        System.out.println("O modelo e: "+ getModelo());
    }

    public Caneta(String modelo, float ponta) {
        this.modelo = modelo;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
}
