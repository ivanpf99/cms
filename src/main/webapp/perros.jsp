<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="plantillas/cabecera.jsp"/>
<jsp:include page="plantillas/menu.jsp"/>

<main class="container">
    <h1>Listado Perros</h1>
    <a href="perro.html">Nuevo Perro</a>
     <div class="row">
    
    	<div class="col">
    
    <table class="table table-striped table-hover">
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">id</th>
            <th scope="col">Nombre</th>
            <th scope="col">Raza</th>
            <th scope="col">Historia</th>
            <th scope="col">Vacunas</th>
          </tr>
        </thead>
        <tbody>
        <!-- 
        	recorrer atributo con la lista de particpantes y pintar TR
        	items="$ { participantes}" => Nombre del atributo que nos envia en controlador
        	var="pIteracion"           => nombre de la variable que iteramos que es un Participante 
        
        	${p.nombre} es lo mismo que p.getNombre(), es una forma abreviada
        
        -->
        
        <c:forEach var="peIteracion" items="${perros}">
	          <tr>
	            <th scope="row">${peIteracion.id}</th>
	            <td>${peIteracion.id}</td>
	            <td>${peIteracion.nombre}</td>
	            <td>${p.raza.nombre}</td>
	            <td>${peIteracion.Historia}</td>
	            <td>${peIteracion.Vacunas}</td>
	          </tr>
	         </c:forEach> 
	         <!-- terminamos de recorrer -->
        </tbody>
      </table>
      
         </div>
	   <!-- 1º columna -->
	      
       <div class="col">
       
       		<form method="post" action="perros">
       		
       			<input type="text" name="nombre" placeholder="Nombre del perro" class="form-control">
       		
       		
       			<select name="idraza" class="form-select">
       				<c:forEach var="r" items="${razas}">
       					<option value="${r.id}">${r.nombre}</option>       				
       				</c:forEach>
       			</select>
       			
       			<label class="mt-3">Historia del perro:</label>	
       			<textarea class="form-control mb-3"></textarea>
       		
       			<input type="submit" value="crear" class="btn btn-primary btn-block">
       		
       		</form>
       
       </div>
       <!-- 2º columna -->     
            
   </div>
   <!-- .row -->   
      
</main> 

<jsp:include page="plantillas/footer.jsp"/>