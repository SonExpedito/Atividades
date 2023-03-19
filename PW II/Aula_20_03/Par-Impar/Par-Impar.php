<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Par ou ímpar</title>
</head>
<body>
    <?php
        $num = $_POST["num"];
        
          if ($num%2 != 0){
               echo "O Número é Ímpar";

          }
          else{
             echo "O Número é Par";
          }

    ?>
</body>
</html>