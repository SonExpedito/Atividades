<html>
 <head>
   <meta charset="utf-8">
    <title>For-Quadrado</title>
 </head>
  <body>
       <?php
           $Resu = 0;
           $comeco = 1;

           for ($i=$comeco; $i<=10;$i++){
                $Resu = pow($i,2);
                echo  "O Quadrado de " .$i ." é " .$Resu ."<br>";
           }

       ?>
  </body>

</html>