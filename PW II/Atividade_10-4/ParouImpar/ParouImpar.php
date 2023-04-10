<html>
 <head>
   <meta charset="utf-8">
    <title>Par Ou Impar</title>
 </head>
  <body>
       <?php
           $num = $_POST['num'];

           if ($num % 2 == 0 ){
               echo "O Número digitado é par";
           }
           else{
               echo "O Número digitado é ímpar";

           }
        ?>
  </body>

</html>