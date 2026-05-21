package utp.edu.pe.ProyectoDP.Domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cursos")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "horas")
    private int horas;

    @Column(name = "grado")
    private String grado;

    @Column(name = "nivel")
    private String nivel;

    @Column(name = "area")
    private String area;

    // Método personalizado
    public void mostrarCurso() {

        System.out.println("===== CURSO =====");

        System.out.println("ID: " + id);

        System.out.println("Nombre: " + nombre);

        System.out.println("Horas: " + horas);

        System.out.println("Grado: " + grado);

        System.out.println("Nivel: " + nivel);

        System.out.println("Área: " + area);
    }
    // Método personalizado
    public String descripcionCurso() {

        return nombre + " - " + grado + " - " + nivel;
    }

    // Método personalizado
    public boolean cursoActivo() {

        return horas > 0;
    }
}