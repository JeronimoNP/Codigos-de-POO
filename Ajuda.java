package software.tela_de_login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class Ajuda extends JFrame implements ActionListener{
    JLabel mensagem;
    JButton ok;
    
    public Ajuda(){
        setLayout(new FlowLayout());
        setTitle("Sobre");
        setSize(400, 400);
        mensagem = new JLabel("Se vira besta fera!!! kkk");
        add(mensagem);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
