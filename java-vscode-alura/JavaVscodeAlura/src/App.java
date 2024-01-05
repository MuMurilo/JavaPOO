import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        var artigo = new Artigo("Vs Code code", new Autor("Jacqueline oliveira"), LocalDate.of(2022, 07, 13) , Categoria.BACKEND);

        System.out.println(artigo);
    }
}
