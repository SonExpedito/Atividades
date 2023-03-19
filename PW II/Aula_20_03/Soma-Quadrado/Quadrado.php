<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
</head>
<body>
    <?php
         $Num1 = $_POST["A"];
         $Num2 = $_POST["B"];
         $Num3 = $_POST["C"];
         $Resul = ($Num1*$Num1)+ ($Num2*$Num2) + ($Num3*$Num3);
        
         echo "A Soma de todos os valores inseridos ao Quadrado é de " .$Resul;

     ?>
</body>
</html>