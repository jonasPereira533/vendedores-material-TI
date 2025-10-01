public class Vendedores {

    private String nome;
    private double valorDaVenda;
    private double comissao;

    public Vendedores (String nome, double valorDaVenda, double comissao){
        this.nome = nome;
        this.valorDaVenda = valorDaVenda;
        this.comissao = comissao;
    }

    public String getNome() {
        return nome;
    }



    public double getValorDaVenda() {
        return valorDaVenda;
    }



    public double getValorComissao() {
        return comissao;
    }


}
