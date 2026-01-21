package es.etg.daw.dawes.jsp.productos.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producto {
    private ProductoId id;
    private String nombre;
    private Double precio;

}
