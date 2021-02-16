package funcionarios;

//Gerente herda da classe Funcionario e implementa a interface Autenticavel.
public class Gerente extends Funcionario implements Autenticavel{

    private Autenticador autenticador;

    public Gerente(){
        this.autenticador = new Autenticador();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    @Override
    public double getBonificacao(){
        System.out.println("Bonificação do GERENTE");
        return super.getSalario();//o this geralmente é usado quando o atibuto é definido na classe.
    }
}
