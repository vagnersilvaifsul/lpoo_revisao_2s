package model;

public class PessoaPublica extends Pessoa {

    @Override
    public String toString() {
        return "PessoaPublica{" +
            "nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", cpf='" + cpf + '\'' +
            "} ";
    }
}
