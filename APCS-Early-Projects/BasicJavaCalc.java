/*
THIS IS FOR APCS
APCS WITH THE HANLEY

Three Hanleys for the Elven-kings under the sky,
Seven for the Dwarf-lords in their halls of stone,
Nine for Mortal Men doomed to die,
One for the Dark Lord on his dark throne
In the Land of Mordor where the Shadows lie.

One Hanley to rule them all, One Hanley to find them,
One Hanley to bring them all and in the darkness bind them
In the Land of Mordor where the Shadows lie.

Project Author:         Brad Estus
Project Group/Topic:    APCS Summer Work
Project Type:           Swing GUI Application
Date Completed:         Sept. 19, 2018
Date Due:               Sept. ??, 2018
 */
public class BasicJavaCalc extends javax.swing.JFrame {

    /**
     * Creates new form BasicJavaCalc
     */
    public BasicJavaCalc() {
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

        HeaderLBL = new javax.swing.JLabel();
        IntTF = new javax.swing.JTextField();
        DoubleTF = new javax.swing.JTextField();
        DeltaIntTF = new javax.swing.JTextField();
        DeltaDoubleTF = new javax.swing.JTextField();
        intLBL = new javax.swing.JLabel();
        intDeltaLBL = new javax.swing.JLabel();
        doubleLBL = new javax.swing.JLabel();
        doubleDeltaLBL = new javax.swing.JLabel();
        clearBUT = new javax.swing.JButton();
        addIntBUT = new javax.swing.JButton();
        subIntBUT = new javax.swing.JButton();
        multIntBUT = new javax.swing.JButton();
        divIntBUT = new javax.swing.JButton();
        modIntBUT = new javax.swing.JButton();
        intPwrBUT = new javax.swing.JButton();
        addDubBUT = new javax.swing.JButton();
        subDubBUT = new javax.swing.JButton();
        multDubBUT = new javax.swing.JButton();
        divDubBUT = new javax.swing.JButton();
        dubPwrBUT = new javax.swing.JButton();
        ansFIELD = new javax.swing.JLabel();
        dubClearBUT = new javax.swing.JButton();
        intClearBUT1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Calculator");
        setBackground(new java.awt.Color(0, 0, 55));
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(450, 600));
        getContentPane().setLayout(null);

        HeaderLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HeaderLBL.setText("Multi-Operational Calculator");
        HeaderLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(HeaderLBL);
        HeaderLBL.setBounds(140, 20, 160, 47);

        IntTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntTFActionPerformed(evt);
            }
        });
        getContentPane().add(IntTF);
        IntTF.setBounds(50, 90, 140, 30);

        DoubleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoubleTFActionPerformed(evt);
            }
        });
        getContentPane().add(DoubleTF);
        DoubleTF.setBounds(230, 90, 150, 30);

        DeltaIntTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeltaIntTFActionPerformed(evt);
            }
        });
        getContentPane().add(DeltaIntTF);
        DeltaIntTF.setBounds(50, 149, 140, 30);

        DeltaDoubleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeltaDoubleTFActionPerformed(evt);
            }
        });
        getContentPane().add(DeltaDoubleTF);
        DeltaDoubleTF.setBounds(230, 149, 150, 30);

        intLBL.setText("Integer");
        getContentPane().add(intLBL);
        intLBL.setBounds(50, 70, 60, 15);

        intDeltaLBL.setText("Delta-Integer");
        getContentPane().add(intDeltaLBL);
        intDeltaLBL.setBounds(50, 130, 80, 15);

        doubleLBL.setText("Double");
        getContentPane().add(doubleLBL);
        doubleLBL.setBounds(230, 70, 60, 20);

        doubleDeltaLBL.setText("Delta-Double");
        getContentPane().add(doubleDeltaLBL);
        doubleDeltaLBL.setBounds(230, 130, 80, 15);

        clearBUT.setText("CLEAR ALL");
        clearBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBUTActionPerformed(evt);
            }
        });
        getContentPane().add(clearBUT);
        clearBUT.setBounds(130, 440, 150, 25);

        addIntBUT.setText("+ =");
        addIntBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addIntBUTActionPerformed(evt);
            }
        });
        getContentPane().add(addIntBUT);
        addIntBUT.setBounds(50, 190, 50, 25);

        subIntBUT.setText("- =");
        subIntBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subIntBUTActionPerformed(evt);
            }
        });
        getContentPane().add(subIntBUT);
        subIntBUT.setBounds(50, 230, 50, 25);

        multIntBUT.setText("* =");
        multIntBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multIntBUTActionPerformed(evt);
            }
        });
        getContentPane().add(multIntBUT);
        multIntBUT.setBounds(50, 270, 50, 25);

        divIntBUT.setText("/ =");
        divIntBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divIntBUTActionPerformed(evt);
            }
        });
        getContentPane().add(divIntBUT);
        divIntBUT.setBounds(50, 310, 50, 25);

        modIntBUT.setText("% =");
        modIntBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modIntBUTActionPerformed(evt);
            }
        });
        getContentPane().add(modIntBUT);
        modIntBUT.setBounds(50, 350, 50, 25);

        intPwrBUT.setText("x^y");
        intPwrBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intPwrBUTActionPerformed(evt);
            }
        });
        getContentPane().add(intPwrBUT);
        intPwrBUT.setBounds(50, 390, 50, 25);

        addDubBUT.setText("+ =");
        addDubBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDubBUTActionPerformed(evt);
            }
        });
        getContentPane().add(addDubBUT);
        addDubBUT.setBounds(330, 190, 50, 25);

        subDubBUT.setText("- =");
        subDubBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subDubBUTActionPerformed(evt);
            }
        });
        getContentPane().add(subDubBUT);
        subDubBUT.setBounds(330, 230, 50, 25);

        multDubBUT.setText("* =");
        multDubBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multDubBUTActionPerformed(evt);
            }
        });
        getContentPane().add(multDubBUT);
        multDubBUT.setBounds(330, 270, 50, 25);

        divDubBUT.setText("/ =");
        divDubBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divDubBUTActionPerformed(evt);
            }
        });
        getContentPane().add(divDubBUT);
        divDubBUT.setBounds(330, 310, 50, 25);

        dubPwrBUT.setText("x^y");
        dubPwrBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubPwrBUTActionPerformed(evt);
            }
        });
        getContentPane().add(dubPwrBUT);
        dubPwrBUT.setBounds(330, 390, 50, 25);

        ansFIELD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ansFIELD.setDoubleBuffered(true);
        ansFIELD.setFocusable(false);
        ansFIELD.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(ansFIELD);
        ansFIELD.setBounds(140, 210, 140, 80);

        dubClearBUT.setText("Double");
        dubClearBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dubClearBUTActionPerformed(evt);
            }
        });
        getContentPane().add(dubClearBUT);
        dubClearBUT.setBounds(210, 470, 70, 25);

        intClearBUT1.setText("Integer");
        intClearBUT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                intClearBUT1ActionPerformed(evt);
            }
        });
        getContentPane().add(intClearBUT1);
        intClearBUT1.setBounds(130, 470, 70, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntTFActionPerformed

    }//GEN-LAST:event_IntTFActionPerformed

    private void DoubleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoubleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoubleTFActionPerformed

    private void DeltaDoubleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeltaDoubleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeltaDoubleTFActionPerformed

    private void DeltaIntTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeltaIntTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeltaIntTFActionPerformed

    private void multIntBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multIntBUTActionPerformed
        String tempa = IntTF.getText();
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        int result = a * b;
        System.out.println("INTEGER MULTIPLICATION");
        System.out.println(a + "*" + b);
        System.out.println(result);

        IntTF.setText("" + result);
        DeltaIntTF.setText("");
    }//GEN-LAST:event_multIntBUTActionPerformed

    private void divIntBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divIntBUTActionPerformed
        String tempa = IntTF.getText();                                             //These really should all redirect to the same method to do the first 4 lines but whatever
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        if (b == 0) {
            DeltaIntTF.setText("Invalid Input.");
            System.out.println("Error Caught | Integer Division | Divide By 0 Error");
        } else {
            int result = a / b;
            System.out.println("INTEGER DIVISION");
            System.out.println(a + "/" + b);
            System.out.println(result);
            IntTF.setText("" + result);
            DeltaIntTF.setText("");
        }
    }//GEN-LAST:event_divIntBUTActionPerformed

    private void multDubBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multDubBUTActionPerformed
        String tempa = DoubleTF.getText();
        String tempb = DeltaDoubleTF.getText();
        double a = inputCheckDUB(tempa);
        double b = inputCheckDUB(tempb);
        double result = a * b;
        System.out.println("DOUBLE MULTIPLICATION");
        System.out.println(a + "*" + b);
        System.out.println(result);

        DoubleTF.setText("" + result);
        DeltaDoubleTF.setText("");
    }//GEN-LAST:event_multDubBUTActionPerformed

    private void divDubBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divDubBUTActionPerformed
        String tempa = DoubleTF.getText();
        String tempb = DeltaDoubleTF.getText();
        double a = inputCheckDUB(tempa);
        double b = inputCheckDUB(tempb);
        if (b == 0) {
            DeltaDoubleTF.setText("Invalid Input.");
            System.out.println("Error Caught | Double Division | Divide By 0 Error");
        } else {
            double result = a / b;
            System.out.println("DOUBLE DIVISION");
            System.out.println(a + "/" + b);
            System.out.println(result);

            DoubleTF.setText("" + result);
            DeltaDoubleTF.setText("");
        }
    }//GEN-LAST:event_divDubBUTActionPerformed

    private void addIntBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addIntBUTActionPerformed
        String tempa = IntTF.getText();
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        int result = a + b;
        System.out.println("INTEGER ADDITION");
        System.out.println(a + "+" + b);
        System.out.println(result);

        IntTF.setText("" + result);
        DeltaIntTF.setText("");
    }//GEN-LAST:event_addIntBUTActionPerformed

    private void subIntBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subIntBUTActionPerformed
        String tempa = IntTF.getText();
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        int result = a - b;
        System.out.println("INTEGER SUBTRACTION");
        System.out.println(a + "-" + b);
        System.out.println(result);

        IntTF.setText("" + result);
        DeltaIntTF.setText("");
    }//GEN-LAST:event_subIntBUTActionPerformed

    private void modIntBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modIntBUTActionPerformed
        String tempa = IntTF.getText();
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        if (b == 0) {
            DeltaIntTF.setText("Invalid Input.");
            System.out.println("Error Caught | Integer Division | Divide By 0 Error");
        } else {
            int result = a % b;
            System.out.println("INTEGER MOD");
            System.out.println(a + "%" + b);
            System.out.println(result);

            IntTF.setText("" + result);
            DeltaIntTF.setText("");
        }
    }//GEN-LAST:event_modIntBUTActionPerformed

    private void intPwrBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intPwrBUTActionPerformed
        String tempa = IntTF.getText();
        String tempb = DeltaIntTF.getText();
        int a = inputCheckINT(tempa);
        int b = inputCheckINT(tempb);
        int result = (int) Math.pow(a, b);
        System.out.println("INTEGER POWER");
        System.out.println(a + "^" + b);
        System.out.println(result);

        IntTF.setText("" + result);
        DeltaIntTF.setText("");

    }//GEN-LAST:event_intPwrBUTActionPerformed

    private void addDubBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDubBUTActionPerformed
        String tempa = DoubleTF.getText();
        String tempb = DeltaDoubleTF.getText();
        double a = inputCheckDUB(tempa);
        double b = inputCheckDUB(tempb);
        double result = a + b;
        System.out.println(a + "+" + b);
        System.out.println("DOUBLE ADDITION");
        System.out.println(result);

        DoubleTF.setText("" + result);
        DeltaDoubleTF.setText("");
    }//GEN-LAST:event_addDubBUTActionPerformed

    private void subDubBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subDubBUTActionPerformed
        String tempa = DoubleTF.getText();
        String tempb = DeltaDoubleTF.getText();
        double a = inputCheckDUB(tempa);
        double b = inputCheckDUB(tempb);
        double result = a - b;
        System.out.println("DOUBLE SUBTRACTION");
        System.out.println(a + "-" + b);
        System.out.println(result);

        DoubleTF.setText("" + result);
        DeltaDoubleTF.setText("");
    }//GEN-LAST:event_subDubBUTActionPerformed

    private void dubPwrBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubPwrBUTActionPerformed
        String tempa = DoubleTF.getText();
        String tempb = DeltaDoubleTF.getText();
        double a = inputCheckDUB(tempa);
        double b = inputCheckDUB(tempb);
        double result = Math.pow(a, b);
        System.out.println("DOUBLE POWER");
        System.out.println(a + "^" + b);
        System.out.println(result);

        DoubleTF.setText("" + result);
        DeltaDoubleTF.setText("");
    }//GEN-LAST:event_dubPwrBUTActionPerformed

    private void clearBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBUTActionPerformed
        IntTF.setText("");
        DeltaIntTF.setText("");
        DoubleTF.setText("");
        DeltaDoubleTF.setText("");
        ansFIELD.setText("");
        System.out.println("All Cleared.");
    }//GEN-LAST:event_clearBUTActionPerformed

    private void dubClearBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dubClearBUTActionPerformed
        DoubleTF.setText("");
        DeltaDoubleTF.setText("");
        ansFIELD.setText("");
        System.out.println("Doubles Cleared.");
    }//GEN-LAST:event_dubClearBUTActionPerformed

    private void intClearBUT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_intClearBUT1ActionPerformed
        IntTF.setText("");
        DeltaIntTF.setText("");
        ansFIELD.setText("");
        System.out.println("Integers Cleared");
    }//GEN-LAST:event_intClearBUT1ActionPerformed
    public int inputCheckINT(String uInp) {                                     //Separating this out into its own method was a wonderful idea. 
        int rtn = 0;
        try {                                                                           //Try catch to handle non-integers and exit commands. 
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.out.println("That's a keyword! Pack it up, boys!");
                System.exit(0);
            } else {
                rtn = Integer.parseInt(uInp);
            }
        } catch (NumberFormatException ignore) {
            ansFIELD.setText("Invalid Input | Non-Integer");
        }
        return (rtn);                                                               //This bit of code is helpful now
    }

    public double inputCheckDUB(String uInp) {                                     //Separating this out into its own method was a wonderful idea. 
        double rtn = 0;
        try {                                                                           //Try catch to handle non-integers and exit commands. 
            if (uInp.equalsIgnoreCase("Exit") || uInp.equalsIgnoreCase("Quit")) {
                System.out.println("That's a keyword! Pack it up, boys!");
                System.exit(0);
            } else {
                rtn = Double.parseDouble(uInp);
            }
        } catch (NumberFormatException ignore) {
            ansFIELD.setText("Invalid Input | Non-Double");
        }
        return (rtn);                                                               //It made itself useful today
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        System.out.println("Console Here For No Real Reason. Just Felt Like It.");
        System.out.println("Loading Calculator.");
        for(int i = 0; i<10; i++){
            Thread.sleep(270);
            System.out.print("==");
        }
        System.out.println("");
        System.out.println("QC Pass.");
        System.out.println("Success!");
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasicJavaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicJavaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicJavaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicJavaCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicJavaCalc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DeltaDoubleTF;
    private javax.swing.JTextField DeltaIntTF;
    private javax.swing.JTextField DoubleTF;
    private javax.swing.JLabel HeaderLBL;
    private javax.swing.JTextField IntTF;
    private javax.swing.JButton addDubBUT;
    private javax.swing.JButton addIntBUT;
    private javax.swing.JLabel ansFIELD;
    private javax.swing.JButton clearBUT;
    private javax.swing.JButton divDubBUT;
    private javax.swing.JButton divIntBUT;
    private javax.swing.JLabel doubleDeltaLBL;
    private javax.swing.JLabel doubleLBL;
    private javax.swing.JButton dubClearBUT;
    private javax.swing.JButton dubPwrBUT;
    private javax.swing.JButton intClearBUT1;
    private javax.swing.JLabel intDeltaLBL;
    private javax.swing.JLabel intLBL;
    private javax.swing.JButton intPwrBUT;
    private javax.swing.JButton modIntBUT;
    private javax.swing.JButton multDubBUT;
    private javax.swing.JButton multIntBUT;
    private javax.swing.JButton subDubBUT;
    private javax.swing.JButton subIntBUT;
    // End of variables declaration//GEN-END:variables
}