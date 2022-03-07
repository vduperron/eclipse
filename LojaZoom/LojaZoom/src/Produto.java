public abstract class Produto {
    private String titulo;
    private double preco;
    private String codigoDeBarras;

    public Produto(String t, double p, String c) {
        this.titulo = t;
        this.preco = p;
        this.codigoDeBarras = c;        
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigoDeBarras() {
        return this.codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public boolean equals(Produto p) {
        if (this.getCodigoDeBarras().equals(p.getCodigoDeBarras())) {
            return true;
        } else {
            return false;
        }
    }


}
