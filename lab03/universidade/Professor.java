package universidade;

public class Professor {
    private int id;
    private String departamento;

    private static final String DEFAULT_DEPARTAMENTO = "nenhum";

    public Professor() {
        this.id = 0;
        this.departamento = DEFAULT_DEPARTAMENTO;
    }

    public Professor(int id, String departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    public void setId(int id) { this.id = id; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }

    public int getId() { return this.id; }
    public String getDepartamento() { return this.departamento; }
}