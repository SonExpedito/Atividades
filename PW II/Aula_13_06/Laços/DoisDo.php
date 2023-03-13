<html>
    <head>
       <title>Página que calcula a tabuada do dois</title>
    </head>
    <body>
      <?php 
        $i = 0;
        do{
         $tab = 2 * $i;
         echo '2' . 'x' .$i . " = " .$tab .'<br />';
         $i++;
         }while($i <= 10);?>
    </body>
</html>