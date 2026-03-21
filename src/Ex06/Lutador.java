package Ex06;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){
        System.out.println("_____________________________________");
        System.out.println("O lutador " +this.nome + " do "+this.nacionalidade);
        System.out.printf("Com %d anos, %.2f m e pesando seus %.2f Kg.", this.idade, this.altura,this.peso);
        System.out.println(" Tem o cartel de " +this.vitorias +" Vitorias, " +this.empates + " empates e "+this.derrotas+" Derrotas!");

    }

    public void status(){
        System.out.printf("_______ O status do lutador %s _______", this.nome);
        System.out.println();
        System.out.println("Categoria: Peso "+this.categoria);
        System.out.println("Cartel: V:"+this.vitorias+" D:"+this.derrotas+" E:"+this.empates);
    }

    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    private void setCategoria(double peso) {
        if (this.peso<52.2){
            this.categoria = "Invalido";
        }else if(this.peso<=70.3){
            this.categoria = "Leve";
        }else if(this.peso<=83.9){
            this.categoria = "Medio";
        }else if(this.peso<=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria(peso);
    }

    public String getCategoria() {
        return categoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
