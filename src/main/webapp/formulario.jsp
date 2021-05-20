<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- css para bootstrap 5.0.0 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="stylesheet" href="../css/bootstrap-custom.css">
    <title>login</title>
</head>
<body>

    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
        <div class="container-fluid">
          <a class="navbar-brand" href="#">MI WEB</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
              <li class="nav-item">
                <a class="nav-link" aria-current="page" href="index.jsp">Login</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="participantes.jsp">Participantes</a>
              </li>
              <li class="nav-item">
                <a class="nav-link active" href="formulario.jsp">Formulario Alta</a>
              </li>
             
            </ul>
          </div>
        </div>
      </nav>


    <div class="container">
        <h1>Dar de Alta Nuevo Participantes</h1>
        <form action="#" class="w-50">

            <label for="nombre" class="form-label">Nombre:</label>
            <input type="text" 
                   name="nombre" 
                   required 
                   autofocus 
                   class="form-control" 
                   placeholder="Nombre sin apellidos">

            <label for="apellidos" class="form-label">Apellidos:</label>
            <input type="text" 
                    name="apellidos" 
                    required                      
                    class="form-control" 
                    placeholder="escribe los 2 apellidos">

                    
            <label for="email" class="form-label">Email:</label>
            <input type="email" 
                    name="email" 
                    required                      
                    class="form-control" 
                    placeholder="tu@correo.com">

            <input type="submit" value="Crear" class="btn btn-block btn-primary mt-4">
        </form>
        
    </div>   


    <footer class="bg-primary p-2">
        <p> footer de la web </p>
    </footer>

    <!-- javascript para bootstrap 5.0.0 -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-p34f1UUtsS3wqzfto5wAAmdvj+osOnFyQFpp4Ua3gs/ZVWx6oOypYoCJhGGScy+8" crossorigin="anonymous"></script>
    <br>
    <a href="index.html">Volver al menu</a>
</body>
</html>