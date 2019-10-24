import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue May 28 15:22:39 BRT 2019
 */



/**
 * @author Kleber Fernando
 */
public class Menu extends JFrame {
    public Menu() {
        initComponents();
    }

    private void consultaActionPerformed(ActionEvent e) {
        ConsultarMedico consulta = new ConsultarMedico();
        consulta.setVisible(true);
    }

    private void cadastroActionPerformed(ActionEvent e) {
        CadastrarMedico cadastro = new CadastrarMedico();
        cadastro.setVisible(true);
    }

    private void sairActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kleber Fernando
        vSpacer1 = new JPanel(null);
        label1 = new JLabel();
        vSpacer5 = new JPanel(null);
        hSpacer1 = new JPanel(null);
        consulta = new JButton();
        hSpacer2 = new JPanel(null);
        vSpacer4 = new JPanel(null);
        cadastro = new JButton();
        vSpacer3 = new JPanel(null);
        sair = new JButton();
        vSpacer2 = new JPanel(null);

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        contentPane.add(vSpacer1, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label1 ----
        label1.setText("Escolha a a\u00e7\u00e3o desejada");
        contentPane.add(label1, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(vSpacer5, new GridBagConstraints(3, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer1, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- consulta ----
        consulta.setText("Consultar M\u00e9dico");
        consulta.addActionListener(e -> consultaActionPerformed(e));
        contentPane.add(consulta, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer2, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(vSpacer4, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cadastro ----
        cadastro.setText("Cadastrar M\u00e9dico");
        cadastro.addActionListener(e -> cadastroActionPerformed(e));
        contentPane.add(cadastro, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(vSpacer3, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- sair ----
        sair.setText("Sair");
        sair.addActionListener(e -> sairActionPerformed(e));
        contentPane.add(sair, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(vSpacer2, new GridBagConstraints(3, 8, 1, 2, 0.0, 0.0,
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
    private JPanel vSpacer5;
    private JPanel hSpacer1;
    private JButton consulta;
    private JPanel hSpacer2;
    private JPanel vSpacer4;
    private JButton cadastro;
    private JPanel vSpacer3;
    private JButton sair;
    private JPanel vSpacer2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
