<html>
 <head>
   <meta charset="utf-8">
    <title>Pares</title>
 </head>
  <body>
       <?php
           $Resu = 0;

           echo "Os Números pares entre 1 e 10 são: <br>"; 
           for ($i=2; $i<=10;$i=$i+2){
                echo $i ."° <br>";
                $Resu = $Resu + $i;
           }
           echo "E a Soma entre eles é de " .$Resu;
       ?>
  </body>

</html>