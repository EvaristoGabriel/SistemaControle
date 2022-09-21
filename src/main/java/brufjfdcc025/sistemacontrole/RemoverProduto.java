package brufjfdcc025.sistemacontrole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.graalvm.compiler.nodes.NodeView;

public class RemoverProduto implements ActionListener{
    
    private Tela tela;

    public RemoverProduto(Tela tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int index = tela.getTabela().getSelectedRow();
            DefaultTableModel modelo = (DefaultTableModel) tela.getTabela().getModel();
            modelo.removeRow(index);
            tela.getTabela().setModel(modelo);
            tela.repaint();
            JOptionPane.showMessageDialog(tela, "Produto removido!");
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(tela,"Selecione um produto para remover","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
