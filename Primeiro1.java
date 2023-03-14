package ifma.primeiro1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Primeiro1 extends JFrame implements ActionListener{
    
    JLabel lNome, lSobre;
    JTextField tfNome, tfSobre;
    JButton bSalvar, bLimpar, bSair;
    
    public Primeiro1() {
        setLayout(new FlowLayout());
        
        //adicionando 
        lNome = new JLabel("Nome");           //Essa parte é para colocar a string na varialvel do nome
        add(lNome);                           //adicinando ao programa
        tfNome = new JTextField(10);
        add(tfNome);
        
        lSobre = new JLabel("Sobrenome");
        add(lSobre);
        tfSobre = new JTextField(10);
        add(tfSobre);
        
        //botão salvar
        bSalvar = new JButton("Salvar"); //Adicionando o botão variavel
        bSalvar.setToolTipText("Salva os dados.");
        add(bSalvar);               //adicionando ao programa
        
        //botão limpar
        bLimpar = new JButton("Limpar");
        bLimpar.setToolTipText("Limpa os campos.");
        add(bLimpar);
        
        //botão Sair
        bSair = new JButton("Sair");
        bSair.setToolTipText("Sair do programa.");
        add(bSair);
        
        
        
        setSize(800, 600);  //criação da tela!
        setVisible(true);
    } 
    @Override
    public static void main(){
        Primeiro1 s = new Primeiro1();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
