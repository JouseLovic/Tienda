package View;

import Controllers.ControllerSettings;
import Controllers.Settings.ReSettings;

public class PanelSettings extends javax.swing.JPanel {

      ReSettings re;
      private static boolean state;

      public PanelSettings() {
            initComponents();
            re = new ReSettings();
            state = true;
            //This textFields are for change the titles in the diferents panels
            titleLoginField.setText(ReSettings.getTitleLogin());
            titleInventaryField.setText(ReSettings.getTitleInventary());
            titleEntriesField.setText(ReSettings.getTitleEntries());
            titleBillField.setText(ReSettings.getTitleBill());
            titleVendorsField.setText(ReSettings.getTitleVendors());
            new ControllerSettings(re.getLanguageSelected(), comboLanguages, comboLanguages, re.getTheme());
            ControllerSettings.showLabels(labletTitleChange, labelTitleCompany, labelTitleInventary, labelTitleEntries, labelTitleBill, labelTitleV, labelTitlePrevious);
      }

      @SuppressWarnings("")
      // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
      private void initComponents() {

            jPanel1 = new javax.swing.JPanel();
            labelTitleSettings = new javax.swing.JLabel();
            titleLoginField = new Utilities.TextField();
            titleInventaryField = new Utilities.TextField();
            titleEntriesField = new Utilities.TextField();
            titleBillField = new Utilities.TextField();
            titleVendorsField = new Utilities.TextField();
            comboLanguages = new javax.swing.JComboBox<>();
            labletTitleChange = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jSeparator1 = new javax.swing.JSeparator();
            jPanel2 = new javax.swing.JPanel();
            labelExample = new javax.swing.JLabel();
            labelTitlePrevious = new javax.swing.JLabel();
            labelTitleV = new javax.swing.JLabel();
            labelTitleCompany = new javax.swing.JLabel();
            labelTitleInventary = new javax.swing.JLabel();
            labelTitleEntries = new javax.swing.JLabel();
            labelTitleBill = new javax.swing.JLabel();
            buttonCancel = new Utilities.Button();
            buttonReset = new Utilities.Button();
            buttonApplyChanges = new Utilities.Button();
            jLabel1 = new javax.swing.JLabel();
            comboThemes = new javax.swing.JComboBox<>();

            jPanel1.setBackground(new java.awt.Color(255, 255, 255));
            jPanel1.setLayout(null);

            labelTitleSettings.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
            labelTitleSettings.setForeground(new java.awt.Color(0, 0, 0));
            labelTitleSettings.setText("Settings");
            jPanel1.add(labelTitleSettings);
            labelTitleSettings.setBounds(10, 10, 160, 60);

            titleLoginField.setForeground(new java.awt.Color(0, 0, 0));
            titleLoginField.setShadowColor(new java.awt.Color(0, 0, 0));
            titleLoginField.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        titleLoginFieldActionPerformed(evt);
                  }
            });
            titleLoginField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        titleLoginFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(titleLoginField);
            titleLoginField.setBounds(10, 220, 210, 41);

            titleInventaryField.setForeground(new java.awt.Color(0, 0, 0));
            titleInventaryField.setShadowColor(new java.awt.Color(0, 0, 0));
            titleInventaryField.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        titleInventaryFieldActionPerformed(evt);
                  }
            });
            titleInventaryField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        titleInventaryFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(titleInventaryField);
            titleInventaryField.setBounds(10, 280, 210, 41);

            titleEntriesField.setForeground(new java.awt.Color(0, 0, 0));
            titleEntriesField.setShadowColor(new java.awt.Color(0, 0, 0));
            titleEntriesField.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        titleEntriesFieldActionPerformed(evt);
                  }
            });
            titleEntriesField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        titleEntriesFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(titleEntriesField);
            titleEntriesField.setBounds(10, 350, 210, 41);

            titleBillField.setForeground(new java.awt.Color(0, 0, 0));
            titleBillField.setShadowColor(new java.awt.Color(0, 0, 0));
            titleBillField.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        titleBillFieldActionPerformed(evt);
                  }
            });
            titleBillField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        titleBillFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(titleBillField);
            titleBillField.setBounds(10, 420, 210, 41);

            titleVendorsField.setForeground(new java.awt.Color(0, 0, 0));
            titleVendorsField.setShadowColor(new java.awt.Color(0, 0, 0));
            titleVendorsField.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        titleVendorsFieldActionPerformed(evt);
                  }
            });
            titleVendorsField.addKeyListener(new java.awt.event.KeyAdapter() {
                  public void keyTyped(java.awt.event.KeyEvent evt) {
                        titleVendorsFieldKeyTyped(evt);
                  }
            });
            jPanel1.add(titleVendorsField);
            titleVendorsField.setBounds(10, 490, 210, 41);

            comboLanguages.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        comboLanguagesActionPerformed(evt);
                  }
            });
            jPanel1.add(comboLanguages);
            comboLanguages.setBounds(220, 50, 90, 30);

            labletTitleChange.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
            labletTitleChange.setForeground(new java.awt.Color(0, 0, 0));
            labletTitleChange.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
            jPanel1.add(labletTitleChange);
            labletTitleChange.setBounds(20, 180, 60, 30);

            jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
            jLabel2.setForeground(new java.awt.Color(0, 0, 0));
            jLabel2.setText("Language");
            jPanel1.add(jLabel2);
            jLabel2.setBounds(220, 20, 90, 30);
            jPanel1.add(jSeparator1);
            jSeparator1.setBounds(-2, 90, 990, 10);

            jPanel2.setBackground(new java.awt.Color(255, 255, 255));
            jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelExample, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                        .addContainerGap())
            );
            jPanel2Layout.setVerticalGroup(
                  jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(labelExample, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
            );

            jPanel1.add(jPanel2);
            jPanel2.setBounds(20, 580, 360, 210);

            labelTitlePrevious.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
            labelTitlePrevious.setForeground(new java.awt.Color(0, 0, 0));
            labelTitlePrevious.setText("Previsualization of title");
            jPanel1.add(labelTitlePrevious);
            labelTitlePrevious.setBounds(20, 540, 190, 40);

            labelTitleV.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
            labelTitleV.setForeground(new java.awt.Color(0, 0, 0));
            jPanel1.add(labelTitleV);
            labelTitleV.setBounds(230, 480, 130, 40);

            labelTitleCompany.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
            labelTitleCompany.setForeground(new java.awt.Color(0, 0, 0));
            jPanel1.add(labelTitleCompany);
            labelTitleCompany.setBounds(230, 220, 130, 40);

            labelTitleInventary.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
            labelTitleInventary.setForeground(new java.awt.Color(0, 0, 0));
            jPanel1.add(labelTitleInventary);
            labelTitleInventary.setBounds(230, 280, 130, 40);

            labelTitleEntries.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
            labelTitleEntries.setForeground(new java.awt.Color(0, 0, 0));
            jPanel1.add(labelTitleEntries);
            labelTitleEntries.setBounds(230, 340, 130, 40);

            labelTitleBill.setFont(new java.awt.Font("Baskerville Old Face", 0, 14)); // NOI18N
            labelTitleBill.setForeground(new java.awt.Color(0, 0, 0));
            jPanel1.add(labelTitleBill);
            labelTitleBill.setBounds(230, 410, 130, 40);

            buttonCancel.setForeground(new java.awt.Color(0, 0, 0));
            buttonCancel.setText("Cancel");
            buttonCancel.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonCancel.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonCancelActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonCancel);
            buttonCancel.setBounds(620, 900, 140, 50);

            buttonReset.setForeground(new java.awt.Color(0, 0, 0));
            buttonReset.setText("Reset default settings");
            buttonReset.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonReset.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonResetActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonReset);
            buttonReset.setBounds(760, 900, 160, 50);

            buttonApplyChanges.setForeground(new java.awt.Color(0, 0, 0));
            buttonApplyChanges.setText("Apply");
            buttonApplyChanges.setShadowColor(new java.awt.Color(0, 0, 0));
            buttonApplyChanges.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        buttonApplyChangesActionPerformed(evt);
                  }
            });
            jPanel1.add(buttonApplyChanges);
            buttonApplyChanges.setBounds(920, 900, 120, 50);

            jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
            jLabel1.setForeground(new java.awt.Color(0, 0, 0));
            jLabel1.setText("Theme");
            jPanel1.add(jLabel1);
            jLabel1.setBounds(330, 20, 90, 30);

            comboThemes.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        comboThemesActionPerformed(evt);
                  }
            });
            jPanel1.add(comboThemes);
            comboThemes.setBounds(330, 50, 90, 30);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 1061, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                              .addGap(0, 0, 0)
                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1061, Short.MAX_VALUE)
                              .addGap(0, 0, 0)))
            );
            layout.setVerticalGroup(
                  layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGap(0, 971, Short.MAX_VALUE)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                              .addGap(0, 0, 0)
                              .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE)
                              .addGap(0, 0, 0)))
            );
      }// </editor-fold>//GEN-END:initComponents

      private void buttonApplyChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApplyChangesActionPerformed
            int selectedLanguage = comboLanguages.getSelectedIndex();
            boolean select = ControllerSettings.changeLanguage(selectedLanguage);
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
            ControllerSettings.applyNewSettings(select);
      }//GEN-LAST:event_buttonApplyChangesActionPerformed

      private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_buttonResetActionPerformed

      private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_buttonCancelActionPerformed

      private void titleLoginFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleLoginFieldActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_titleLoginFieldActionPerformed

      private void titleInventaryFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleInventaryFieldActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_titleInventaryFieldActionPerformed

      private void titleEntriesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleEntriesFieldActionPerformed
            // TODO add your handling code here:
      }//GEN-LAST:event_titleEntriesFieldActionPerformed

      private void titleBillFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleBillFieldActionPerformed
            
      }//GEN-LAST:event_titleBillFieldActionPerformed

      private void titleVendorsFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleVendorsFieldActionPerformed

      }//GEN-LAST:event_titleVendorsFieldActionPerformed

      private void comboLanguagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboLanguagesActionPerformed
            int selectedLanguage = comboLanguages.getSelectedIndex();
            boolean select = ControllerSettings.changeLanguage(selectedLanguage);
            String theme = (String) re.getTheme();
             new ControllerSettings(select, comboLanguages, comboThemes, theme);
            ControllerSettings.changeLanguageLabels(labletTitleChange, labelTitleCompany, labelTitleInventary, labelTitleEntries, labelTitleBill, labelTitleV, labelTitlePrevious);
      }//GEN-LAST:event_comboLanguagesActionPerformed

      private void comboThemesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboThemesActionPerformed
            int selectedTheme = comboLanguages.getSelectedIndex();
            ControllerSettings.takeIndexComboTheme(comboThemes);
      }//GEN-LAST:event_comboThemesActionPerformed

      private void titleLoginFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleLoginFieldKeyTyped
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
      }//GEN-LAST:event_titleLoginFieldKeyTyped

      private void titleInventaryFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleInventaryFieldKeyTyped
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
      }//GEN-LAST:event_titleInventaryFieldKeyTyped

      private void titleEntriesFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleEntriesFieldKeyTyped
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
      }//GEN-LAST:event_titleEntriesFieldKeyTyped

      private void titleBillFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleBillFieldKeyTyped
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
      }//GEN-LAST:event_titleBillFieldKeyTyped

      private void titleVendorsFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_titleVendorsFieldKeyTyped
            ControllerSettings.takeTextForFields(titleLoginField.getText(),
                    titleInventaryField.getText(), titleEntriesField.getText(),
                    titleBillField.getText(),
                    titleVendorsField.getText());
      }//GEN-LAST:event_titleVendorsFieldKeyTyped

      public static boolean isState() {
            return state;
      }

      public static void setState(boolean state) {
            PanelSettings.state = state;
      }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private Utilities.Button buttonApplyChanges;
      private Utilities.Button buttonCancel;
      private Utilities.Button buttonReset;
      private javax.swing.JComboBox<String> comboLanguages;
      private javax.swing.JComboBox<String> comboThemes;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JPanel jPanel1;
      private javax.swing.JPanel jPanel2;
      private javax.swing.JSeparator jSeparator1;
      private javax.swing.JLabel labelExample;
      private javax.swing.JLabel labelTitleBill;
      private javax.swing.JLabel labelTitleCompany;
      private javax.swing.JLabel labelTitleEntries;
      private javax.swing.JLabel labelTitleInventary;
      private javax.swing.JLabel labelTitlePrevious;
      private javax.swing.JLabel labelTitleSettings;
      private javax.swing.JLabel labelTitleV;
      private javax.swing.JLabel labletTitleChange;
      private Utilities.TextField titleBillField;
      private Utilities.TextField titleEntriesField;
      private Utilities.TextField titleInventaryField;
      private Utilities.TextField titleLoginField;
      private Utilities.TextField titleVendorsField;
      // End of variables declaration//GEN-END:variables
}
