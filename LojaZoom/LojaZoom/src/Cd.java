public class Cd extends Produto{
    private int numeroFaixas;

    public Cd(String t, double p, int n, String c) {
        super(t, p, c);
        this.numeroFaixas = n;
    }


    @Override
    public String toString() {
        return "{" +
            "titulo='" + super.getTitulo() + "'" +
            "Preço='" + super.getPreco() + "'" +
            " numeroFaixas='" + getNumeroFaixas() + "'" +
            "}";
    }


    public int getNumeroFaixas() {
        return this.numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }
}
