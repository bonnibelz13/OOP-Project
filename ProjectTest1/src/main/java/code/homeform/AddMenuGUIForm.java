package code.homeform;



import code.model.User;
import java.util.List;


import javax.swing.DefaultListModel;



import javax.swing.JButton;

import javax.swing.JComboBox;

import javax.swing.JLabel;
import javax.swing.JList;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import code.kao.database.*;
import code.tableData.ImageRenderer;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;





    // ----------------------------------------------------------------
    // AddMenuGUIFORM
    // ----------------------------------------------------------------



/**
 *
 * @author User
 */
public class AddMenuGUIForm extends javax.swing.JFrame {

    private AddMenuModel addMenuModel;
    private AddMenuController controller;
    private FoodDataBase foodDataBase;
    private User user;
    private DefaultTableModel tableModel;

    /**
     * Creates new form AddMenuGUI
     */

    public AddMenuGUIForm(FoodDataBase foodDataBase, String userName) {
        
        this.foodDataBase = foodDataBase;
        initComponents();
        
        try (FileInputStream fin = new FileInputStream("FoodDataBase.dat");
             ObjectInputStream oin = new ObjectInputStream(fin)){
            foodDataBase = (FoodDataBase) oin.readObject();
            
            System.out.println("Import Data Successfully");
        }
        catch (IOException | ClassNotFoundException ex){
            foodDataBase = new FoodDataBase();
            System.out.println("Data not found. Create New DataBase Successfully.");
        }
        finally {
            System.out.println("Done.");
        }
        
        ArrayList myRecipe = (ArrayList) foodDataBase.getUserRecipe("admin");
        
        if (myRecipe != null){
            for (int i = 0; i < myRecipe.size(); i++){
            FoodRecipe food = (FoodRecipe) myRecipe.get(i);
            tableModel = (DefaultTableModel) jTable1.getModel();
            tableModel.addRow(new Object[]{food.getName(), food.getCategory(), food.getIngredientDetail(), food.getDescription(), food.getPicture()});
            
            }
        }
        
        
        
//        // Initialize the table model
//        tableModel = (DefaultTableModel) jTable1.getModel();
        
        // Create an instance of AddMenuModel and AddMenuController
        AddMenuModel model = new AddMenuModel(this);
        controller = new AddMenuController(model, this);
        
        // Load menu data from file and populate the table
//        controller.loadMenuFromFile();
//        tableModel.removeRow(0);
    }

        
        
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1_Category = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_Discription = new javax.swing.JTextArea();
        jButton1_AddMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1_DishName = new javax.swing.JTextField();
        jButton3_UploadPic = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2_FoodPic = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton_Del = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField2_Ingredients = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1_Ingredients = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1_Import = new javax.swing.JButton();
        jPanel_Table = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1_DeleteMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1_Category.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jComboBox1_Category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Category", "Main", "Dessert", "Drink" }));
        jComboBox1_Category.setToolTipText("");
        getContentPane().add(jComboBox1_Category, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 200, -1));

        jTextArea1_Discription.setColumns(20);
        jTextArea1_Discription.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jTextArea1_Discription.setRows(5);
        jTextArea1_Discription.setText("Description");
        jScrollPane1.setViewportView(jTextArea1_Discription);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 190, 270, 371));

        jButton1_AddMenu.setBackground(new java.awt.Color(255, 49, 49));
        jButton1_AddMenu.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton1_AddMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButton1_AddMenu.setText("Add new Menu!");
        jButton1_AddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_AddMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_AddMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 580, 190, 50));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 200, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1_DishName.setToolTipText("");
        jTextField1_DishName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_DishNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1_DishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 264, -1));

        jButton3_UploadPic.setBackground(new java.awt.Color(255, 250, 228));
        jButton3_UploadPic.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton3_UploadPic.setForeground(new java.awt.Color(166, 166, 166));
        jButton3_UploadPic.setText("Upload flie");
        jButton3_UploadPic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_UploadPicActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3_UploadPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 100, 40));

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel4.setText("Dish Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel2_FoodPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2_FoodPic.setIcon(new javax.swing.ImageIcon("C:\\Users\\baibu\\OneDrive\\Documents\\GitHub\\OOP-Project\\ProjectTest1\\src\\main\\java\\code\\icon\\img.png")); // NOI18N
        jPanel1.add(jLabel2_FoodPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 260, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 330, 310));

        jButton_Del.setBackground(new java.awt.Color(204, 0, 0));
        jButton_Del.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton_Del.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Del.setText("-");
        jButton_Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DelActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2_Ingredients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2_IngredientsMouseClicked(evt);
            }
        });

        jScrollPane2.setViewportView(jList1_Ingredients);

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel1.setText("Ingredients");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2_Ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Del, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Del)
                    .addComponent(jTextField2_Ingredients, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 290, 210));

        jButton1_Import.setText("Import");
        jButton1_Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_ImportActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_Import, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setText("My Recipes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Ingredients", "Description", "Pic"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel_TableLayout = new javax.swing.GroupLayout(jPanel_Table);
        jPanel_Table.setLayout(jPanel_TableLayout);
        jPanel_TableLayout.setHorizontalGroup(
            jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TableLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel_TableLayout.setVerticalGroup(
            jPanel_TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TableLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel_Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 460, 530));

        jButton1_DeleteMenu.setText("Delete Menu");
        jButton1_DeleteMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_DeleteMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1_DeleteMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 100, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    //------------------------
    // DishName.
    //------------------------
    
    
    private void jTextField1_DishNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_DishNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_DishNameActionPerformed
    
    

    //------------------------
    // Add an Ingredient.
    //------------------------
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        controller.AddIngredient(jTextField2_Ingredients.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    //--------------------------------------------------------------------------
    // When user clicks TextFieldIngredient -> setTextFieldIngredient to null.
    //--------------------------------------------------------------------------
    
    private void jTextField2_IngredientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2_IngredientsMouseClicked
        // TODO add your handling code here:
        jTextField2_Ingredients.setText("");
    }//GEN-LAST:event_jTextField2_IngredientsMouseClicked

    
   
    //------------------------
    // Delete an Ingredient.
    //------------------------
    
    
    private void jButton_DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DelActionPerformed
        // TODO add your handling code here:
        controller.DeleteIngredient();
    }//GEN-LAST:event_jButton_DelActionPerformed

    
    
    //------------------------
    // Upload pic.
    //------------------------
    
    
    private void jButton3_UploadPicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_UploadPicActionPerformed
        // TODO add your handling code here:
        controller.UploadPicture();
 
    }//GEN-LAST:event_jButton3_UploadPicActionPerformed
    
    
    
    
    
    
    
    //-----------------------------------------------
    // Import data in "data.csv" to Table2.
    //-----------------------------------------------
    
    
    private void jButton1_ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_ImportActionPerformed
        // TODO add your handling code here:
        
