/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.dohoa.frames;

import java.awt.Graphics2D;
import java.util.Random;

/**
 *
 * @author Admin
 */
public class XuatDuLieuFrame extends javax.swing.JInternalFrame {
    int[]a;

    /**
     * Creates new form XuatDuLieuFrame
     */
    public XuatDuLieuFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPanel = new javax.swing.JPanel();
        btnVe = new javax.swing.JButton();
        btnSapxep = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Vẽ dữ liệu mảng 1  chiều");

        javax.swing.GroupLayout pnPanelLayout = new javax.swing.GroupLayout(pnPanel);
        pnPanel.setLayout(pnPanelLayout);
        pnPanelLayout.setHorizontalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );
        pnPanelLayout.setVerticalGroup(
            pnPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 339, Short.MAX_VALUE)
        );

        btnVe.setText("Vẽ mảng 1 chiều ra màn hình");
        btnVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeActionPerformed(evt);
            }
        });

        btnSapxep.setText("Sắp xếp mảng 1 chiều");
        btnSapxep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapxepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVe))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSapxep))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSapxep, btnVe, pnPanel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSapxep))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeActionPerformed
        // TODO add your handling code here:
        Graphics2D gr =  (Graphics2D) pnPanel.getGraphics();
        int maxX = pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step =5;
        int n =maxX/step;
        a= new int[n];
        Random rnd = new Random();
        for(int i =0;i<n;i++){
            a[i]=rnd.nextInt(maxY);
            
        }
        int beginX=0,beginY=0;
        gr.clearRect(0, 0, maxX, maxY);
        for(int i = 0;i<n;i++){
//            gr.drawRect(beginX,beginY, step, a[i]  );
              gr.drawRect(beginX,maxY - a[i], step, a[i]  );

           

            beginX +=step;
        
        }
                
    }//GEN-LAST:event_btnVeActionPerformed

    private void btnSapxepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapxepActionPerformed
        Graphics2D gr =  (Graphics2D) pnPanel.getGraphics();
        int maxX= pnPanel.getWidth();
        int maxY = pnPanel.getHeight();
        int step =5;
        int n =maxX/step;
        int beginX= 0,beginX2=0;
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int temp =a[i];
                    // xoa hinh a[i] cu
                    gr.clearRect(beginX, maxY-a[i], step, a[i]);
                    // ve hinh a[i] moi
                    a[i]=a[j];
                    gr.drawRect(beginX, maxY-a[i], step, a[i]);
                    // xoa hinh a[j] cu
                    beginX2=j*step;
                     gr.clearRect(beginX2, maxY-a[j], step, a[j]);
                    // ve hinh a[j] moi
                    a[j]=temp;
                    gr.drawRect(beginX2, maxY-a[j], step, a[j]);
                    
                }
            
            }
            beginX+=step;
        }
        
    }//GEN-LAST:event_btnSapxepActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSapxep;
    private javax.swing.JButton btnVe;
    private javax.swing.JPanel pnPanel;
    // End of variables declaration//GEN-END:variables
}
