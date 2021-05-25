<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="plantillas/cabecera.jsp"/>
<jsp:include page="plantillas/menu.jsp"/>

<main class="container">
<h1>Listado Tanques</h1>
    <a href="tanque.html">Nuevo Tanque</a>
     
     <div class="row">
     <form method="post" action="tanque">
    
    <input type="text" name="nombre" placeholder="Nombre del tanque" class="form-control">
    <select>
   <c:forEach var="ti" items="${tipos}">
       					<option value="${ti.id}">${ti.nombre}</option>       				
       				</c:forEach>
    </select>
    
    <label class="mt-3">Historia del tanque:</label>	
       			<textarea name="historia" class="form-control mb-3"></textarea>
       			
       			<label class="mt-3">Tipo de Municion:</label>
       			<input type="checkbox" id="municion1" name="municion1" value="AP">
  <label for="municion1"> AP</label><br>
  <input type="checkbox" id="municion2" name="municion2" value="APCR">
  <label for="municion2"> APCR</label><br>
  <input type="checkbox" id="municion3" name="municion3" value="AE">
  <label for="municion3"> AE</label><br>
  <input type="checkbox" id="municion4" name="municion4" value="HEAT">
  <label for="municion4"> HEAT</label><br>
       			
       			<input type="submit" value="crear" class="btn btn-primary btn-block">
    </form>
    </div>
   <!-- .row -->  
   </main>
   <jsp:include page="plantillas/footer.jsp"/>  