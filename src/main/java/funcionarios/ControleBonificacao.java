package funcionarios;

public class ControleBonificacao {

    private double soma;

    //Pega a bonificação de um funcionário e coloca dentro da variável soma.
    public void contador (Funcionario funcionario){
        this.soma += funcionario.getBonificacao();
    }

    public double getSoma(){
        return this.soma;
    }

}
