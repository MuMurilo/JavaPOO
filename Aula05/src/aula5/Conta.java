package aula5;

public class Conta {

    public String numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta() {
        this.setSaldo(0f);
        this.setStatus(false);
    }

    public void dadosConta(){
        System.out.println("Status da Conta: "+this.getTipo());
        System.out.println("Numero da Conta: "+this.getNumConta());
        System.out.println("Nome do dono da conta: "+this.getDono());
        System.out.println("Saldo da Conta: "+this.getSaldo());
        System.out.println("Status da Conta: "+this.isStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);

        if (t =="CC"){
            this.setSaldo(50f);
            System.out.println("Conta aberta com Sucesso");
        }else if (t=="CP"){
            this.setSaldo(100f);
        }
    }
    public void fecharConta(){
        if (saldo>0f){
            System.out.println("Conta Com Dinheiro (não Pode Ser fechada!)");
        } else if (saldo<0f) {
            System.out.println("Conta Com Saldo Negativo(Não Pode ser Fechada)");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com Sucesso");
        }
    }
    public void depositar(float v){
        if (status = true){
            this.setSaldo(getSaldo()+v);
        }else {
            System.out.println("Impossivel efetuar o depósito");
        }
    }
    public void sacar(float v){
        if (status = true){
            this.setSaldo(getSaldo()-v);
        }else {
            System.out.println("Impossivel efetuar o saque");
        }

    }
    public void pagarMensalidade(){
        float   v;
        if (this.getTipo()=="CC"){
            v = 12f;
            this.setSaldo(getSaldo()-v);
        } else if (this.getTipo()=="CP") {
            v=20f;
            this.setSaldo(getSaldo()-v);
        }
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
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
