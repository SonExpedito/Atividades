<html>
 <head>
   <meta charset="utf-8">
    <title></title>
 </head>
  <body>
      <?php
          $N1 = $_POST['N1'];
          $N2 = $_POST['N2'];
          $MD = ($N1+$N2)/2;
          
          if ($MD>=8){
            echo "O Aluno Foi aprovado";
          }
          else{
              if($MD>3){
                echo "O Aluno está de recuperação";

              }
              else{
                 echo "O Aluno foi Reprovado";

              }

          }


      ?>
  </body>

</html>