package brufjfdcc025.sistemacontrole;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class Tela extends JFrame{
    private JPanel painelPrincipal;
    private JTextField jtQuant;
    private JTextField jtNome;
    private JTextField jtValor;
    private JTextField jtDesc;
    private JPanel painelLista;
    private JTable tabela;

    public Tela(){
        super("Sistema de Controle de Estoque");
    }
    
    public void Imprime(){
        this.setSize(500,600);
        this.setVisible(true);
        
        this.painelPrincipal = new JPanel();
        
        this.painelPrincipal.setLayout(new BorderLayout());
        
        Lista();
        Cadastro();
        
        this.add(this.painelPrincipal);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.pack();
        this.setLocationRelativeTo(null);
    }
    
    private void Lista(){
        
        painelLista = new JPanel();
        String[] colunas = {"Nome","Valor","Quantidade","Descrição"};
        
        DefaultTableModel modelo = new DefaultTableModel(colunas,0);
        
        tabela = new JTable(modelo);
        painelLista.add(new JScrollPane(tabela));
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        this.add(painelLista,BorderLayout.EAST);
        
    }
    
    private void Cadastro(){
        JPanel painelCadastra;
        painelCadastra = new JPanel();
        painelCadastra.setBorder(BorderFactory.createTitledBorder("Produto"));
        
        
        JLabel jlNome = new JLabel("Nome ");
        jtNome = new JTextField(10);
        painelCadastra.add(jlNome);
        painelCadastra.add(jtNome);
        
        JLabel jlValor = new JLabel("Valor ");
        jtValor = new JTextField(10);
        painelCadastra.add(jlValor);
        painelCadastra.add(jtValor);
        
        JLabel jlQuant = new JLabel("Quantidade ");
        jtQuant = new JTextField(10);
        painelCadastra.add(jlQuant);
        painelCadastra.add(jtQuant);
        
        JLabel jlDesc = new JLabel("Descrição ");
        jtDesc = new JTextField(10);
        painelCadastra.add(jlDesc);
        painelCadastra.add(jtDesc);
        
        JButton btAdiciona = new JButton("Adicionar");
        btAdiciona.addActionListener(new AdicionarProduto(this));
        painelCadastra.add(btAdiciona);
        
        JButton btRemove = new JButton("Remover");
        btRemove.addActionListener(new RemoverProduto(this));
        painelCadastra.add(btRemove);
        
        this.painelPrincipal.add(painelCadastra, BorderLayout.CENTER);
    }

    public JTextField getJtNome() {
        return jtNome;
    }

    public void setJtNome(JTextField jtNome) {
        this.jtNome = jtNome;
    }

    public JTextField getJtValor() {
        return jtValor;
    }

    public void setJtValor(JTextField jtValor) {
        this.jtValor = jtValor;
    }

    public JTextField getJtQuant() {
        return jtQuant;
    }

    public void setJtQuant(JTextField jtQuant) {
        this.jtQuant = jtQuant;
    }

    public JTextField getJtDesc() {
        return jtDesc;
    }

    public void setJtDesc(JTextField jtDesc) {
        this.jtDesc = jtDesc;
    }

    public JPanel getPainelLista() {
        return painelLista;
    }

    public void setPainelLista(JPanel painelLista) {
        this.painelLista = painelLista;
    }

    public JTable getTabela() {
        return tabela;
    }

    public void setTabela(JTable tabela) {
        this.tabela = tabela;
    }
    
}
