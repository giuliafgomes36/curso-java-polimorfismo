package funcionarios;

public class Administrador extends Funcionario implements Autenticavel{

    private int senha;

    public void setSenha(int senha){
        this.senha = senha;
    }

    public boolean autentica(int senha){
        return this.senha == senha;
    }

    @Override
    public double getBonificacao() {
        return 50;
    }

}
