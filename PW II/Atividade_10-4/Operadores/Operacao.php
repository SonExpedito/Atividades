<html>
 <head>
   <meta charset="utf-8">
    <title>Operação</title>
 </head>
  <body>
       <?php
          $N1 = $_POST['N1'];
          $N2 = $_POST['N2'];
          $Cod = $_POST['Cod'];
          $Resu = 0;

           switch ($Cod){
             case 1: 
                $Resu = $N1 + $N2;
                echo "O Resultado da soma dos valores é " .$Resu;
                break;
             case 2:   
                $Resu = $N1 - $N2;
                echo "A Diferença dos valores é " .$Resu;
                break;
             case 3:   
                 $Resu = $N1 / $N2;
                 echo "O Resultado da Divisão dos valores é " .$Resu;
                 break;
             case 4:   
                 $Resu = $N1 * $N2;
                 echo "O Resultado da Multiplicação  é " .$Resu;
                 break;

             default:
                echo "O Código digitado não existe";
                break;    

           }


       ?>
  </body>

</html>