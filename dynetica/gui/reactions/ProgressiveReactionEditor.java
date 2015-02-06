/*
 * ProgressiveReactionEditor.java
 *
 * Created on April 10, 2001, 2:07 AM
 */

package dynetica.gui.reactions;

/**
 *
 * @author Lingchong You
 * @version 0.01
 */

import dynetica.entity.*;
import javax.swing.*;

public class ProgressiveReactionEditor extends javax.swing.JPanel {

    dynetica.reaction.ProgressiveReaction reaction;
    DefaultListModel substanceListModel = new DefaultListModel();
    DefaultListModel parameterListModel = new DefaultListModel();

    /** Creates new customizer ProgressiveReactionEditor */
    public ProgressiveReactionEditor(dynetica.reaction.ProgressiveReaction r) {
        reaction = r;
        initComponents();
        updateListModels();
        tabbedInfoPane.setTitleAt(0, "Variables");
        tabbedInfoPane.setTitleAt(1, "Annotation");
        
    }

    // update the substancelistModel and parameterListModel everytime the
    // reaction is modified.

    private void updateListModels() {
        if (!substanceListModel.isEmpty())
            substanceListModel.removeAllElements();

        Object[] subs = reaction.getSubstances().toArray();
        for (int i = 0; i < subs.length; i++) {
            substanceListModel.addElement(((Entity) (subs[i])).getName());
        }
        if (!substanceListModel.isEmpty())
            substanceList.setSelectedIndex(0);

        if (!parameterListModel.isEmpty())
            parameterListModel.removeAllElements();
        Object[] paras = reaction.getParameters().toArray();
        for (int i = 0; i < paras.length; i++) {
            parameterListModel.addElement(((Entity) (paras[i])).getName());
        }

        if (!parameterListModel.isEmpty())
            parameterList.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed"
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSplitPane3 = new javax.swing.JSplitPane();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        formulaLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stoichiometryField = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        kineticsField = new javax.swing.JTextArea();
        tabbedInfoPane = new javax.swing.JTabbedPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        substancePanel = new javax.swing.JPanel();
        sListPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        substanceList = new javax.swing.JList();
        jLabel5 = new javax.swing.JLabel();
        sEditor = new javax.swing.JPanel();
        parameterPanel = new javax.swing.JPanel();
        pListPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        parameterList = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        pEditor = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        annotationArea = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <i> Progressive Reaction </i> " + reaction.getName());
        jLabel1.setMaximumSize(new java.awt.Dimension(220, 30));
        jLabel1.setMinimumSize(new java.awt.Dimension(220, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(220, 30));

        setMaximumSize(new java.awt.Dimension(350, 400));
        setLayout(new java.awt.BorderLayout(0, 1));

        jSplitPane3.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        jSplitPane3.setMaximumSize(new java.awt.Dimension(350, 400));

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setDividerSize(1);

        jPanel2.setPreferredSize(new java.awt.Dimension(130, 100));
        jPanel2.setLayout(new java.awt.GridLayout(2, 1, 2, 2));

        formulaLabel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        formulaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        formulaLabel.setText("Stoichiometry");
        formulaLabel.setToolTipText("The formula of the reaction following the current\nconvention in writing down chemical reactions. \nFor example, you can write:\n\n 3 A + 2 B -> 5 D");
        formulaLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        formulaLabel.setMaximumSize(new java.awt.Dimension(400, 25));
        formulaLabel.setMinimumSize(new java.awt.Dimension(100, 25));
        formulaLabel.setPreferredSize(new java.awt.Dimension(130, 25));
        jPanel2.add(formulaLabel);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Kinetics");
        jLabel3.setToolTipText("The rate expression that describes the kinetics of this \nreaction. Follow the convention in writing down a \nmathematical expression.");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 25));
        jPanel2.add(jLabel3);

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel3.setLayout(new java.awt.GridLayout(2, 1, 2, 2));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(200, 40));

        stoichiometryField.setLineWrap(true);
        stoichiometryField.setText(getStoichiometry());
        stoichiometryField.setWrapStyleWord(true);
        jScrollPane1.setViewportView(stoichiometryField);

        jPanel3.add(jScrollPane1);

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 40));

        kineticsField.setLineWrap(true);
        kineticsField.setText(getKinetics());
        kineticsField.setWrapStyleWord(true);
        jScrollPane2.setViewportView(kineticsField);

        jPanel3.add(jScrollPane2);

        jSplitPane1.setRightComponent(jPanel3);

        jSplitPane3.setLeftComponent(jSplitPane1);

        tabbedInfoPane.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        tabbedInfoPane.setName("Advanced"); // NOI18N

        jSplitPane2.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        substancePanel.setPreferredSize(new java.awt.Dimension(518, 220));
        substancePanel.setLayout(new java.awt.GridLayout(1, 2));

        sListPanel.setLayout(new java.awt.BorderLayout());

        substanceList.setModel(substanceListModel);
        substanceList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        substanceList.setVisibleRowCount(Math.min(8, substanceListModel.getSize()));
        substanceList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                substanceListValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(substanceList);

        sListPanel.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Substances");
        sListPanel.add(jLabel5, java.awt.BorderLayout.NORTH);

        substancePanel.add(sListPanel);

        sEditor.setPreferredSize(new java.awt.Dimension(50, 80));
        substancePanel.add(sEditor);

        jSplitPane2.setTopComponent(substancePanel);

        parameterPanel.setPreferredSize(new java.awt.Dimension(518, 220));
        parameterPanel.setLayout(new java.awt.GridLayout(1, 2));

        pListPanel.setLayout(new java.awt.BorderLayout());

        parameterList.setModel(parameterListModel);
        parameterList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        parameterList.setVisibleRowCount(Math.min(8, parameterListModel.getSize()));
        parameterList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                parameterListValueChanged(evt);
            }
        });
        jScrollPane4.setViewportView(parameterList);

        pListPanel.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Parameters");
        pListPanel.add(jLabel6, java.awt.BorderLayout.NORTH);

        parameterPanel.add(pListPanel);

        pEditor.setPreferredSize(new java.awt.Dimension(50, 80));

        javax.swing.GroupLayout pEditorLayout = new javax.swing.GroupLayout(pEditor);
        pEditor.setLayout(pEditorLayout);
        pEditorLayout.setHorizontalGroup(
            pEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );
        pEditorLayout.setVerticalGroup(
            pEditorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        parameterPanel.add(pEditor);

        jSplitPane2.setBottomComponent(parameterPanel);

        tabbedInfoPane.addTab("tab1", jSplitPane2);

        annotationArea.setLineWrap(true);
        annotationArea.setText(reaction.getAnnotation());
        annotationArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                annotationAreaFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(annotationArea);

        tabbedInfoPane.addTab("tab4", jScrollPane5);

        jSplitPane3.setRightComponent(tabbedInfoPane);

        add(jSplitPane3, java.awt.BorderLayout.CENTER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane6.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if (stoichiometryField.getText().length() == 0 || kineticsField.getText().length() == 0){
        JOptionPane.showMessageDialog(this ,"Please enter both stoichiometry and kinetics",
        "Input Error",
        JOptionPane.ERROR_MESSAGE);
        return;
    }
        setStoichiometry();
        jTextArea1.insert("Stoichiometry was succesfully updated. \n", 0);
        setKinetics();
        jTextArea1.insert("Kinetics were succesfully updated. \n", 0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void annotationAreaFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_annotationAreaFocusLost
        setAnnotation();
    }// GEN-LAST:event_annotationAreaFocusLost

    private void parameterListValueChanged(
            
            javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_parameterListValueChanged
        parameterPanel.remove(pEditor);
        // If condition added by Kanishk Asthana on 23 July 2013: To fix a
        // runtime error. This error
        // was caused whenever the method updatelistmodel() was executed.
        // This method executes everytime the parameterlist is to be updated; so
        // whenever updatelistmodels()
        // was executed all elements were removed from the parameterlist. Since
        // this removal of elements triggered
        // a parameterListvaluechanged event; the event led to this method being
        // executed. This method would then try to get
        // the current parameter. However since the parameter list was already
        // empty excecution of this method
        // would lead to the Editor misbehaving(runtime error)!
        // Same logic applies for the changes to substancelistmodel as well.
        
        if (getCurrentParameter() != null) {
            pEditor = getCurrentParameter().editor();
            parameterPanel.add(pEditor);
            parameterPanel.validate();
        }

    }// GEN-LAST:event_parameterListValueChanged

    private void substanceListValueChanged(
            javax.swing.event.ListSelectionEvent evt) {// GEN-FIRST:event_substanceListValueChanged

        substancePanel.remove(sEditor);
        // If condition added by Kanishk Asthana on 23 July 2013: See
        // parameterListvaluechanged for and explaination
        if (getCurrentSubstance() != null) {
            sEditor = getCurrentSubstance().editor();
            substancePanel.add(sEditor);
            substancePanel.validate();
        }

    }// GEN-LAST:event_substanceListValueChanged

    private Parameter getCurrentParameter() {
        int index = parameterList.getSelectedIndex();
        // If condition added by Kanishk Asthana on 23 July 2013: See
        // parameterListvaluechanged for and explaination
        if (index != -1) {
            String pName = (String) (parameterListModel.get(index));
            return (Parameter) (reaction.getSystem().get(pName));
        } else
            return null;
    }

    private Substance getCurrentSubstance() {
        int index = substanceList.getSelectedIndex();
        // If condition added by Kanishk Asthana on 23 July 2013: See
        // parameterListvaluechanged for and explaination
        if (index != -1) {
            String substanceName = (String) (substanceListModel.get(index));
            return (Substance) (reaction.getSystem().get(substanceName));
        } else
            return null;
    }

    /* private void kineticsFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_kineticsFieldFocusLost
        setKinetics();
    }// GEN-LAST:event_kineticsFieldFocusLost

    private void stoichiometryFieldFocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_stoichiometryFieldFocusLost
        setStoichiometry();
    }// GEN-LAST:event_stoichiometryFieldFocusLost
    */
    
    private void setAnnotation() {
        String newAnnotation = annotationArea.getText();
        String oldOne = reaction.getAnnotation();
        if (oldOne.compareTo(newAnnotation) != 0) {
            reaction.getSystem().fireSystemStateChange();
            reaction.setAnnotation(newAnnotation);
        }
    }

    private String getStoichiometry() {
        if (reaction.getStoichiometry() != null)
            return reaction.getStoichiometry();
        else
            return "";
    }

    private String getKinetics() {
        if (reaction.getKinetics() != null)
            return reaction.getKinetics();
        else
            return "";
    }

    private void setStoichiometry() {
        String stoichiometry = stoichiometryField.getText().trim();
        String oldStoichiometry = getStoichiometry();
        if (stoichiometry.length() > 0
                && oldStoichiometry.compareTo(stoichiometry) != 0) {
            reaction.setStoichiometry(stoichiometry);
//            updateListModels();
        }
    }

    private void setKinetics() {
        String oldKinetics = getKinetics();
        String kinetics = kineticsField.getText().trim();
        if (kinetics.length() > 0 && oldKinetics.compareTo(kinetics) != 0) {
            try {
                reaction.setKinetics(kinetics);
                updateListModels();
            } catch (dynetica.expression.IllegalExpressionException iee) {
                System.out.println(iee);
            }
        }
    }

    private String getReactionName() {
        if (reaction.getName() != null)
            return reaction.getName();
        else
            return "";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea annotationArea;
    private javax.swing.JLabel formulaLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JSplitPane jSplitPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea kineticsField;
    private javax.swing.JPanel pEditor;
    private javax.swing.JPanel pListPanel;
    private javax.swing.JList parameterList;
    private javax.swing.JPanel parameterPanel;
    private javax.swing.JPanel sEditor;
    private javax.swing.JPanel sListPanel;
    private javax.swing.JTextArea stoichiometryField;
    private javax.swing.JList substanceList;
    private javax.swing.JPanel substancePanel;
    private javax.swing.JTabbedPane tabbedInfoPane;
    // End of variables declaration//GEN-END:variables
    
    public static class Tester {
        public static void main(String[] args) {
            dynetica.reaction.ProgressiveReaction reaction = new dynetica.reaction.ProgressiveReaction(
                    "TestReaction", new dynetica.system.ReactiveSystem("Test"));
            try {
                reaction.setProperty("stoichiometry",
                        "A + B + C + D -> E + F + K + L");
                reaction.setProperty("Kinetics",
                        "k1 * [A] * sin([B]) * log([C]) / ([E]^[F] * [F]^100 * [K] * [L])");
                javax.swing.JFrame frame = new javax.swing.JFrame();

                frame.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                frame.getContentPane().add(reaction.editor());
                frame.pack();
                frame.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
