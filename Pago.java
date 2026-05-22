package utp.edu.pe.ProyectoDP.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Pago {

    private String codigoPago;
    private double monto;
    private String fechaPago;
    private String estadoPago;
}
