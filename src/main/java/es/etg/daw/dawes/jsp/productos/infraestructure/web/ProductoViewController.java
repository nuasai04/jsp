package es.etg.daw.dawes.jsp.productos.infraestructure.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import es.etg.daw.dawes.jsp.productos.application.command.CreateProductoCommand;
import es.etg.daw.dawes.jsp.productos.application.service.CreateProductoService;
import es.etg.daw.dawes.jsp.productos.application.service.FindProductoService;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.constants.WebRoutes;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.enums.JspView;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.enums.ModelAttribute;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
//@RequestMapping(WebRoutes.PRODUCTOS_BASE)
public class ProductoViewController {
    
    private final FindProductoService findProductoService;
    private final CreateProductoService createProductoService;

    //Listado de Productos http://localhost:8082/web/productos
    @GetMapping(WebRoutes.PRODUCTOS_BASE)
    public String listar(Model model) {
        // Consulto todos los productos y los meto en un atributo del modelo para poder acceder a ellos en la JSP.
        model.addAttribute(ModelAttribute.PRODUCT_LIST.getName(), findProductoService.findAll());
        return JspView.PRODUCT_LIST.getPath(); // Busca productos-lista.jsp
    }

    // Carga la vista del formulario http://localhost:8082/web/productos/nuevo
    @GetMapping(WebRoutes.PRODUCTOS_NUEVO)
    public String formulario() {
        return JspView.PRODUCT_FORM.getPath(); //Devuelvo la vista que carga el formulario
    }

    // Este método crea el producto y devuelve la vista del mensaje de creado
    @PostMapping(WebRoutes.PRODUCTOS_NUEVO)
    public String crearProducto(@RequestParam String nombre,
            @RequestParam double precio,
            @RequestParam(defaultValue = "1") int categoria,
            Model model){
            
            createProductoService.createProducto(new CreateProductoCommand(nombre, precio));
        
        return JspView.PRODUCT_CREATED.getPath();
    }
}