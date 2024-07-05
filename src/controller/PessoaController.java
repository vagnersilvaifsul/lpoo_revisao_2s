package controller;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;
import model.PessoaPublica;

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
    }
}
