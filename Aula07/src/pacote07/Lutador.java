package pacote07;

public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Origem: "+this.getNacionalidade());
        System.out.println(this.getIdade() + "Anos");
        System.out.println(this.getAltura()+"m de altura");
        System.out.println("Pesando: "+this.getPeso());
        System.out.println("Da categoria: "+ this.getCategoria());
        System.out.println("Com o cartel de: "+this.getVitorias()+"V-"+this.getDerrotas()+"D-"+this.getEmpates()+"E");

    }
    public void status(){
        System.out.println(this.getNome());
        System.out.println(this.getPeso());
        System.out.println(this.getCategoria());
        System.out.println(this.getVitorias());
        System.out.println(this.getDerrotas());
        System.out.println(this.getEmpates());
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    private void setCategoria() {
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String ca) {
        this.categoria = ca;
        if (peso<52.2){
            this.categoria = "Inválido";
        } else if (peso<=70.3) {
            this.categoria= "Leve";
        } else if (peso<=83.9) {
            this.categoria = "Médio";
        } else if (peso<=120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }
}
