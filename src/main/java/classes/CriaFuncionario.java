package classes;

public class CriaFuncionario {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Giulia Ferreira");
        funcionario.setCpf("222.222.222-22");
        funcionario.setSalario(1000.00);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());

        Gerente gerente = new Gerente();
        gerente.setNome("Marcos");
        gerente.setCpf("333.333.333-33");
        gerente.setSalario(5000.00);
        gerente.setSenha(123);

        System.out.println(gerente.getNome());
        boolean autentica = gerente.autentica(123);

        System.out.println(autentica);

        System.out.println(gerente.getBonificacao());

    }
}
