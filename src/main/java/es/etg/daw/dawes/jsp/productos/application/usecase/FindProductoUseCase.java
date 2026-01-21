package es.etg.daw.dawes.jsp.productos.application.usecase;

import java.util.List;

import org.springframework.stereotype.Service;

import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindProductoUseCase {
    
    private final ProductoRepository productoRepository;

    public List<Producto> findAll(){
        List<Producto> productos = productoRepository.getAll();

        return productos;
    }
}
