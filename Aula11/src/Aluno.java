public class Aluno extends Pessoa{

    private String matricula;
    private String curso;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public  void pagarMensalidade(){
        System.out.println("Pagando mensalidade de "+this.nome);
    }
}
