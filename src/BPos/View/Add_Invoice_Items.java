/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPos.View;

import BPos.Model.itemsList;
import static BPos.View.Add_Grn_Items.isNumber;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.NumberFormatter;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Bhagya
 */
public class Add_Invoice_Items extends javax.swing.JFrame {

    /**
     * Creates new form Add_Invoice_Items
     */
    Add_Invoice_Items add_invoice_items;
    Invoice _INVOICE;
    int StockID;
    double Quentity = 0;
    public Add_Invoice_Items() {
        initComponents();
        allQty.setVisible(false);
    }

    public Add_Invoice_Items(Invoice i) {
        initComponents();
        _INVOICE = i;
        allQty.setVisible(false);
    }

    public Add_Invoice_Items(Add_Invoice_Items i, int val, int StkID, int ss) {
        initComponents();
        StockID = StkID;
        i.stckIDs.setVisible(false);
        i.stckIDs.setText(StockID + "");
        i.itemcode.setText(ss + "");
        add_invoice_items = i;
        loadP(val, i, StockID);
        loadqty(i,StkID);
        allQty.setVisible(false);
    }

    public void loadqty(Add_Invoice_Items i,int t){
        try {
            Session ses = BPos.Connection.NewHibernateUtil.getSessionFactory().openSession();
            Criteria cr = ses.createCriteria(BPos.DB.Stock.class);
            cr.add(Restrictions.eq("idstock", t));
            BPos.DB.Stock ss = (BPos.DB.Stock) cr.uniqueResult();
            i.allQty.setText(ss.getQty()+"");
            allQty.setVisible(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void loadP(int id, Add_Invoice_Items ag, int sid) {
        try {
            Session ses = BPos.Connection.NewHibernateUtil.getSessionFactory().openSession();
            BPos.DB.Products p = (BPos.DB.Products) ses.load(BPos.DB.Products.class, id);
            ag.xtProduct.setText(p.getProName());
            ag.xtDescription.setText(p.getDescription());
            ag.xtDescount.setText(p.getDiscount().getValue() + "");
            BPos.DB.Stock s = (BPos.DB.Stock) ses.load(BPos.DB.Stock.class, sid);
            ag.xtPrice.setText(s.getSellingPrice() + "");
        } catch (Exception e) {
            e.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xtProduct = new javax.swing.JTextField();
        jbAdd = new javax.swing.JButton();
        xtSubAmt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        xtQty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        xtDescription = new javax.swing.JTextField();
        jbNew = new javax.swing.JButton();
        xtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbAdd1 = new javax.swing.JButton();
        itemcode = new javax.swing.JLabel();
        stckIDs = new javax.swing.JLabel();
        xtDescount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        xtGrandtot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        allQty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Product :");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Sub Total :");

        xtProduct.setBackground(new java.awt.Color(204, 204, 204));
        xtProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xtProduct.setFocusable(false);
        xtProduct.setRequestFocusEnabled(false);
        xtProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xtProductMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                xtProductMousePressed(evt);
            }
        });
        xtProduct.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                xtProductMouseMoved(evt);
            }
        });
        xtProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtProductActionPerformed(evt);
            }
        });
        xtProduct.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtProductFocusGained(evt);
            }
        });
        xtProduct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xtProductKeyReleased(evt);
            }
        });

        jbAdd.setBackground(new java.awt.Color(255, 255, 255));
        jbAdd.setText("Add");
        jbAdd.setToolTipText("");
        jbAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAddActionPerformed(evt);
            }
        });

        xtSubAmt.setEditable(false);
        xtSubAmt.setBackground(new java.awt.Color(204, 204, 204));
        xtSubAmt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xtSubAmt.setText("0.00");
        xtSubAmt.setFocusable(false);
        xtSubAmt.setRequestFocusEnabled(false);
        xtSubAmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtSubAmtActionPerformed(evt);
            }
        });
        xtSubAmt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtSubAmtFocusGained(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Quantity :");

        xtQty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xtQty.setText("0.00");
        xtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtQtyActionPerformed(evt);
            }
        });
        xtQty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtQtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                xtQtyFocusLost(evt);
            }
        });
        xtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xtQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xtQtyKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Description :");

        xtDescription.setForeground(Color.gray);
        xtDescription.setBackground(new java.awt.Color(204, 204, 204));
        xtDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xtDescription.setFocusable(false);
        xtDescription.setRequestFocusEnabled(false);
        xtDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xtDescriptionMouseClicked(evt);
            }
        });
        xtDescription.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                xtDescriptionMouseMoved(evt);
            }
        });
        xtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtDescriptionActionPerformed(evt);
            }
        });
        xtDescription.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtDescriptionFocusGained(evt);
            }
        });
        xtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xtDescriptionKeyReleased(evt);
            }
        });

        jbNew.setText("Select Product");
        jbNew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbNew.setFocusable(false);
        jbNew.setRequestFocusEnabled(false);
        jbNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNewActionPerformed(evt);
            }
        });

        xtPrice.setEditable(false);
        xtPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xtPrice.setText("0.00");
        xtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtPriceActionPerformed(evt);
            }
        });
        xtPrice.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtPriceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                xtPriceFocusLost(evt);
            }
        });
        xtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                xtPriceKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xtPriceKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                xtPriceKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price :");

        jbAdd1.setBackground(new java.awt.Color(255, 255, 255));
        jbAdd1.setText("Cancel");
        jbAdd1.setToolTipText("");
        jbAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdd1ActionPerformed(evt);
            }
        });

        xtDescription.setForeground(Color.gray);
        xtDescount.setBackground(new java.awt.Color(204, 204, 204));
        xtDescount.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        xtDescount.setFocusable(false);
        xtDescount.setRequestFocusEnabled(false);
        xtDescount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xtDescountMouseClicked(evt);
            }
        });
        xtDescount.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                xtDescountMouseMoved(evt);
            }
        });
        xtDescount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtDescountActionPerformed(evt);
            }
        });
        xtDescount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtDescountFocusGained(evt);
            }
        });
        xtDescount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                xtDescountKeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Item Discount :");

        xtGrandtot.setEditable(false);
        xtGrandtot.setBackground(new java.awt.Color(204, 204, 204));
        xtGrandtot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        xtGrandtot.setText("0.00");
        xtGrandtot.setFocusable(false);
        xtGrandtot.setRequestFocusEnabled(false);
        xtGrandtot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xtGrandtotActionPerformed(evt);
            }
        });
        xtGrandtot.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                xtGrandtotFocusGained(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("GrandTotal :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("%");

        allQty.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(xtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(xtSubAmt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(xtDescount, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))))
                    .addComponent(xtGrandtot, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(208, 208, 208)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jbNew, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(allQty)
                        .addGap(38, 38, 38))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jbAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(itemcode)
                    .addComponent(stckIDs))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(xtProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNew))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(xtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(xtDescount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(allQty))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xtSubAmt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xtGrandtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stckIDs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemcode))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xtProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtProductMouseClicked

    }//GEN-LAST:event_xtProductMouseClicked

    private void xtProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtProductMousePressed

    }//GEN-LAST:event_xtProductMousePressed

    private void xtProductMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtProductMouseMoved

    }//GEN-LAST:event_xtProductMouseMoved

    private void xtProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtProductActionPerformed

    }//GEN-LAST:event_xtProductActionPerformed

    private void xtProductFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtProductFocusGained

        xtProduct.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_xtProductFocusGained

    private void xtProductKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtProductKeyReleased

    }//GEN-LAST:event_xtProductKeyReleased

    private void jbAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAddActionPerformed
        try {
            if (!xtProduct.getText().equals("") & !xtDescription.getText().equals("")) {
                if (!xtPrice.getText().equals("0.00")) {
                    if (!xtQty.getText().equals("0.00") & !xtQty.getText().equals("")) {
                        double d = Double.parseDouble(xtQty.getText());
                        double d1 = Double.parseDouble(allQty.getText());
                        if(!(d1<d)){
                        BPos.Model.itemsList IL = new itemsList();
                        IL.setProductID(itemcode.getText());
                        IL.setName(xtProduct.getText());
                        IL.setDescription(xtDescription.getText());
                        IL.setPrice(Double.parseDouble(xtPrice.getText()));
                        IL.setQty(Double.parseDouble(xtQty.getText()));
                        IL.setSubAmount(Double.parseDouble(xtSubAmt.getText()));
                        IL.setStockID(Integer.parseInt(stckIDs.getText()));
                        IL.setDescount(Integer.parseInt(xtDescount.getText()));
                        IL.setGrandtot(Double.parseDouble(xtGrandtot.getText()));
                        new Invoice(_INVOICE, IL);
                        this.dispose();
                        }else{
                            xtQty.setBackground(Color.red);
                            xtQty.setForeground(Color.white);
                            JOptionPane.showMessageDialog(rootPane, "qty");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Enter valid qty");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Enter valid price");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Plese select product");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jbAddActionPerformed

    private void xtSubAmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtSubAmtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtSubAmtActionPerformed

    private void xtSubAmtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtSubAmtFocusGained

        xtSubAmt.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_xtSubAmtFocusGained

    private void xtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtQtyActionPerformed

    }//GEN-LAST:event_xtQtyActionPerformed

    private void xtQtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtQtyFocusGained
       // xtQty.selectAll();
       // xtQty.setBackground(Color.white);
       // xtQty.setText(null);
    }//GEN-LAST:event_xtQtyFocusGained

    private void xtQtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtQtyFocusLost

    }//GEN-LAST:event_xtQtyFocusLost
    double p;
    double q;

    public boolean isNumber(String num) {
        boolean b = false;
        try {

            double u = Double.parseDouble(num);
            b = true;
        } catch (Exception e) {
            b = false;
        }
        return b;
    }
    private void xtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtQtyKeyReleased
        try {

            if (!xtQty.getText().equals("")) {
                if (isNumber(xtPrice.getText())) {
                    p = Double.parseDouble(xtPrice.getText());
                }
                if (isNumber(xtQty.getText())) {
                    q = Double.parseDouble(xtQty.getText());
                }
            } else {
                xtSubAmt.setText(xtPrice.getText());
            }
            xtSubAmt.setText("");
            xtSubAmt.setText("" + p * q);

            double sub = Double.parseDouble(xtSubAmt.getText());
            int di = Integer.parseInt(xtDescount.getText());
            double s = sub * di / 100;
            sub = sub - s;
            xtGrandtot.setText(sub + "");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_xtQtyKeyReleased

    private void xtQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtQtyKeyTyped
        char c = evt.getKeyChar();
        if (!((c >= '0' && c <= '9') || (c == '.' && !xtQty.getText().contains(".")))) {
            evt.consume();
        }
    }//GEN-LAST:event_xtQtyKeyTyped

    private void xtDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtDescriptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescriptionMouseClicked

    private void xtDescriptionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtDescriptionMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescriptionMouseMoved

    private void xtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescriptionActionPerformed

    private void xtDescriptionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtDescriptionFocusGained
        xtDescription.setBackground(new Color(204, 204, 204));
    }//GEN-LAST:event_xtDescriptionFocusGained

    private void xtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtDescriptionKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescriptionKeyReleased

    private void jbNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNewActionPerformed
        new SelectInvoiceItem(this).setVisible(true);
    }//GEN-LAST:event_jbNewActionPerformed

    private void xtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtPriceActionPerformed

    }//GEN-LAST:event_xtPriceActionPerformed

    private void xtPriceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtPriceFocusGained

    }//GEN-LAST:event_xtPriceFocusGained

    private void xtPriceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtPriceFocusLost

    }//GEN-LAST:event_xtPriceFocusLost

    private void xtPriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtPriceKeyPressed

    }//GEN-LAST:event_xtPriceKeyPressed

    private void xtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtPriceKeyReleased
        xtSubAmt.setText(xtPrice.getText());
    }//GEN-LAST:event_xtPriceKeyReleased

    private void xtPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtPriceKeyTyped
        char c = evt.getKeyChar();
        if (!(c >= '0' && c <= '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_xtPriceKeyTyped

    private void jbAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdd1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbAdd1ActionPerformed

    private void xtDescountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtDescountMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescountMouseClicked

    private void xtDescountMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xtDescountMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescountMouseMoved

    private void xtDescountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtDescountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescountActionPerformed

    private void xtDescountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtDescountFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescountFocusGained

    private void xtDescountKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_xtDescountKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_xtDescountKeyReleased

    private void xtGrandtotFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_xtGrandtotFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_xtGrandtotFocusGained

    private void xtGrandtotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xtGrandtotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xtGrandtotActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Invoice_Items.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Invoice_Items.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Invoice_Items.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Invoice_Items.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Invoice_Items().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allQty;
    private javax.swing.JLabel itemcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAdd;
    private javax.swing.JButton jbAdd1;
    private javax.swing.JButton jbNew;
    private javax.swing.JLabel stckIDs;
    public javax.swing.JTextField xtDescount;
    public javax.swing.JTextField xtDescription;
    private javax.swing.JTextField xtGrandtot;
    public javax.swing.JTextField xtPrice;
    public javax.swing.JTextField xtProduct;
    private javax.swing.JTextField xtQty;
    private javax.swing.JTextField xtSubAmt;
    // End of variables declaration//GEN-END:variables
}
