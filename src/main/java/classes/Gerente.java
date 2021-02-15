package classes;

//Gerente herda da classe Funcionario
public class Gerente extends Funcionario{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public double getBonificacao(){
        return super.getBonificacao() + super.getSalario();//o this geralmente é usado quando o atibuto é definido na classe.
    }

    public boolean autentica (int senha){
        return this.senha == senha;
    }


}
