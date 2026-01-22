package es.etg.daw.dawes.jsp.productos.application.usecase;

/**
 * 
 * @author Nuhaila Assaid Aabdenour 
 */

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CreateProductoUseCase {
    
    private ProductoRepository productoRepository;

    public Producto create( CreateProductoCommand comando){

        Producto producto = Producto.builder() // Se puede usar comando.id y no getId por usar @Accessors(fluent = true) la clase CreateProductoCommand 
                                    .nombre(comando.nombre())
                                    .precio(comando.precio()).build();

        
        return productoRepository.save(producto);

    }
}
