<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Média Calculada</title>
</head>
<body>
    <?php
        $N1 = $_POST['N1'];
        $N2 = $_POST['N2'];
        $N3 = $_POST['N3'];
        $N4 = $_POST['N4'];
        $Media = ($N1+$N2+$N3+$N4)/4;    
         
        if ($Media>=6){
            echo "O Aluno tirou " .$Media ." e foi Aprovado";

        }
        else{
              if ($Media>=3){
                echo "O Aluno tirou " .$Media ." e terá que fazer Exame";

              }

              else{
                echo "O Aluno tirou " .$Media ." e foi Reprovado";
              }

        }
     ?>
</body>
</html>