package model;

public class PessoaJuridica extends Pessoa {

    @Override
    public String toString() {
        return "PessoaJuridica{" +
            "nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", cpf='" + cpf + '\'' +
            "} ";
    }
}
