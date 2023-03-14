<html>
    <head>
        <title>Maior que Dez </title>
    </head>
    <body>
        <br>
        <?php 
         $A = $_POST['A'];  
         $B = $_POST['B']; 
          $soma= $A + $B;
          echo "A soma dos valores é ".$soma .'<br>';  
          if ($soma>10) {    echo "Soma maior que dez ";}
          ?>
    </body>
</html> 