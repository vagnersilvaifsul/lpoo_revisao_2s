package model;

public class PessoaFisica extends Pessoa implements Investidor {
    private String ticker;
    private int quantidade;

    @Override
    public String getTicker() {
        return this.ticker;
    }

    @Override
    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nPessoaFisica{" +
            "ticker='" + ticker + '\'' +
            ", quantidade=" + quantidade +
            ", nome='" + nome + '\'' +
            ", sobrenome='" + sobrenome + '\'' +
            ", cpf='" + cpf + '\'' +
            "} ";
    }
}
