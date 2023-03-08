<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Acao-Exemplo1</title>
</head>
<body>
    <?php
        $Vnome= $_POST["name"]; //Resgatando a variável "Nome" do Html
        $Vidade= $_POST["idade"]; //Resgatando a variável "Idade" e transformando na variável "$Vidade"

        echo "Oi !!"  . $Vnome . "." . "<br>"  . "Você tem " . $Vidade . "anos !!"; 
        // Mostrando na tela Strings concatenadas com variáveis e com comandos HTML
    ?>
</body>
</html>