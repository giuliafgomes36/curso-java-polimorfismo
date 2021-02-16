package contas;

public class ContaCorrente extends Conta{
    //Quando extendemos de uma classe com um construtor próprio, nossa classe filha apresenta um erro.
    //Isso pois as classes filhas não herdam construtores.

    //Criando um construtor para chamar o da super classe e passar os parâmetros devidos.
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

}
