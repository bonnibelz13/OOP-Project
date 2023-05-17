
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.*;
import java.awt.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class AddMenuGUI extends javax.swing.JFrame {

    /**
     * Creates new form AddMenuGUI
     */
    public AddMenuGUI() {
        frame = this;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        tfName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaMethod = new javax.swing.JTextArea();
        foodPic = new javax.swing.JLabel();
        btnUploadPic = new javax.swing.JButton();
        tfIngredientDetail = new javax.swing.JTextField();
        categoryBox = new javax.swing.JComboBox<>();
        btnAddIngredient = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ingredientList = new javax.swing.JList<>();
        btnAddMenu = new javax.swing.JButton();
        btnDelIngredient = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        tfName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tfName.setText("Name");
        tfName.setToolTipText("");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        areaMethod.setColumns(20);
        areaMethod.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        areaMethod.setLineWrap(true);
        areaMethod.setRows(5);
        areaMethod.setText("Method");
        jScrollPane1.setViewportView(areaMethod);

        foodPic.setBackground(new java.awt.Color(255, 250, 228));
        foodPic.setForeground(new java.awt.Color(255, 250, 228));
        foodPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        foodPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AddPhoto_icon_v3.png"))); // NOI18N

        btnUploadPic.setBackground(new java.awt.Color(255, 250, 228));
        btnUploadPic.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnUploadPic.setForeground(new java.awt.Color(166, 166, 166));
        btnUploadPic.setText("Upload flie");

        tfIngredientDetail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tfIngredientDetail.setText("Ingredient");
        tfIngredientDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIngredientDetailActionPerformed(evt);
            }
        });

        categoryBox.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        categoryBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Category", "Item 2", "Item 3", "Item 4" }));
        categoryBox.setToolTipText("");
        categoryBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryBoxActionPerformed(evt);
            }
        });

        btnAddIngredient.setBackground(new java.awt.Color(255, 49, 49));
        btnAddIngredient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddIngredient.setText("+");
        btnAddIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddIngredientActionPerformed(evt);
            }
        });

        ingredientList.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(ingredientList);

        btnAddMenu.setBackground(new java.awt.Color(255, 49, 49));
        btnAddMenu.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btnAddMenu.setText("Add");
        btnAddMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddMenuActionPerformed(evt);
            }
        });

        btnDelIngredient.setBackground(new java.awt.Color(255, 49, 49));
        btnDelIngredient.setForeground(new java.awt.Color(255, 255, 255));
        btnDelIngredient.setText("-");
        btnDelIngredient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelIngredientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(categoryBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 292, Short.MAX_VALUE)
                                                .addComponent(tfName))
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tfIngredientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAddIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnUploadPic)
                                        .addGap(115, 115, 115))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(foodPic, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foodPic, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUploadPic)
                        .addGap(11, 11, 11)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(categoryBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfIngredientDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddMenu)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>                        
    
    
    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                                      
    
    DefaultListModel model = new DefaultListModel();
    List<String> lst = new ArrayList<String>();
    private void btnAddIngredientActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // set model list
        ingredientList.setModel(model);
        // add ingredients
        if ((tfIngredientDetail.getText().equals(""))==false){
            model.addElement(tfIngredientDetail.getText().trim());
            lst.add(tfIngredientDetail.getText());
        }
    }                                                

    private void categoryBoxActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void tfIngredientDetailActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  
    
    private void btnAddMenuActionPerformed(java.awt.event.ActionEvent evt) {
        this.setVisible(false);
    }                                          

    private void btnDelIngredientActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        int selectedIndex = ingredientList.getSelectedIndex(); 
        if (selectedIndex != -1) {
            model.remove(selectedIndex); 
        }   
    }                                                

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
            java.util.logging.Logger.getLogger(AddMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(new Runnable() {
            //public void run() {
                //new AddMenuGUI().setVisible(true);
            //}
        //});
    }

    public DefaultListModel getModel() {
        return model;
    }

    public List<String> getLst() {
        return lst;
    }

    public JTextArea getAreaMethod() {
        return areaMethod;
    }

    public JButton getBtnAddIngredient() {
        return btnAddIngredient;
    }

    public JButton getBtnAddMenu() {
        return btnAddMenu;
    }

    public JButton getBtnDelIngredient() {
        return btnDelIngredient;
    }

    public JButton getBtnUploadPic() {
        return btnUploadPic;
    }

    public JComboBox<String> getCategoryBox() {
        return categoryBox;
    }

    public JLabel getFoodPic() {
        return foodPic;
    }

    public JList<String> getIngredientList() {
        return ingredientList;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public JTextField getTfIngredientDetail() {
        return tfIngredientDetail;
    }

    public JTextField getTfName() {
        return tfName;
    }
    public JFrame getFrame() {
        return frame;
     }

    

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea areaMethod;
    private javax.swing.JButton btnAddIngredient;
    private javax.swing.JButton btnAddMenu;
    private javax.swing.JButton btnDelIngredient;
    private javax.swing.JButton btnUploadPic;
    private javax.swing.JComboBox<String> categoryBox;
    private javax.swing.JLabel foodPic;
    private javax.swing.JList<String> ingredientList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField tfIngredientDetail;
    private javax.swing.JTextField tfName;
    private JFrame frame;
    // End of variables declaration                   
}
