<html>
  <head>
    <meta charset="utf-8">
    <title>FOR</title>
  </head>
  <body>
   <?php
      $num = $_POST["forzin"];

      for ( $i = 0 ; $i <=10;$i++){
         $tab = $num * $i;
         echo $num ." X " .$i ." = " .$tab ."<br>";

      }


    ?>

  </body> 
</html>