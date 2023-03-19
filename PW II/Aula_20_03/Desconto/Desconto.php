<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Desconto</title>
</head>
<body>
    <?php
       $Valor = $_POST['Valor'];
       $Desc = $_POST['Desc'];
       $Final = $Valor-(($Desc*100)/$Valor);
       
       echo "O Valor final com Desconto é R$" .$Final;

     ?>
</body>
</html>