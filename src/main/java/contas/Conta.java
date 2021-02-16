package contas;

public class Conta {
    //Os atributos por padrão são zerados.
    private double saldo;
    private int agencia;
    private int numero;
    private contas.Cliente titular;
    private static int total;//O static esta se referenciando à classe e não a um objeto em específico (lembra uma variável global)

    public Conta(int agencia, int numero){
        Conta.total++;
        this.setAgencia(agencia);
        this.setNumero(numero);
    }

    public void deposita (double valor){
        this.saldo += valor;//Usamos o this para referir ao atributo do objeto que invocou o método.
    }

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

    public contas.Cliente getTitular() {
        return titular;
    }

    public void setTitular(contas.Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal(){
        return Conta.total;
    }
}
