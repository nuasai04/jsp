<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<body>
    <h2>LISTADO DE PRODUCTOS</h2>
    <table>

        <!-- Leemos la lista de productos, y para cada elemento p
            pintamos sus atributos -->
        <c:forEach var="p" items="${productos}">
            <tr>
                <td>${p.id}</td>
                <td>${p.nombre}</td>
                <td>${p.precio}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>