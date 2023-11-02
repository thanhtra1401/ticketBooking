
package metro_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


public class cardbooksearch extends javax.swing.JInternalFrame  implements convar{

    static String s[]=new String[4];
    static String n;
    /**
     * Creates new form tokensearch
     */
    public cardbooksearch() {
        initComponents();
      
       // jSpinner1.setValue(a);
        Connection myconnection;
        
        
        try{
             myconnection =DriverManager.getConnection(path+place, username, password);
             try
             {
                 String query="select * from routetable";
                 PreparedStatement mystatement=myconnection.prepareStatement(query);
                 ResultSet myres = mystatement.executeQuery();
                 if(myres.next())
                 {
                      do
                      {
                          jComboBox3.addItem(myres.getString("route"));
                            jComboBox2.addItem(myres.getString("route"));
                      }
                      while(myres.next());

       
                     
                 }
             }
             catch(Exception e)
             {
                 JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
             }
             finally
                     {
                         myconnection.close();
                     }
        }
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jLabel2.setText("To:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Route" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose route first" }));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose route first" }));

        jLabel1.setText("From");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose route" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jButton1.setText("Proceed");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Smartcard No.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        Connection myconnection;

        if(jComboBox3.getSelectedIndex()>0){
            try{
                myconnection =DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from stationtable where route=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jComboBox3.getSelectedItem().toString());

                    ResultSet myres = mystatement.executeQuery();
                    jComboBox5.removeAllItems();
                    jComboBox5.addItem("choose station");
                    if(myres.next())
                    {  
                        do
                        {
                            jComboBox5.addItem(myres.getString("stn_name"));

                        }
                        while(myres.next());

                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
            }
        }
        else{
            jComboBox5.addItem("choose route first");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        Connection myconnection;

        if(jComboBox2.getSelectedIndex()>0){
            try{
                myconnection =DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from stationtable where route=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jComboBox2.getSelectedItem().toString());
                    ResultSet myres = mystatement.executeQuery();
                    jComboBox4.removeAllItems();
                        jComboBox4.addItem("choose station");
                    if(myres.next())
                    {  
                        do
                        {
                            jComboBox4.addItem(myres.getString("stn_name"));

                        }
                        while(myres.next());

                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                }
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
            }
        }
        else{
            jComboBox4.addItem("choose route first");
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                s[0] = jComboBox2.getSelectedItem().toString();
                s[1] = jComboBox4.getSelectedItem().toString();
                s[2] = jComboBox3.getSelectedItem().toString();
                s[3] = jComboBox5.getSelectedItem().toString();
                n = jTextField1.getText();    
        boolean flag=false;
                         if(jComboBox2.getSelectedIndex()>0 && jComboBox3.getSelectedIndex()>0 && jComboBox4.getSelectedIndex()>0 && jComboBox5.getSelectedIndex()>0 && !jTextField1.getText().equals("") )

                         {Connection myconnection;
               

        
            try{
                myconnection =DriverManager.getConnection(path+place, username, password);
                try
                {
                    String query="select * from smartcard where s_id=?";
                    PreparedStatement mystatement=myconnection.prepareStatement(query);
                    mystatement.setString(1, jTextField1.getText());
                    ResultSet myres = mystatement.executeQuery();
                    if(myres.next())
                    { 
                        flag=true;
                        
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(rootPane, "Wrong Smart card ID .");
                        flag=false;
                    }
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(rootPane, "Error:"+e.getMessage());
                }
                finally
                {
                    myconnection.close();
                    
                }
            }

            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Connection Error:"+e.getMessage());
            }
      try{  if (flag)
        {
//             
//                 
                cardbook obj=new cardbook();
                mainframe.jDesktopPane1.add(obj);
                obj.setVisible(true);
        }
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(rootPane, "this statement is not working"+e.getMessage());
      }
                
                         }
                         else
                         {
                             JOptionPane.showMessageDialog(rootPane, "Please select appropriate choce/fill in the fields");
                         }
                
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
