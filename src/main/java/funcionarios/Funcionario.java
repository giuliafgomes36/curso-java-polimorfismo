package funcionarios;

//Indicando que a classe é abstrata, não pode ser instanciada
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double  salario;

    //Tornamos esse método abstrato para que possamos usar o polimorfismo sobre ele.
    //Dessa forma, não é necessaria nenhuma implementação padrão.
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