//        JTable table2 = MenuTable2.getjTable1();
//        TableDataImporter importer = new TableDataImporter(table2);
//        try {
//            importer.importTableDataFromCSV("C:\\Users\\baibu\\OneDrive\\Documents\\GitHub\\OOP-Project\\ProjectTest1\\data.csv");
//        } catch (CsvValidationException ex) {
//            Logger.getLogger(AddMenuGUIForm.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }//GEN-LAST:event_jButton1_ImportActionPerformed

    //--------------------------------------------------------------------------------------------
    // Add new Menu to Table. And export it to File "data.csv" / export picture to folder "pics".
    //--------------------------------------------------------------------------------------------
    

    private void jButton1_AddMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_AddMenuActionPerformed
        // TODO add your handling code here:
        controller.AddMenu(foodDataBase, "admin");

    }//GEN-LAST:event_jButton1_AddMenuActionPerformed

    //--------------------------------------------------------------------------------------------
    // Delete Menu in Table. And del it in File "data.csv" / del the picture in folder "pics".
    //--------------------------------------------------------------------------------------------
    
    private void jButton1_DeleteMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_DeleteMenuActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();
        controller.DeleteMenu(selectedRow, foodDataBase, "admin");
    }//GEN-LAST:event_jButton1_DeleteMenuActionPerformed

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
            java.util.logging.Logger.getLogger(AddMenuGUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddMenuGUIForm().setVisible(true);
//            }
//        });
    }
    
    //---------------------------------------------------
    // updates the ingredient list in the GUI.
    //---------------------------------------------------
    
    public void updateTable(Object[] rowData) {
        tableModel.addRow(rowData);
    }
    
    public void updateIngredientList(List<String> ingredients) {
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String ingredient : ingredients) {
            model.addElement(ingredient);
        }
        jList1_Ingredients.setModel(model);
    }
    

    
    //-----------------------------
    // Getter and Setter.
    //-----------------------------
    

    
    public JTextField getjTextField2_Ingredients() {
        return jTextField2_Ingredients;
    }

//    public DefaultListModel getMod() {
//        return mod;
//    }

    public JComboBox<String> getjComboBox1_Category() {
        return jComboBox1_Category;
    }

    public JLabel getjLabel2_FoodPic() {
        return jLabel2_FoodPic;
    }

    public JList<String> getjList1_Ingredients() {
        return jList1_Ingredients;
    }

    public JTextArea getjTextArea1_Discription() {
        return jTextArea1_Discription;
    }

    public JTextField getjTextField1_DishName() {
        return jTextField1_DishName;
    }

    public JButton getjButton1_AddMenu() {
        return jButton1_AddMenu;
    }

    
    public DefaultTableModel getTableModel() {
        return (DefaultTableModel) jTable1.getModel();
    }

    public JTable getjTable1() {
        return jTable1;
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_AddMenu;
    private javax.swing.JButton jButton1_DeleteMenu;
    private javax.swing.JButton jButton1_Import;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3_UploadPic;
    private javax.swing.JButton jButton_Del;
    private javax.swing.JComboBox<String> jComboBox1_Category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2_FoodPic;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1_Ingredients;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1_Discription;
    private javax.swing.JTextField jTextField1_DishName;
    private javax.swing.JTextField jTextField2_Ingredients;
    // End of variables declaration//GEN-END:variables
}

