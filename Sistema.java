package software.tela_de_login;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.*;


public class Sistema extends JFrame implements ActionListener{

    private static void setMnemonic(char c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    JMenuItem salvar, limpar, sair, recortar, copiar, colar, ajudaI, sobre;
    JMenu arquivo, editar, ajuda;
    JMenuBar menuBar;
    
    JComboBox cbEst, cbCid;
    JLabel lNome, lSobre, lEst, lCid;
    JTextField tfNome, tfSobre;
    JButton bSalvar, bLimpar, bSair;
    JCheckBox checkmascul, checkfemini;
    JRadioButton radiob1, radiob2;
    ButtonGroup bgOp;
    
    String [] ma = {"", "Imperatriz", "São Luiz", "Açailandia"};
    String [] pi = {"", "teresina", "Floriano", "Luis"};
    String [] ce = {"", "Fortaleza", "Sobral", "Tianguá"};
    
    public Sistema(){
        setLayout(new FlowLayout());
        Sistema.setMnemonic('a');
        //Configurando a barra
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        //declarando e adicionando as opções
        arquivo = new JMenu("Arquivo");
        editar = new JMenu("Editar");
        ajuda = new JMenu("Ajuda");
        menuBar.add(arquivo);
        menuBar.add(editar);
        menuBar.add(ajuda);
        //Adicionando as opções
        salvar = new JMenuItem("Salvar");
        limpar = new JMenuItem("Limpar");
        sair = new JMenuItem("Sair");
        recortar = new JMenuItem("Recortar");
        copiar = new JMenuItem("Copiar");
        colar = new JMenuItem("Colar");
        ajudaI = new JMenuItem("Ajuda");
        sobre = new JMenuItem("Sobre");
        sobre.addActionListener(this);
        sair.addActionListener(this);
        arquivo.add(salvar);
        arquivo.add(limpar);
        arquivo.add(sair);
        editar.add(recortar);
        editar.add(copiar);
        editar.add(colar);
        ajuda.add(ajudaI);
      //  Sistema.addSeparador();
        ajuda.add(sobre);
        //configuração feita do menu barra
        //configurando botões e campos de texto
        
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
        cbCid = new JComboBox();
        add(cbCid);
        
        //Check Box
        checkmascul = new JCheckBox("Masculino");
        checkmascul.addActionListener(this);
        add(checkmascul);
        
        checkfemini = new JCheckBox("Feminino");
        checkfemini.addActionListener(this);
        add(checkfemini);
        
        radiob1 = new JRadioButton("online");
        add(radiob1);
        
        radiob2 = new JRadioButton("offline");
        add(radiob2);
        
        
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
        

       
       
        
        setSize(800, 600);
        setVisible(true);
        setTitle("Tela de Login");
        
    
}
public static void main(String[] args) {
       Sistema  a = new Sistema();
    }

    @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == sobre){
        new Sobre();
    }
    if(ae.getSource() == sair || ae.getSource() == bSair){
        System.exit(0);
    }
    //Funcionamendo das duas listas
        if(ae.getSource() == cbEst){
         if(cbEst.getSelectedIndex() == 0){
             cbCid.removeAllItems();
         }else 
             if(cbEst.getSelectedIndex() == 1){
             cbCid.removeAllItems();
             for(int i=0; i<=3; i++)
                 cbCid.insertItemAt(ma[i], i);
            }else 
                 if(cbEst.getSelectedIndex() == 2){
                    cbCid.removeAllItems();
                    for(int i=0; i<=3; i++){
                        cbCid.insertItemAt(pi[i], i);
                    }
                    }else 
                     if(cbEst.getSelectedIndex() == 3){
                     cbCid.removeAllItems();
                     for(int i=0; i<=3; i++){
                         cbCid.insertItemAt(ce[i], i);
                     } 
         }
}
        
        //Funcionamento dos botões
        //botão salvar
        if(ae.getSource() == bSalvar){
            if(tfNome.getText().length() > 2 && tfSobre.getText().length()> 2){
                boolean cb1 = checkmascul.isSelected();
                boolean cb2 = checkfemini.isSelected();
                if(cb1 == true | cb2 == true){
                    if(cbEst.getSelectedIndex() > 0 && cbCid.getSelectedIndex() > 0){
                        JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                    }else{
                        JOptionPane.showMessageDialog(this, "Digite sua cidade ou estado!");
                    }
                    return;
                }else{
                    if(cbEst.getSelectedIndex() > 0 && cbCid.getSelectedIndex() > 0){
                        JOptionPane.showMessageDialog(this, "Masculino ou Feminino??");
                    }else{
                        JOptionPane.showMessageDialog(this, "Digite sua cidade ou estado é o se é masculino ou feminino!");
                    }
                }
                                
            
        }else{
                boolean cb1 = checkmascul.isSelected();
                boolean cb2 = checkfemini.isSelected();
                if(cbEst.getSelectedIndex() == 0 && cbCid.getSelectedIndex() == 0 && cb1 == false || cb2 == false){
                    JOptionPane.showMessageDialog(this, "Preencha todos os campos requeridos!!!!!");
                    return;
                }else{        
                JOptionPane.showMessageDialog(this, "Corrija o campo de nome!!");
            }}
            //limpar              
            }else if(ae.getSource() == bLimpar){
                tfNome.setText("");
                tfSobre.setText("");
                cbEst.setSelectedIndex(0);
                checkmascul.setSelected(false);
                checkfemini.setSelected(false);
                
            }
}
//Colocar conteudo na tela de sobre!!
    

}
