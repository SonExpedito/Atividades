<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resultado</title>
</head>
<body>
  <?php 
     $A = $_POST["txta"];    
     $B = $_POST["txtb"];  
     $soma = $A + $B; 
     $quadr = pow($soma,2);
     echo "A Soma dos Valores é " .$soma ."<br>";
     echo "O quadrado da soma é " .$quadr;
  ?>
</body>
</html>