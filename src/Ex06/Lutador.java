package Ex06;

public class Lutador {

    private String nome;
    private String nacionaliidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionaliidade, int idade, double altura, double pesgio, String categoria, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionaliidade = nacionaliidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar(){

    }

    public void Status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta(){

    }

    public void empatarLuta(){

    }

    public String getNacionaliidade() {
        return nacionaliidade;
    }

    public void setNacionaliidade(String nacionaliidade) {
        this.nacionaliidade = nacionaliidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double pesoo) {
        this.peso = pesoo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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
