package funcionarios;

public class EditorVideo extends Funcionario{

    public double getBonificacao() {
        System.out.println("Bonificação do EDITOR DE VIDEO");
        return super.getBonificacao() + 100;
    }
}
