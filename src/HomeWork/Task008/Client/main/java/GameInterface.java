package ru.kpfu.itis.Group11401.Astashev.Task008.Client.main.java; /**
 * Created by 1 on 09.12.2015.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by 1 on 21.11.2015.
 */
class GameInterface extends JFrame {


    private String info = "";

    public GameInterface() {
        initComponents();

    }

    private void initComponents() {

        jLabel1 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jSlider1 = new JSlider();
        jLabel6 = new JLabel();
        jTextField2 = new JTextField();
        jButton2 = new JButton();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jTextArea1 = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tick-Tock BUUUUUUMM");

        jLabel1.setText("You need imagin word with this syllable");

        jLabel2.setForeground(java.awt.Color.red);
        jLabel2.setText("syllable");

        jLabel3.setText("This syllable mast be in:");

        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("star,middle,ennd word");

        //jLabel5.setText("your scores:");
        jLabel11.setText("TIC - TOC");
        jLabel11.setVisible(true);

        jLabel6.setText("FASTER!!!");

        jTextField2.setForeground(java.awt.Color.gray);
        jTextField2.setText("");

        jButton2.setText("submit");

        jLabel7.setText("QUICKLY!!!");



      //  jLabel9.setText("scores");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Player1: ololo (correct)");
        jScrollPane1.setViewportView(jTextArea1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent e) {
                result = jTextField2.getText();
                submit = true;
            }
        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel11, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel8, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField2, GroupLayout.Alignment.LEADING)
                                                .addComponent(jSlider1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                        .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel9)))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(30, 30, 30)
                                                                .addComponent(jLabel7, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jLabel10, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel11, GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSlider1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        getAccessibleContext().setAccessibleName("1");

        pack();

    }// </editor-fold>

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // new GameInterface().setVisible(false);
            }
        });
    }


    // Variables declaration - do not modify
    private String result;
    private double time;
    private boolean submit = false;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JSlider jSlider1;
    private JTextArea jTextArea1;
    private JTextField jTextField2;

    public String setInfo(String[] info) {
      //  jLabel8.setIcon(new ImageIcon(this.getClass().getResource("boom.gif")));
       String[] mas = info[0].split(";");
        //System.out.println(info[0] + " - info 0");
        //System.out.println(info[1] + " - info 1");
        jLabel2.setText(mas[0]);
        if(info[1].equals("История ответов пока пуста")){
            jTextArea1.setText(info[1]);
        }else {
            toSplit(info[1]);
        }


        //    System.out.println(mas[1]);
        if (mas[1].equals(Integer.toString(0))) {
            jLabel4.setText("BEGIN word");
        }
        if (mas[1].equals(Integer.toString(1))) {
            jLabel4.setText("MIDDLE word");
        }
        if (mas[1].equals(Integer.toString(2))) {
            jLabel4.setText("END word");
        }
        time = Integer.parseInt(mas[2]);
        double time1 = time;
        this.setVisible(true);
        jSlider1.setValue(100);
        double res = 0;
        while (time1 > 0 && !submit) {
            try {
                Thread.sleep(6);
                time1 -= 0.005;
                res = (time1 / time) * 100;
                int results = (int) res;
                jSlider1.setValue(results);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (submit && time1 > 0 && !jTextField2.getText().equals("")) {

            result = jTextField2.getText();
            return result;
        }
        return null;
    }

    private void toSplit(String history) {
        String[] mas = history.split(";");
        String str = "";
        for (int i = 0; i < mas.length; i++) {
            str += mas[i] + "\n";
        }
        jTextArea1.setText(str);
    }


}