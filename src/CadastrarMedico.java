import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Mon May 27 21:49:53 BRT 2019
 */



/**
 * @author Kleber Fernando
 */
public class CadastrarMedico extends JFrame {
    public CadastrarMedico() {
        initComponents();
    }

    private void cancelarActionPerformed(ActionEvent e) {
        dispose();
    }

    private void salvarActionPerformed(ActionEvent e) {
        Integer crm = null;
        Double salario = null;
        if (isNumeric(crmInput.getText())) {
            crm = Integer.parseInt(crmInput.getText());
        } else  {
            JOptionPane.showMessageDialog(null, "O Campo CRM precisa conter apenas números!");
        }

        if (isNumeric(salarioInput.getText())) {
            salario = Double.parseDouble(salarioInput.getText());
        } else {
            JOptionPane.showMessageDialog(null, "O Campo Salário precisa conter apenas números!");
        }

        if (isNumeric(crmInput.getText()) && isNumeric(salarioInput.getText())) {
            ClinicaMedica clinica = new ClinicaMedica();
            String nome = nomeInput.getText();
            String espec = especInput.getText();
            clinica.inserir(nome, crm, espec, salario);
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Kleber Fernando
        vSpacer1 = new JPanel(null);
        vSpacer3 = new JPanel(null);
        label1 = new JLabel();
        label2 = new JLabel();
        nomeInput = new JTextField();
        label3 = new JLabel();
        crmInput = new JTextField();
        label4 = new JLabel();
        salarioInput = new JTextField();
        hSpacer1 = new JPanel(null);
        label5 = new JLabel();
        especInput = new JTextField();
        hSpacer2 = new JPanel(null);
        vSpacer2 = new JPanel(null);
        salvar = new JButton();
        cancelar = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new GridBagLayout());
        ((GridBagLayout)contentPane.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ((GridBagLayout)contentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        ((GridBagLayout)contentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
        contentPane.add(vSpacer1, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(vSpacer3, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label1 ----
        label1.setText("Cadastrar M\u00e9dico");
        contentPane.add(label1, new GridBagConstraints(4, 2, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label2 ----
        label2.setText("Nome:");
        contentPane.add(label2, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(nomeInput, new GridBagConstraints(3, 4, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label3 ----
        label3.setText("CRM:");
        contentPane.add(label3, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- crmInput ----
        crmInput.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
        contentPane.add(crmInput, new GridBagConstraints(3, 6, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label4 ----
        label4.setText("Sal\u00e1rio:");
        contentPane.add(label4, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(salarioInput, new GridBagConstraints(3, 8, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer1, new GridBagConstraints(0, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- label5 ----
        label5.setText("Especialidade:");
        contentPane.add(label5, new GridBagConstraints(2, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(especInput, new GridBagConstraints(3, 10, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        contentPane.add(hSpacer2, new GridBagConstraints(9, 10, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 0), 0, 0));
        contentPane.add(vSpacer2, new GridBagConstraints(2, 11, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- salvar ----
        salvar.setText("Salvar");
        salvar.addActionListener(e -> salvarActionPerformed(e));
        contentPane.add(salvar, new GridBagConstraints(3, 12, 3, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));

        //---- cancelar ----
        cancelar.setText("Cancelar");
        cancelar.addActionListener(e -> cancelarActionPerformed(e));
        contentPane.add(cancelar, new GridBagConstraints(4, 13, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 5, 5), 0, 0));
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kleber Fernando
    private JPanel vSpacer1;
    private JPanel vSpacer3;
    private JLabel label1;
    private JLabel label2;
    private JTextField nomeInput;
    private JLabel label3;
    private JTextField crmInput;
    private JLabel label4;
    private JTextField salarioInput;
    private JPanel hSpacer1;
    private JLabel label5;
    private JTextField especInput;
    private JPanel hSpacer2;
    private JPanel vSpacer2;
    private JButton salvar;
    private JButton cancelar;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
