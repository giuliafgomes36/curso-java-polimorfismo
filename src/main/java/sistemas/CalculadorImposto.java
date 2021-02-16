package sistemas;

import bean.Tributavel;

public class CalculadorImposto {

    private double total;

    public void registra(Tributavel tributavel){
        total += tributavel.getValorImposto();
    }

    public double getTotal() {
        return total;
    }
}
