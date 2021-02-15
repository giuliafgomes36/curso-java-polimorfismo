package testes;

import classes.Funcionario;
import classes.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        //Posso declarar a variável do tipo mais genérico e usar o construtor da filha (Funcionario > Gerente).
        //O gerente é um funcionário.
        Funcionario gerente = new Gerente();
        gerente.setNome("Giovanna");
        System.out.println(gerente.getNome());

        //gerente.autentica(123); -> não funciona porque funcionário não tem o método autentica.

    }
}
