<html>
 <head>
   <meta charset="utf-8">
    <title>Do-Soma</title>
 </head>
  <body>
       <?php
           $Resu = 0;
           $i = 3;

        do {
            $Resu = $Resu + $i;
            $i++;

        }
         while ($i <= 8);

         echo "O Resultado da soma dos números entre 3 e 8 é de " .$Resu;

       ?>
  </body>

</html>