<html>
  <head>
    <meta charset="utf-8">
    <title>Tabuada</title>
  </head>
  <body>
   <?php
      $i = 0; //Numerador
      $num = $_POST["num"];
      while ($i<=10){
        $tab = $num* $i;
        echo $num ." x " .$i ." = " .$tab ."<br>";
        $i++;

      }

    ?>

  </body> 
</html>