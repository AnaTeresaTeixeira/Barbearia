package View;

import controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Agenda extends javax.swing.JFrame {
    
    private final AgendaController controller;
    
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Scroll = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        TextId = new javax.swing.JTextField();
        JComboBoxCliente = new javax.swing.JComboBox<>();
        JComboBoxServico = new javax.swing.JComboBox<>();
        TextValor = new javax.swing.JTextField();
        FormattedTextData = new javax.swing.JFormattedTextField();
        FormattedTextHora = new javax.swing.JFormattedTextField();
        ButtonAgenda = new javax.swing.JButton();
        ScrollTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        Ob = new javax.swing.JLabel();
        jLabelId = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelServico = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        Panel = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();
        Fundo1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        Scroll.setViewportView(jTextArea);

        getContentPane().add(Scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 140, 120));
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 210, -1));

        getContentPane().add(JComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 210, -1));

        JComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(JComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 210, -1));
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 210, -1));
        getContentPane().add(FormattedTextData, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 210, -1));
        getContentPane().add(FormattedTextHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 210, -1));

        ButtonAgenda.setBackground(new java.awt.Color(0, 102, 255));
        ButtonAgenda.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgenda.setText("Agendar");
        ButtonAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 140, -1));

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        ScrollTable.setViewportView(Table);

        getContentPane().add(ScrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 690, 140));

        Ob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ob.setForeground(new java.awt.Color(255, 255, 255));
        Ob.setText("Observações:");
        getContentPane().add(Ob, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 130, 20));

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(255, 255, 255));
        jLabelId.setText("ID");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 130, 50));

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 130, 50));

        jLabelServico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelServico.setForeground(new java.awt.Color(255, 255, 255));
        jLabelServico.setText("Serviço");
        getContentPane().add(jLabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 130, 50));

        jLabelPreco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelPreco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPreco.setText("Preço");
        getContentPane().add(jLabelPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 130, 50));

        jLabelData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("Data");
        getContentPane().add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 130, 50));

        jLabelHora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("Hora");
        getContentPane().add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 130, 50));

        Panel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        Panel.setText("jLabel1");
        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 530, 340));

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(Fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 480, 410));

        Fundo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        getContentPane().add(Fundo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxServicoItemStateChanged
        
        this.controller.atualizaValor();
        
    }//GEN-LAST:event_JComboBoxServicoItemStateChanged

    private void ButtonAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendaActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_ButtonAgendaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgenda;
    private javax.swing.JFormattedTextField FormattedTextData;
    private javax.swing.JFormattedTextField FormattedTextHora;
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Fundo1;
    private javax.swing.JComboBox<String> JComboBoxCliente;
    private javax.swing.JComboBox<String> JComboBoxServico;
    private javax.swing.JLabel Ob;
    private javax.swing.JLabel Panel;
    private javax.swing.JScrollPane Scroll;
    private javax.swing.JScrollPane ScrollTable;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextValor;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelServico;
    private javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
       this.controller.atualizaTabela();
       this.controller.atualizaCliente();
       this.controller.atualizaServico();
       this.controller.atualizaValor();
    }

    public JTable getTable() {
        return Table;
    }

    public void setTable(JTable Table) {
        this.Table = Table;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return JComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.JComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return JComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.JComboBoxServico = jComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JFormattedTextField getFormattedTextData() {
        return FormattedTextData;
    }

    public void setFormattedTextData(JFormattedTextField FormattedTextData) {
        this.FormattedTextData = FormattedTextData;
    }

    public JFormattedTextField getFormattedTextHora() {
        return FormattedTextHora;
    }

    public void setFormattedTextHora(JFormattedTextField FormattedTextHora) {
        this.FormattedTextHora = FormattedTextHora;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JTextArea getjTextArea() {
        return jTextArea;
    }

    public void setjTextArea(JTextArea jTextArea) {
        this.jTextArea = jTextArea;
    }

    
    
}
