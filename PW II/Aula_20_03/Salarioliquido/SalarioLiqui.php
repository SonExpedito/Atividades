<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculado</title>
</head>
<body>
   <?php
       $Sal = $_POST["Salario"];
       $Bruto = $Sal - (($Sal*10)/100);
       
       echo "O Salário Líquido é de " .$Bruto;
   ?>
</body>
</html>