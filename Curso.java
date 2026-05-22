package utp.edu.pe.ProyectoDP.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Curso {

    private Long id;
    private String nombre;
    private int horas;
    private String grado;
    private String nivel;
    private String area;

}