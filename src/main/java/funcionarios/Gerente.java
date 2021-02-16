package funcionarios;

//Gerente herda da classe Funcionario e implementa a interface Autenticavel.
public class Gerente extends Funcionario implements Autenticavel{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        return this.senha == senha;
    }

    @Override
    public double getBonificacao(){
        System.out.println("Bonificação do GERENTE");
        return super.getSalario();//o this geralmente é usado quando o atibuto é definido na classe.
    }
}
