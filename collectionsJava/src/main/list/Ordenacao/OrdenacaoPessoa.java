package main.list.Ordenacao;
import java.util.*;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarIdade(){
        List<Pessoa> pessoasIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasIdade);
        return pessoasIdade;
    }
    public List<Pessoa> ordenarAltura(){
        List<Pessoa> pessoasAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasAltura, new ComparatorAltura());
        return pessoasAltura;
    }
}
