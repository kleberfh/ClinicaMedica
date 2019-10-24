public class Medico {
    private String crm;
    private String nome;
    private String espec;
    private String salario;

    public Medico (String crm, String nome, String espec, String salario) {
        this.crm = crm;
        this.espec = espec;
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSalario() {
        return salario;
    }

    public String getCrm() {
        return crm;
    }

    public String getEspec() {
        return espec;
    }
}
