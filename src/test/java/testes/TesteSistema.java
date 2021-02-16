package testes;

import servicos.Cliente;
import bean.Administrador;
import bean.Autenticavel;
import bean.Gerente;
import sistemas.SistemaInterno;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setSenha(2222);

        Administrador administrador = new Administrador();
        administrador.setSenha(3333);

        Autenticavel referencia = new Cliente();
        referencia.setSenha(4444);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(gerente);
        sistemaInterno.autentica(administrador);
        sistemaInterno.autentica(referencia);
    }
}
