<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
   <div class="container-fluid">
     <a class="navbar-brand" href="#">MI WEB</a>
     <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
       <span class="navbar-toggler-icon"></span>
     </button>
     <div class="collapse navbar-collapse" id="navbarNavDropdown">
       <ul class="navbar-nav">
         <li class="nav-item">
           <a class="nav-link ${ (param.page eq 'login') ? 'active' : '' }" 
              href="index.jsp?page=login">Login</a>
         </li>
         <li class="nav-item">
           <a class="nav-link ${ (param.page eq 'participantes') ? 'active' : '' }" 
              href="participantes">Participantes</a>
         </li>
         <li class="nav-item">
           <a class="nav-link ${ (param.page eq 'formulario') ? 'active' : '' }" 
              href="formulario.jsp?page=formulario">Formulario Alta</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" 
              href="calculadora.jsp">Calculadora</a>
         </li>
          <li class="nav-item">
           <a class="nav-link" 
              href="usuario">Usuarios</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" 
              href="perro">Perros</a>
         </li>
         <li class="nav-item">
           <a class="nav-link" 
              href="tanque">Tanques</a>
         </li>
       </ul>
     </div>
   </div>
</nav>

<%
	// podemos hacer lo mismo con un Scriplet
	String mensaje = (String)request.getAttribute("mensaje");
	if ( mensaje != null ){
		
		%>
		
			<div class="alert alert-danger alert-dismissible fade show" role="alert">
			  <%=mensaje%>
			  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
			</div>
		
		
		<%
	}// fin del if
	
//fin del scriplet
%>
 
 <c:if test="${mensaje != null}" >
	<div class="alert alert-danger alert-dismissible fade show" role="alert">
	  ${mensaje}
	  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
	</div>
</c:if>	