<html>
 <head>
   <meta charset="utf-8">
    <title>Empregos</title>
 </head>
  <body>
       <?php
          $Cargo = $_POST['num'];


          switch ($Cargo){
            case 1: echo "Secretária"; break;
            case 2: echo "Gerente"; break;
            case 3: echo "Operário"; break;
            case 4: echo "Analista"; break;
            case 5: echo "Faxineiro"; break;
            default: "Não existe um cargo para o valor digitado";
                 break;
          }


       ?>
  </body>

</html>