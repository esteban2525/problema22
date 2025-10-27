package entities;

import java.util.ArrayList;
import java.util.List;
public class Event {
    private Long id;
    private String nombre;
    private String fecha;
    private int duracion; // en horas
    private String modalidad; // "presencial" o "virtual"
    private List<Long> studentIds; // IDs de estudiantes inscritos
    public Event() {
        this.studentIds = new ArrayList<>();
    }
    public Event(Long id, String nombre, String fecha, int duracion, String modalidad) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.duracion = duracion;
        this.modalidad = modalidad;
        this.studentIds = new ArrayList<>();
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
public String getNombre() { return nombre; }
public void setNombre(String nombre) { this.nombre = nombre; }
public String getFecha() { return fecha; }
public void setFecha(String fecha) { this.fecha = fecha; }
public int getDuracion() { return duracion; }
public void setDuracion(int duracion) { this.duracion = duracion; }
public String getModalidad() { return modalidad; }
public void setModalidad(String modalidad) { this.modalidad = modalidad; }
public List<Long> getStudentIds() { return studentIds; }
public void setStudentIds(List<Long> studentIds) { this.studentIds =studentIds; }