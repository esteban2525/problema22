package entities;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private Long id;
    private String nombre;
    private String email;
    private String codigo;
    private List<Long> eventIds; // IDs de eventos en los que está inscrito
    public Student() {
        this.eventIds = new ArrayList<>();
    }
    public Student(Long id, String nombre, String email, String codigo) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.codigo = codigo;
        this.eventIds = new ArrayList<>();
    }
    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public List<Long> getEventIds() { return eventIds; }
    public void setEventIds(List<Long> eventIds) { this.eventIds = eventIds; }