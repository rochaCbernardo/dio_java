package main.list.Ordenacao;
import java.util.*;
public class OrdenacaoNumero implements Comparable{
    private List<Integer> numeros;

    public OrdenacaoNumero() {
        this.numeros = new ArrayList<>();
    }

    public int compareToAsc(Integer n) {
        return Integer.compare(this.numeros, n);
    }

    public void adicionarNumero(int num){
        numeros.add(num);
    }
    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }
    ordenarDescendente(){}

}
