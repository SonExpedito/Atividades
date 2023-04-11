<html>
 <head>
   <meta charset="utf-8">
    <title>Do-Quadrado</title>
 </head>
  <body>
       <?php
          $Resu = 0;
          $i = 1;

          do{
              $Resu = pow($i,2);
              
              
              echo "O Quadrado de ".$i ." é " .$Resu ."<br>"; 
              $i++;
          }
          while($i<=10);

       ?>
  </body>

</html>