package bean;

public class EditorVideo extends Funcionario{

    @Override
    public double getBonificacao() {
        System.out.println("Bonificação do EDITOR DE VIDEO");
        return 150;
    }
}
