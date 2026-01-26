<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>Nuevo Producto</title>
        <link rel="stylesheet" type="text/css" href="<c:url value='/css/estilos.css'/>">
    </head>

    <body>

        <h1>CREAR PRODUCTO</h1>
        <div class="table-container">
            <form action="/web/productos/nuevo" method="POST">
                <div>
                    <label>Nombre:</label>
                    <input type="text" name="nombre" required>
                </div>
                <br>
                <div>
                    <label>Precio:</label>
                    <input type="number" step="0.01" name="precio" required>
                </div>

                <input type="hidden" name="categoria" value="1">
                <br>
                <button type="submit">Guardar Producto</button>
            </form>
        </div>

    </body>

    </html>