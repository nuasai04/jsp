<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="<c:url value='/css/estilos.css'/>">
    </head>
<body>
    <h1>LISTADO DE PRODUCTOS</h1>
    <div class="table-container">
        <table id="tablaProductos">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                </tr>
            </thead>
            <tbody id="cuerpoTabla">
                <!-- Leemos la lista de productos, y para cada elemento p
                    pintamos sus atributos -->
                <c:forEach var="p" items="${productos}">
                    <tr>
                        <td>${p.id}</td>
                        <td>${p.nombre}</td>
                        <td>${p.precio}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>