public class Dvd extends Produto{
    private double duracao;

    public Dvd(String t, double p, double d, String c) {
        super(t, p, c);
        this.duracao = d;
    }


    @Override
    public String toString() {
        return "{" +
            "titulo='" + super.getTitulo() + "'" +
            "Preço='" + super.getPreco() + "'" +
            " duracao='" + getDuracao() + "'" +
            "}";
    }


    public double getDuracao() {
        return this.duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

}
