<html>
    <head>
       <meta charset="utf-8">
       <title>Resultado</title>
    </head>
    <body>
       <?php 
            $valor = $_POST['valor'];

              if ($valor >= 100){
                echo "<p>Compra Maior ou Igual a Cem</p>";

              }
              else{
                echo "<php>A Compra é menor que Cem</php>";

              }


          ?>
 
    </body>
</html>