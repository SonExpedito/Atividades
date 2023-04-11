<html>
 <head>
   <meta charset="utf-8">
    <title>Do-Divisiveis</title>
 </head>
  <body>
       <?php
          $i = 4;
           
          echo "Os Números divisíveis por Quatro e menores que Vinte são: <br>";
          do{
              echo $i ."<br>";
              $i = $i+4;
          }
          while($i<20);

       ?>
  </body>

</html>