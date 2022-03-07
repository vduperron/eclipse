import java.util.ArrayList;

public class App {

    public static int busca(Produto p, ArrayList<Produto> l) {
        int index = -1;
        for (int i=0; i < l.size(); i++) {
            if (p == l.get(i)) {
                index =  l.indexOf(p);
                break;
            }
        } 
        return index;
    }


    public static void main(String[] args) throws Exception {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        Produto p1 = new Livro("1984", 30, "George Orwell", "02455468");
        produtos.add(p1);
        Produto p2 = new Livro("Uma Breve Historia do Tempo", 20, "Stephen Hawking", "15648648");
        produtos.add(p2);
        Produto p3 = new Dvd("Os Vingadores", 50, 180, "15476254");
        produtos.add(p3);
        Produto p4 = new Cd("Summer Eletrohits", 15, 17, "12863951");
        produtos.add(p4);
        Produto p5 = new Livro("Dom Casmurro", 20, "Machado de Assis", "09846317");
        produtos.add(p5);
        for (int p = 0; p < produtos.size(); p++) {
            System.out.println(produtos.get(p).toString());
        }
        Produto p6 = new Livro("1984", 30, "George Orwell", "02455468");
        produtos.add(p6);
        Produto p7 = new Livro("1984", 30, "George Orwell", "11659324");
        produtos.add(p7);
        System.out.println("Index " + busca(p1, produtos));
        System.out.println("Index " + busca(p6, produtos));
        System.out.println("Index " + busca(p7, produtos));
        System.out.println("São iguais? " + p1.equals(p6));
        System.out.println("São iguais? " + p1.equals(p7));
    }
}
