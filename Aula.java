package utp.edu.pe.ProyectoDP.Domain;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "aulas")

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "capacidad")
    private int capacidad;

    @Column(name = "pabellon")
    private String pabellon;

    // Método personalizado
    public void mostrarAula() {

        System.out.println("===== AULA =====");

        System.out.println("Número: " + numero);

        System.out.println("Capacidad: "
                + capacidad);

        System.out.println("Pabellón: "
                + pabellon);
    }
}