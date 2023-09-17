package br.com.visão;

import br.com.controle.Calculos;

public class Tela extends javax.swing.JFrame {
    Calculos c = new Calculos();
  
    public Tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLValor = new javax.swing.JLabel();
        jLResultado = new javax.swing.JLabel();
        jBCalculos = new javax.swing.JButton();
        jTValor = new javax.swing.JTextField();
        jCCustoPne = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLValor.setText("Insira o Custo de fabrica");

        jLResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLResultado.setForeground(new java.awt.Color(255, 0, 0));
        jLResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLResultado.setText("Valor para Consumidor é:");
        jLResultado.setToolTipText("");

        jBCalculos.setText("Calcular");
        jBCalculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalculosActionPerformed(evt);
            }
        });

        jCCustoPne.setText("PNE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCCustoPne)
                    .addComponent(jLResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLValor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBCalculos)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLValor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCalculos)
                    .addComponent(jTValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCCustoPne)
                .addGap(39, 39, 39)
                .addComponent(jLResultado)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBCalculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalculosActionPerformed
        if(jCCustoPne.isSelected()){
            jLResultado.setText("Valor para Consumidor é: "+c.CustoPne());         
        }else{
        c.setValor(Double.valueOf(jTValor.getText()));
        jLResultado.setText("Valor para Consumidor é: "+c.custoFabrica());
        }
    }//GEN-LAST:event_jBCalculosActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCalculos;
    private javax.swing.JCheckBox jCCustoPne;
    private javax.swing.JLabel jLResultado;
    private javax.swing.JLabel jLValor;
    private javax.swing.JTextField jTValor;
    // End of variables declaration//GEN-END:variables
}
