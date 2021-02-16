package servicos;

import bean.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
    //Quando extendemos de uma classe com um construtor próprio, nossa classe filha apresenta um erro.
    //Isso pois as classes filhas não herdam construtores.

    //Criando um construtor para chamar o da super classe e passar os parâmetros devidos.
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override // -> anotação
    public boolean saca(double valor) {
        double valorSaque = valor + 0.2;
        return super.saca(valorSaque);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
