<html>
 <head>
   <meta charset="utf-8">
    <title>Empregos</title>
 </head>
  <body>
       <?php
          $Cargo = $_POST['num'];


          switch ($Cargo){
            case 1: echo "Secretária";
            case 2: echo "Gerente";
            case 3: echo "Operário";
            case 4: echo "Analista";
            case 5: echo "Faxineiro";
            default: "Não existe um cargo para o valor digitado";

          }


       ?>
  </body>

</html>