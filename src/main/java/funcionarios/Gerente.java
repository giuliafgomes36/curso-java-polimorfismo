package funcionarios;

//Gerente herda da classe Funcionario
public class Gerente extends Funcionario{

    private int senha;

    @Override
    public double getBonificacao(){
        System.out.println("Bonificação do GERENTE");
        return super.getSalario();//o this geralmente é usado quando o atibuto é definido na classe.
    }

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica (int senha){
        return this.senha == senha;
    }


}
