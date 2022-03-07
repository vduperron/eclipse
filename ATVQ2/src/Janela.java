import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Janela extends JFrame {
    private int cliques;
    private JButton botao;
    private JTextField campo;

    public Janela() {
        super("Conta Cliques");
        cliques = 0;
        this.setLayout(new FlowLayout());
        botao = new JButton("CLIQUE");
        campo = new JTextField(15);
        campo.setText(String.valueOf(cliques));
        campo.setEditable(false);
        this.add(botao);
        this.add(campo);
        botao.addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    cliques++;
                    campo.setText(String.valueOf(cliques));
                }
            }
        );
    }
}