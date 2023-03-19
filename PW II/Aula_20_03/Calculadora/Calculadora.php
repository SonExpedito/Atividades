<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculadora</title>
</head>
<body>
    <?php
        $Num1 = $_POST["N1"]; //Valores
        $Num2 = $_POST["N2"];
        $OPE = $_POST["Ope"]; //Operador
        
       
        switch ($OPE){
          case '+':
            $Resu = $Num1 + $Num2;
            echo $Num1 ." + " .$Num2 ." = " .$Resu;
            break;
          
          case '-':
            $Resu = $Num1 - $Num2;
            echo $Num1 ." - " .$Num2 ." = " .$Resu;
            break; 
          
          case '*':
            $Resu = $Num1 * $Num2;
            echo $Num1 ." X " .$Num2 ." = " .$Resu;
            break; 
                
          case '/':
            $Resu = $Num1 / $Num2;
            echo $Num1 ." ÷ " .$Num2 ." = " .$Resu;
            break;       
          

        }
    ?>
</body>
</html>