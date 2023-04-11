<html>
 <head>
   <meta charset="utf-8">
    <title>Quadrado</title>
 </head>
  <body>
       <?php
           $Resu = 0;

           for ($i=5; $i<=10;$i=$i+1){
                $Resu = pow($i,2);
                echo "O Quadrado de " .$i ." é " .$Resu ."<br>";

           }
       ?>
  </body>

</html>