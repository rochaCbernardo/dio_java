package main.list.Ordenacao;
import java.util.*;
public class OrdenacaoNumero{
    private List<Numero> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int num){
        numeros.add(new Numero(num));
    }
    public List<Numero> ordenarAscendente(){
        List<Numero> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    ordenarDescendente(){}

}
