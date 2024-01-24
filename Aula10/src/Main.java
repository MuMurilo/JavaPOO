public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Antônio");
        p2.setNome("Bernado");
        p3.setNome("Cosme");
        p4.setNome("Damião");

        p2.setCurso("Informática");
        p3.setSalario(2500f);
        p4.setSetor("Estoque");



       /* p1.ReceberAumento(550.20f);
        p2.mudarTrabalho();
        p4.cancelarMatricula();*/

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}