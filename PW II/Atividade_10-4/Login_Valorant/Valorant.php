<html>
 <head>
   <meta charset="utf-8">
    <title>Valorant</title>
 </head>
  <body>
     <?php 
        $name = $_POST['nome'];
        $senha = $_POST['senha'];


        if ($name == "ETE" && $senha = "ETE"){
              echo "Bem Vindo ao Valorant";
        }
        else{
            echo "A senha ou o usuário estão incorretos";

        }

     ?>
  </body>

</html>