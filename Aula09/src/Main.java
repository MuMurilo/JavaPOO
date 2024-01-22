public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[3];
        Livro[] l = new Livro[3];
            p[0] = new Pessoa("Murilo",32,"Masculino");
            p[1] = new Pessoa("Flavia",34,"Feminino");
            p[2] = new Pessoa("Tommy",5,"Masculino");

            l[0] = new Livro("BENTO", "André Vianco", 320,p[0]);
            l[1] = new Livro("Guerra dos tronos", "George R.R. Martin", 500, p[2]);
            l[3] = new Livro("O pistoleiro", "Stephen king",150, p[1]);


            l[0].detalhes();
    }
}