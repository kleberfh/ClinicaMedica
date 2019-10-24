
import javax.swing.*;
import java.sql.*;


public class ClinicaMedica {

    static final String bancodedados = "jdbc:mysql://localhost:3306/clinica";
    Connection conexao = null;
    Statement consulta = null;
    ResultSet resultados = null;
    PreparedStatement minhaConsulta = null;
    PreparedStatement insersao = null;

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.setVisible(true);
    }

    public void consultar (String text) {
        try
        {
            conexao = DriverManager.getConnection(bancodedados, "root", "root");
            minhaConsulta = conexao.prepareStatement("SELECT * FROM medico WHERE Nome LIKE '%" + text + "%' OR CRM LIKE '%" + text + "%'");

            System.out.println(minhaConsulta);

            resultados = minhaConsulta.executeQuery();

            while (resultados.next()) {
                JOptionPane.showMessageDialog(null, "" +
                        "\n Nome do médico: " + resultados.getString("Nome") +
                        "\n CRM: " + resultados.getString("CRM") +
                        "\n Especialidade: " + resultados.getString("Especialidade") +
                        "\n Salario: " + resultados.getString("Salario"));
            }
        }

        catch (SQLException erro)
        {
            erro.printStackTrace();
        }

        finally
        {

            try {
                resultados.close();
                minhaConsulta.close();
                conexao.close();
            }
            catch (Exception error) {
                error.getStackTrace();
            }
        }
    }

    public void inserir (String nome, Integer crm, String espec, Double salario) {
        try
        {
            conexao = DriverManager.getConnection(bancodedados, "root", "root");
            String query = " insert into medico (Nome, CRM, Especialidade, Salario)"
                    + " values (?, ?, ?, ?)";
            insersao = conexao.prepareStatement(query);

            insersao.setString (1, nome);
            insersao.setInt (2, crm);
            insersao.setString   (3, espec);
            insersao.setDouble(4, salario);

            insersao.execute();

            JOptionPane.showMessageDialog(null, "Médico inserido com sucesso!");

        }

        catch (SQLException erro)
        {
            System.err.println("Erro ao inserir dados");
            System.err.println(erro.getMessage());
        };
    }

}
