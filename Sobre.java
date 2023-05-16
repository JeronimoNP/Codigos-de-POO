package software.tela_de_login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Sobre extends JFrame implements ActionListener{
    JLabel Sobre, Sobre1;
    JButton ok;
    
    public Sobre(){
        setLayout(new FlowLayout());
        setTitle("Sobre");
        setSize(400, 400);
       
        
        Sobre = new JLabel("Este foi o primerio programa feito");
        add(Sobre);
        Sobre1 = new JLabel(" por Jerônimo Noleto usando Java!");
        add(Sobre1);        
        ok = new JButton("OK");
        ok.setToolTipText("Sair");
        ok.addActionListener(this);
        add(ok);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ok){
            setVisible(false);
        }
    }
}