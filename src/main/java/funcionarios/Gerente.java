package funcionarios;

//Gerente herda da classe Funcionario Autenticavel
public class Gerente extends FuncionarioAutenticavel{

    @Override
    public double getBonificacao(){
        System.out.println("Bonificação do GERENTE");
        return super.getSalario();//o this geralmente é usado quando o atibuto é definido na classe.
    }

}
