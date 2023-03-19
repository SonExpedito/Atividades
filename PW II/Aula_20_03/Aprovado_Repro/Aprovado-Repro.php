<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resposta</title>
</head>
<body>
    <?php
        $Not1 = $_POST["not1"];
        $Not2 = $_POST["not2"];
        $Not3 = $_POST["not3"];
        $Not4 = $_POST["not4"];
        $Media = ($Not1+$Not2+$Not3+$Not4)/4;
        
       if ($Media <=10 && $Media>0) 
           if ($Media >= 5 ){
             echo "O Aluno tirou a nota " .$Media ." e foi Aprovado";
           }
           else{
            echo "O Aluno tirou a nota " .$Media ." e foi Reprovado";
           }
        else{
            echo "Alguma Nota não foi colocada corretamente, Menor que Zero ou Maior que Dez.";


        }
    ?>
</body>
</html>