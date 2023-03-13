<html>
 <head>
    <meta charset="utf-8">
    <title>Soma</title>
 </head>
   

  <?php    
      $A = $_POST['A'];
      $B = $_POST['B'];
      $Soma = $A + $B;
      echo "A soma dos Valores é " .$Soma ."<br>";
      if($Soma>=10){
       echo "Sendo essa Resultado Maior ou Igual a Dez";

      } 
    else{
        if ($Soma<5) {
          echo "Sendo essa Soma menor que 5";

        }
        else{
          echo "Sendo essa Soma ficando entre 5 e 10";

        }

    }

   ?>

</html>