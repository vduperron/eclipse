public class Livro extends Produto {
    private String autor;

    public Livro(String t, double p, String a, String c) {
        super(t, p, c);
        this.autor = a;
    }

    @Override
    public String toString() {
        return "{" +
            "titulo='" + super.getTitulo() + "'" +
            "Preço='" + super.getPreco() + "'" +
            " autor='" + getAutor() + "'" +
            "}";
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
