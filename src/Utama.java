import java.sql.SQLException;


public class Utama extends javax.swing.JPanel {

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Konek_1 = new javax.swing.JButton();
        Konek_2 = new javax.swing.JButton();

        setBorder(new javax.swing.border.MatteBorder(null));

        Konek_1.setText("Koneksi Class.forName");
        Konek_1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Konek_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konek_1ActionPerformed(evt);
            }
        });

        Konek_2.setText("Koneksi registerDriver");
        Konek_2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Konek_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Konek_2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Konek_1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(Konek_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(Konek_1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(Konek_2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void Konek_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konek_1ActionPerformed
        try{
        Latihan_01 Konek_1=new Latihan_01();
        Konek_1.setVisible(true);
        Latihan_01.db_prodi_si();
        } catch (ClassNotFoundException | SQLException ex){
           ex.printStackTrace();
        }
    }//GEN-LAST:event_Konek_1ActionPerformed

    private void Konek_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Konek_2ActionPerformed
       try{
        Latihan_02 Konek_2=new Latihan_02();
       Konek_2.setVisible(true);
       Latihan_02.db_prodi_si();
       } catch (ClassNotFoundException | SQLException ex){
           ex.printStackTrace();
       }
    }//GEN-LAST:event_Konek_2ActionPerformed


        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Konek_1;
    public static javax.swing.JButton Konek_2;
    // End of variables declaration//GEN-END:variables
}
