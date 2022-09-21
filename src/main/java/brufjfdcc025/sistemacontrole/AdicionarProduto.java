package brufjfdcc025.sistemacontrole;

import com.sun.tools.javac.code.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdicionarProduto implements ActionListener{

    private final Tela tela;

    public AdicionarProduto(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        DefaultTableModel model = (DefaultTableModel) tela.getTabela().getModel();
        
        try{
            Produto produto = new Produto(tela.getJtNome().getText(), 
                    tela.getJtDesc().getText(), Integer.parseInt(tela.getJtQuant().getText()),
                    Float.parseFloat(tela.getJtValor().getText()));
            model.addRow(new Object[]{tela.getJtNome().getText(), 
                    Float.parseFloat(tela.getJtValor().getText()),
                    Integer.parseInt(tela.getJtQuant().getText()),
                    tela.getJtDesc().getText()});
            
            JOptionPane.showMessageDialog(tela, "Produto adicionado!");
        }catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(tela, "Valor inválido!","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
}
