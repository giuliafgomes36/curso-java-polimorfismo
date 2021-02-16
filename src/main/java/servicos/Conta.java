package servicos;

public abstract class Conta {
    protected double saldo; //protected: classes filhas podem acessar.
    private int agencia;
    private int numero;
    private servicos.Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

    public abstract void deposita (double valor);

    public boolean saca (double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //Polimorfismo: "Conta destino" funciona para qualquer tipo de conta.
    public boolean transfere(double valor, Conta destino){
        if (this.saca(valor)){
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0){
            System.out.println("ERRO: Agência inválida");
            return;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0){
            System.out.println("ERRO: Número inválido");
        }
        this.numero = numero;
    }

    public servicos.Cliente getTitular() {
        return titular;
    }

    public void setTitular(servicos.Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
