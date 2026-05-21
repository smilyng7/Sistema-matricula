package utp.edu.pe.ProyectoDP.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "matriculas")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha")
    private String fecha;

    @Column(name = "anio_escolar")
    private int anioEscolar;

    @Column(name = "turno")
    private String turno;

    // Relación con estudiante
    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    // Relación con curso
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;


    // Método personalizado
    public void mostrarMatricula() {

        System.out.println("===== MATRÍCULA =====");

        System.out.println("Estudiante: "
                + estudiante.nombreCompleto());

        System.out.println("Curso: "
                + curso.getNombre());

    }
}