package es.etg.daw.dawes.jsp.productos.infraestructure.web.enums;

/**
 * Contiene el listado de plantillas JSPs
 */
public enum JspView {

    PRODUCT_LIST("productos-lista"),
    PRODUCT_FORM("productos-formulario"),
    PRODUCT_DETAIL("productos-detalle"),
    ERROR_GENERIC("error/error-general");

    private final String path;

    JspView(String path) {
        this.path = path;
    }

    public String getPath() {
        return this.path;
    } 
}