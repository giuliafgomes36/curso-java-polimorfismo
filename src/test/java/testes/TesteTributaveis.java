package testes;

import servicos.ContaCorrente;
import servicos.SeguroVida;
import sistemas.CalculadorImposto;

public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(222,222);
        contaCorrente.deposita(100);

        SeguroVida seguroVida = new SeguroVida();

        CalculadorImposto calculadorImposto = new CalculadorImposto();
        calculadorImposto.registra(contaCorrente);
        calculadorImposto.registra(seguroVida);

        System.out.println(calculadorImposto.getTotal());
    }
}
