package utp.edu.pe.ProyectoDP.Domain;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "docentes")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "apellidos")
    private String apellidos;

    @Column(name = "especialidad")
    private String especialidad;

    @Column(name = "correo")
    private String correo;

    // Método personalizado
    public String nombreCompleto() {

        return nombres + " " + apellidos;
    }

    // Método personalizado
    public void mostrarDocente() {

        System.out.println("===== DOCENTE =====");

        System.out.println("Nombre: "
                + nombreCompleto());

        System.out.println("Especialidad: "
                + especialidad);

        System.out.println("Correo: "
                + correo);
    }
}