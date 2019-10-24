import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue May 28 15:16:41 BRT 2019
 */



/**
 * @author Kleber Fernando
 */
public class ConsultarMedico extends JFrame {
    public ConsultarMedico() {
        initComponents();
    }

    private void cancelarActionPerformed(ActionEvent e) {
        dispose();
    }

    private void consultarActionPerformed(ActionEvent e) {
        String text = consulta.getText();
        ClinicaMedica clinica = new ClinicaMedica();
        clinica.consultar(text);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kleber Fernando
        vSpacer1 = new JPanel(null);
        label1 = new JLabel();
        vSpacer4 = new JPanel(null);
        hSpacer1 = new JPanel(null);
        label2 = new JLabel();
        consulta = new JTextField();
        hSpacer2 = new JPanel(null);
        vSpacer3 = new JPanel(null);
        consultar = new JButton();
        cancelar = new JButton();
        hSpacer3 = new JPanel(null);
        vSpacer2 = new JPanel(null);

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        contentPane.add(vSpacer1, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label1 ----
        label1.setText("Consultar M\u00e9dico");
        contentPane.add(label1, new GridBagConstraints(2, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(vSpacer4, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer1, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Nome ou CRM:");
        contentPane.add(label2, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(consulta, new GridBagConstraints(2, 5, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer2, new GridBagConstraints(7, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(vSpacer3, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- consultar ----
        consultar.setText("Consultar");
        consultar.addActionListener(e -> consultarActionPerformed(e));
        contentPane.add(consultar, new GridBagConstraints(2, 7, 2, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cancelar ----
        cancelar.setText("Fechar");
        cancelar.addActionListener(e -> cancelarActionPerformed(e));
        contentPane.add(cancelar, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer3, new GridBagConstraints(7, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(vSpacer2, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kleber Fernando
    private JPanel vSpacer1;
    private JLabel label1;
    private JPanel vSpacer4;
    private JPanel hSpacer1;
    private JLabel label2;
    private JTextField consulta;
    private JPanel hSpacer2;
    private JPanel vSpacer3;
    private JButton consultar;
    private JButton cancelar;
    private JPanel hSpacer3;
    private JPanel vSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
