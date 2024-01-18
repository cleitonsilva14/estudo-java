package view;

public class FrmCliente extends javax.swing.JFrame {

    public FrmCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplTopo = new javax.swing.JPanel();
        jlbTitulo = new javax.swing.JLabel();
        jlbSubtitulo = new javax.swing.JLabel();
        jplOpcoes = new javax.swing.JPanel();
        jbtIncluir = new javax.swing.JButton();
        jbtConsultar = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        jbtDeletar = new javax.swing.JButton();
        jbtSair = new javax.swing.JButton();
        jplDados = new javax.swing.JPanel();
        jlbCodigo = new javax.swing.JLabel();
        jlbNome = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplTopo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jlbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbTitulo.setText("Cliente");

        jlbSubtitulo.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jlbSubtitulo.setForeground(new java.awt.Color(153, 153, 153));
        jlbSubtitulo.setText("CRUD - Create, Reload, Update and Delete");

        javax.swing.GroupLayout jplTopoLayout = new javax.swing.GroupLayout(jplTopo);
        jplTopo.setLayout(jplTopoLayout);
        jplTopoLayout.setHorizontalGroup(
            jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbTitulo)
                    .addComponent(jlbSubtitulo))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jplTopoLayout.setVerticalGroup(
            jplTopoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplTopoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlbSubtitulo)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jplOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Opções"));

        jbtIncluir.setText("Incluir");

        jbtConsultar.setText("Consultar");

        jbtAtualizar.setText("Atualizar");

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
            .addComponent(jbtSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
            .addComponent(jbtIncluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jplOpcoesLayout.setVerticalGroup(
            jplOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplOpcoesLayout.createSequentialGroup()
                .addComponent(jbtIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jbtSair)
                .addContainerGap())
        );

        jplDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbCodigo.setText("Código");

        jlbNome.setText("Nome");

        javax.swing.GroupLayout jplDadosLayout = new javax.swing.GroupLayout(jplDados);
        jplDados.setLayout(jplDadosLayout);
        jplDadosLayout.setHorizontalGroup(
            jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbCodigo)
                    .addComponent(jlbNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfNome)
                    .addComponent(jtfCodigo))
                .addContainerGap())
        );
        jplDadosLayout.setVerticalGroup(
            jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCodigo)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jplDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbNome)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplTopo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jplDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jplOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jplTopo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jplOpcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jplDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSairActionPerformed
        this.setVisible(false);
        Runtime.getRuntime().exit(0);
    }//GEN-LAST:event_jbtSairActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtConsultar;
    private javax.swing.JButton jbtDeletar;
    private javax.swing.JButton jbtIncluir;
    private javax.swing.JButton jbtSair;
    private javax.swing.JLabel jlbCodigo;
    private javax.swing.JLabel jlbNome;
    private javax.swing.JLabel jlbSubtitulo;
    private javax.swing.JLabel jlbTitulo;
    private javax.swing.JPanel jplDados;
    private javax.swing.JPanel jplOpcoes;
    private javax.swing.JPanel jplTopo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfNome;
    // End of variables declaration//GEN-END:variables
}
