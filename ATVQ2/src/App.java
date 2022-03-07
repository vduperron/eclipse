import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        Janela app = new Janela();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(300, 120);
        app.setVisible(true);
    }
}
