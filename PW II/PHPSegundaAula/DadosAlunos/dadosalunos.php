<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php 
        echo "Segue Abaixo as informações digitadas na página anterior". "<br>";
        echo "Nome digitado......:" .$_POST["txtname"] . '<br>';
        echo "Telefone.....:" .$_POST["txttelefone"] . '<br>';
        echo "Curso.....:" .$_POST["cbocursos"] . '<br>';
        echo "RG.....:" .$_POST["txtRG"] . '<br>';
        echo "Módulo.....:" .$_POST["txtmodulo"] . '<br>';
     ?>
</body>
</html>