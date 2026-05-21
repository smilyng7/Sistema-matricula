package utp.edu.pe.ProyectoDP.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "estudiantes")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "dni")
    private String dni;

    // MÉTODOS PERSONALIZADOS
    public String nombreCompleto() {
        return nombres + " " + apellidos;
    }

}
