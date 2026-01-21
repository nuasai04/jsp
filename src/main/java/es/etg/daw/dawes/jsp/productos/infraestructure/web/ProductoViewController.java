package es.etg.daw.dawes.jsp.productos.infraestructure.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import es.etg.daw.dawes.jsp.productos.application.service.FindProductoService;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.constants.WebRoutes;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.enums.JspView;
import es.etg.daw.dawes.jsp.productos.infraestructure.web.enums.ModelAttribute;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping(WebRoutes.PRODUCTOS_BASE)
public class ProductoViewController {
    
    private final FindProductoService findProductoService;

    @GetMapping
    public String listar(Model model) {
        // Consulto todos los productos y los meto en un atributo del modelo para poder acceder a ellos en la JSP.
        model.addAttribute(ModelAttribute.PRODUCT_LIST.getName(), findProductoService.findAll());
        return JspView.PRODUCT_LIST.getPath(); // Busca productos-lista.jsp
    }
}