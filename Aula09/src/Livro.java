public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String ti, String aut, int totPag, Pessoa le) {
        this.titulo = ti;
        this.autor = aut;
        this.totalPaginas = totPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = le;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa nome) {
        this.leitor = nome;
    }

    public String detalhes() {
        return "Livro{" +
                "titulo='" + titulo  + '\'' +
                ",  \n autor='" + autor + '\'' +
                ",  \n totalPaginas=" + totalPaginas +
                ",  \n pagAtual=" + pagAtual +
                ",  \n aberto=" + aberto +
                ",  \n leitor=" + leitor.getNome() +
                '}';
    }


    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.abrir();
        if (p> this.totalPaginas){
            p = this.getTotalPaginas();
        }else {
            this.setPagAtual(p);
        }
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual()-1);
    }
}
