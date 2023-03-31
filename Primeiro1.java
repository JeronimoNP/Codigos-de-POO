package ifma.primeiro1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Primeiro1 extends JFrame implements ActionListener{
    
    JComboBox cbEst, cbCid;
    JLabel lNome, lSobre, lEst, lCid;
    JTextField tfNome, tfSobre;
    JButton bSalvar, bLimpar, bSair;
    
    String [] ma = {"", "Imperatriz", "São Luiz", "Açailandia"};
    String [] pi = {"", "teresina", "Floriano", "Luis"};
    String [] ce = {"", "Fortaleza", "Sobral", "Tianguá"};
    
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
        
        //combo box
        lEst = new JLabel("Estado");
        add(lEst);
        String [] est = {"", "Maranhão", "Piaui", "Ceará"};
        cbEst = new JComboBox(est);
        cbEst.addActionListener(this);
        add(cbEst);
        
        lCid = new JLabel("Cidade");
        add(lCid);
        cbEst = new JComboBox();
        add(cbEst);
        
        //botão salvar
        bSalvar = new JButton("Salvar"); //Adicionando o botão variavel
        bSalvar.setToolTipText("Salva os dados.");
        bSalvar.addActionListener(this);
        add(bSalvar);               //adicionando ao programa
        
        //botão limpar
        bLimpar = new JButton("Limpar");
        bLimpar.setToolTipText("Limpa os campos.");
        bLimpar.addActionListener(this);                    //Declarando que esse botão vai ter uma função quando apertado
        add(bLimpar);
        
        //botão Sair
        bSair = new JButton("Sair");
        bSair.setToolTipText("Sair do programa.");
        bSair.addActionListener(this);
        add(bSair);
        
        
        
        setSize(800, 600);  //criação da tela!
        setVisible(true);
    } 
    
    public static void main(String [] args){
        Primeiro1 s = new Primeiro1();
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){                 //Criei um public para adicionar as funções dos botões
        
        if(ae.getSource() == cbEst){
         if(cbEst.getSelectedIndex() == 0){
             cbCid.removeAllItems();
         }else if(cbEst.getSelectedIndex() == 1){
             cbCid.removeAllItems();
             for(int i=0; i<=3; i++)
                 cbCid.insertItemAt(ma[i], i);
         } 
         }
        
        if(ae.getSource() == bSalvar){
            JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
            }else if(ae.getSource() == bLimpar){
                tfNome.setText("");
                tfSobre.setText("");
                cbEst.setSelectedIndex(0);
            }else if(ae.getSource() == tfNome){
                tfSobre.requestFocus();
            }else if(ae.getSource() == bSair){
                System.exit(0);
            }
     }
}
