<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="plantillas/cabecera.jsp"/>
<jsp:include page="plantillas/menu.jsp"/>

 <main class="container">
    <h1>Listado Participantes</h1>
    <a href="participantes-editar?id=0">Nuevo Participante</a>
    
    
    <table class="table table-striped table-hover">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Avatar</th>
            <th scope="col">Nombre</th>
            <th scope="col">Apellidos</th>
            <th scope="col">Email</th>
             <th scope="col">Editar</th>
            <th scope="col">Eliminar</th>
          </tr>
        </thead>
        <tbody>
        <!-- 
        	recorrer atributo con la lista de particpantes y pintar TR
        	items="$ { participantes}" => Nombre del atributo que nos envia en controlador
        	var="pIteracion"           => nombre de la variable que iteramos que es un Participante 
        
        	${p.nombre} es lo mismo que p.getNombre(), es una forma abreviada
        
        -->
        
	        <c:forEach var="pIteracion" items="${participantes}">
	          <tr>
	            <th scope="row">${pIteracion.id}</th>
	            <td><img src="${pIteracion.avatar}" alt="imagen avatar usuario" class="avatar"/></td>
	            <td>${pIteracion.nombre}</td>
	            <td>${pIteracion.apellidos}</td>
	            <td>${pIteracion.email}</td>
	          </tr>
	         </c:forEach> 
	         
        <!-- terminamos de recorrer -->
        </tbody>
      </table>
      
       <script>
      	
      	function confirmarEliminacion(nombre){
      		
      		if ( window.confirm("¿ Quieres Eliminar a " + nombre + " ?") ){
      			console.debug('eliminamos');
      		}else {
      			event.preventDefault(); // prevenir que el ancla haga su funcion
      			console.debug('No Eliminamos');
      		}
      		
      	}
      
      </script>
        
</main> 

<jsp:include page="plantillas/footer.jsp"/>
