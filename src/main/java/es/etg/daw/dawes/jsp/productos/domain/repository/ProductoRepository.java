package es.etg.daw.dawes.jsp.productos.domain.repository;

import es.etg.daw.dawes.jsp.common.domain.repository.CRUDRepository;
import es.etg.daw.dawes.jsp.productos.domain.model.Producto;
import es.etg.daw.dawes.jsp.productos.domain.model.ProductoId;

public interface  ProductoRepository extends CRUDRepository<Producto, ProductoId>{
    
}