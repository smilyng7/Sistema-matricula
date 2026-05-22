package utp.edu.pe.ProyectoDP.Entity;
import jakarta.persistence.*;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Docente {

    private int idDocente;
    private String nombres;
    private String apellidos;
    private String especialidad;
    private String correo;

}
