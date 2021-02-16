package bean;

//Interface = contrato
//Quem assinar esse contrato precisa implementar: metodo setSenha e metodo autentica

public interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);
}
