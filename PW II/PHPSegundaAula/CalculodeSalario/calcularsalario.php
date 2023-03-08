<!DOCTYPE html>
<html lang="en">
 <head>
    <meta charset="UTF-8">
    <title>CalculodoSalario</title>
 </head>
 <body>
  <?php
      
      $horas = $_POST["txthoras"];  
      $valor = $_POST["txtvalor"];
      $salario = $valor * $horas;
     echo "De Acordo com as informações, digitadas na página anterior
     o salário é R$".$salario;
   ?>

 </body>
</html>