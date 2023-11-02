/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metro_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static metro_system.convar.password;
import static metro_system.convar.path;
import static metro_system.convar.place;
import static metro_system.convar.username;


public class tokenbookedsearch extends javax.swing.JInternalFrame  implements convar{

    static String s[]=new String[4];
    static Integer n;
    /**
     * Creates new form tokensearch
     */
    public tokenbookedsearch() {
        initComponents();
        jDateChooser1.setDate(null);
     
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ticket searching");

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

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total tickets booked");

        jLabel4.setText("Date");

        jTextField1.setEditable(false);

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(0, 102, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 255)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number of tickets", "Total fare", "Date", "From", "To"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setText("Total rows");

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
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
                    if(myres.next())
                    {  jComboBox4.removeAllItems();
                        jComboBox4.addItem("choose station");
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
        SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");     
                   
       
        
        try{
            Connection myconnection = DriverManager.getConnection(path+place, username, password);
            try
            {
                String query="select * from bookingtoken where route1 like ? and stn1 like ? and route2 like ? and stn2 like ? and bookingdate like ?";
                PreparedStatement mystatement=myconnection.prepareStatement(query);
//                mystatement.setString(1,  "%"+jTextField1.getText()+"%");
//                mystatement.setString(2,  "%"+jTextField2.getText()+"%");
//               
                 if(jComboBox2.getSelectedIndex()>0)
                  s[0] = jComboBox2.getSelectedItem().toString();
                else
                    s[0]="%";
                  if(jComboBox4.getSelectedIndex()>0)
                  s[1] = jComboBox4.getSelectedItem().toString();
                else
                    s[1]="%"; 
                  if(jComboBox3.getSelectedIndex()>0)
                  s[2] = jComboBox3.getSelectedItem().toString();
                else
                    s[2]="%"; 
                  if(jComboBox5.getSelectedIndex()>0)
                  s[3] = jComboBox5.getSelectedItem().toString();
                else
                    s[3]="%";
                  
                mystatement.setString(1,  s[0]);
                mystatement.setString(2,  s[1]);  
                mystatement.setString(3,  s[2]);
                mystatement.setString(4,  s[3]);
                
               //   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  if(jDateChooser1.getDate()!=null)
              mystatement.setString(5, "%"+myformat.format(jDateChooser1.getDate()) + "%");
                else
                  mystatement.setString(5, "%");
                  
                ResultSet myres=mystatement.executeQuery();
                DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                if(myres.next())
                {   
                    mymodel.setRowCount(0);
                    do{
                        String smrt,bookno,date,from,to;
                        smrt=myres.getString(6);
                        bookno=myres.getString(7);
                        date=myres.getString(11);
                        from=myres.getString(1) +" , "+myres.getString(2);
                        to=myres.getString(3) +" , "+myres.getString(4);
                        mymodel.addRow(new Object[]{smrt,bookno,date,from,to});
                    }
                    while(myres.next());
                          
                 int row=jTable1.getRowCount();
                 jTextField3.setText(String.valueOf(row));
            }
                else{
                    mymodel.setRowCount(0);
                      int row=jTable1.getRowCount();
                 jTextField3.setText(String.valueOf(row));
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
               
    try{
            Connection myconnection = DriverManager.getConnection(path+place, username, password);
            try
            {
               
                 String query1="select sum(no_of_tckt) from bookingtoken where route1 like ? and stn1 like ? and route2 like ? and stn2 like ? and bookingdate like ?";
                PreparedStatement mystatement1=myconnection.prepareStatement(query1);
//                mystatement.setString(1,  "%"+jTextField1.getText()+"%");
//                mystatement.setString(2,  "%"+jTextField2.getText()+"%");
//               
             
                  
                mystatement1.setString(1,  s[0]);
                mystatement1.setString(2,  s[1]);  
                mystatement1.setString(3,  s[2]);
                mystatement1.setString(4,  s[3]);
                
               //   SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                  if(jDateChooser1.getDate()!=null)
              mystatement1.setString(5, "%"+myformat.format(jDateChooser1.getDate()) + "%");
                else
                  mystatement1.setString(5, "%");
                  
                ResultSet myres1=mystatement1.executeQuery();
               // DefaultTableModel mymodel=(DefaultTableModel) jTable1.getModel();
                if(myres1.next())
                {   
                 jTextField1.setText(myres1.getString(1));
                
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
               
   
                
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
              MessageFormat headerFormat = new MessageFormat("Page {0}");
              MessageFormat footerFormat = new MessageFormat("- {0} -");
              jTable1.print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
            } 
	catch (Exception pe) 
	{
              System.err.println("Error printing: " + pe.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
