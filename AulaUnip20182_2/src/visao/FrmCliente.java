
package visao;

import controle.CtrlCliente;
import modelo.ModeloCliente;


public class FrmCliente extends javax.swing.JFrame {

    
    public FrmCliente() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplTopo = new javax.swing.JPanel();
        jbTitulo = new javax.swing.JLabel();
        jpSubtitulo = new javax.swing.JLabel();
        jplOpcoes = new javax.swing.JPanel();
        jbtIncluir = new javax.swing.JButton();
        jbtConsultar = new javax.swing.JButton();
        jbtAtulizar = new javax.swing.JButton();
        jbtDeletar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jplDados = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplTopo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbTitulo.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jbTitulo.setText("Cliente");

        jpSubtitulo.setText("CRUD  - Create, Reload, Update and Delete");

        javax.swing.GroupLayout jplTopoLayout = new javax.swing.GroupLayout(jplTopo);
        jplTopo.setLayout(jplTopoLayout);
        jplTopoLayout.setHorizontalGroup(
            jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTopoLayout.createSequentialGroup()
                .addGroup(jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpSubtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jplTopoLayout.setVerticalGroup(
            jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTopoLayout.createSequentialGroup()
                .addComponent(jbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpSubtitulo)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        jplOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jbtIncluir.setText("Incluir");
        jbtIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtIncluirActionPerformed(evt);
            }
        });

        jbtConsultar.setText("Consultar");
        jbtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConsultarActionPerformed(evt);
            }
        });

        jbtAtulizar.setText("Atualizar");

        jbtDeletar.setText("Deletar");

        jbtSair.setText("Sair");
        jbtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplOpcoesLayout = new javax.swing.GroupLayout(jplOpcoes);
        jplOpcoes.setLayout(jplOpcoesLayout);
        jplOpcoesLayout.setHorizontalGroup(
            jplOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplOpcoesLayout.createSequentialGroup()
                .addGroup(jplOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtAtulizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jplOpcoesLayout.setVerticalGroup(
            jplOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtAtulizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jbtSair)
                .addContainerGap())
        );

        jplDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Código");

        jLabel4.setText("Nome");

        javax.swing.GroupLayout jplDadosLayout = new javax.swing.GroupLayout(jplDados);
        jplDados.setLayout(jplDadosLayout);
        jplDadosLayout.setHorizontalGroup(
            jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jtfCodigo))
                .addContainerGap())
        );
        jplDadosLayout.setVerticalGroup(
            jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jplOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jplDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtConsultarActionPerformed

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Runtime.getRuntime().exit(0);
        
    }//GEN-LAST:event_jbtSairActionPerformed

    private void jbtIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtIncluirActionPerformed
        // TODO add your handling code here:
        
        ModeloCliente cliente = new ModeloCliente();
        cliente.setNome(jtfNome.getName());
        
        CtrlCliente ctrlCliente = new CtrlCliente();
        jtfCodigo.setText(Integer.toString(ctrlCliente.incluirCtrl(cliente)));
        
        
    }//GEN-LAST:event_jbtIncluirActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jbTitulo;
    private javax.swing.JButton jbtAtulizar;
    private javax.swing.JButton jbtConsultar;
    private javax.swing.JButton jbtDeletar;
    private javax.swing.JButton jbtIncluir;
    private javax.swing.JButton jbtSair;
    private javax.swing.JLabel jpSubtitulo;
    private javax.swing.JPanel jplDados;
    private javax.swing.JPanel jplOpcoes;
    private javax.swing.JPanel jplTopo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
