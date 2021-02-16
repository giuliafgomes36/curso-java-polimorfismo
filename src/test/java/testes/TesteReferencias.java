package testes;

import sistemas.ControleBonificacao;
import bean.EditorVideo;
import bean.Funcionario;
import bean.Gerente;

public class TesteReferencias {

    public static void main(String[] args) {

        //Posso declarar a variável do tipo mais genérico e usar o construtor da filha (Funcionario > Gerente).
        //O gerente é um funcionário.
        Funcionario gerente = new Gerente();
        gerente.setNome("Giovanna");
        System.out.println(gerente.getNome());

        //gerente.autentica(123); -> não funciona porque funcionário não tem o método autentica.

        //Polimorfismo entre funcionários:

        Gerente g1 = new Gerente();
        g1.setNome("Luana");
        g1.setSalario(5000);

        EditorVideo ev1 = new EditorVideo();
        ev1.setNome("Rodes");
        ev1.setSalario(2500);

        ControleBonificacao controleBonificacao = new ControleBonificacao();
        controleBonificacao.contador(g1);
        controleBonificacao.contador(ev1);

        System.out.println(controleBonificacao.getSoma());





    }
}
