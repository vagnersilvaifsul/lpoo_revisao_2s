package controller;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaPublica;

import java.util.*;

public class PessoaController {
    public static void main(String[] args) {
//        Pessoa pessoa1 = new Pessoa();
        PessoaFisica pf1 = new PessoaFisica();
//        Pessoa pessoa2 = new Pessoa();
        PessoaJuridica pj1 = new PessoaJuridica();
        PessoaPublica pp1 = new PessoaPublica();
        System.out.println(pf1);
        System.out.println(pj1);
        System.out.println(pp1);
        pf1.setNome("Ana");
        pp1.setNome("Fulano");
        pf1.setSobrenome("Silva");
        System.out.println(pf1.getNome());
        pj1.setNome("Rafael");
        pj1.setSobrenome("Torres");
        System.out.println(pj1.getNome());
        System.out.println(pf1.getSobrenome());
        System.out.println(pj1.getSobrenome());
        pf1.setCpf("032.000.123-23");
        pj1.setCpf("143.000.678-45");
        System.out.println(pf1.getCpf());
        System.out.println(pj1.getCpf());
        System.out.println(pf1);
        System.out.println(pj1);
        System.out.println(pp1);

        // Tipo nomeDaVariavel = new ConstrutorDaClasse();
        //List<Pessoa> pessoasList = new ArrayList<>();
        //let<Pessoa> pessoasList = [];
        //$pessoasList = [];
        Map<String, Pessoa> pessoasMap = new HashMap<>();
        //Map<k, T>

        //1. Criar a coleção
        List<Pessoa> pessoasList = new ArrayList<>();
        //2. Popular a coleção
        pessoasList.add(pf1);
        pessoasList.add(pj1);
        pessoasList.add(pp1);

        System.out.println("Lista criada:");
        System.out.println(pessoasList);
        //3. Ordenação (critério de ordenação nome, descedente)
        pessoasList.sort(Comparator.comparing(Pessoa::getNome).reversed());
        System.out.println("Lista ordenada pelo critério nome (descedente):");
        System.out.println(pessoasList);

        //4. Pesquisa (chave nome da pessoa = "Rafael")
        //Pesquisa por força bruta
        System.out.println("Pesquisa por força bruta");
        pessoasList.forEach(p -> {

        });
        for (Pessoa p : pessoasList) {
            if(p.getNome().equals("Rafael")){
            System.out.println(p);
        }}

        //Pesquisa binária a partir da classe utilitária Collections
        System.out.println("Pesquisa binária da classe utilitária Collections");
        System.out.println(
            pessoasList.get(
            Collections.binarySearch(
                pessoasList,
                new PessoaFisica("Rafael", "Torres", "123.234.654-87"),
                Comparator.comparing(Pessoa::getNome)
            )
        ));

        //Pesquisa binária a partir de fluxos (ou streams, ou programação funcional)
        System.out.println("Pesquisa binária por fluxos (ou streams");
        System.out.println(
            pessoasList.stream()
            .filter(p -> p.getNome().equals("Rafael"))
            .findAny()
            .orElse(null)
        );


    }
}
