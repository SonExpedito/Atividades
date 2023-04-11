<html>
 <head>
   <meta charset="utf-8">
    <title>IMC - Pesoideal</title>
 </head>
  <body>
      <?php
        $Peso = $_POST['peso'];
        $Altura = $_POST['altura'];
        $Sexo = $_POST['Sexo'];
        $Ideal =0;
        if ($Sexo == "Masculino"){
             $Ideal = (pow($Altura,2))*23;

             if ($Peso>$Ideal){
               echo "<span style = 'color:red;'> Você está acima do Seu Peso Ideal (" .$Ideal .")</span>";

             }
             else{
                   if ($Peso<$Ideal){
                    echo "<span style = 'color:yellow;'> Você está abaixo do Seu Peso Ideal (" .$Ideal .")</span>";

                   }
                   else{
                    echo "<span style = 'color:blue;'> Você está em seu Peso Ideal(" .$Ideal .")</span>";

                   }

             }


        }

        else {
          if ($Sexo == "Feminino"){
            $Ideal = (pow($Altura,2))*22;
             
            if ($Peso>$Ideal){
                echo "<span style = 'color:red;'> Você está acima do Seu Peso Ideal (" .$Ideal .")</span>";
 
              }
            else{
                    if ($Peso<$Ideal){
                     echo "<span style = 'color:yellow;'> Você está abaixo do Seu Peso Ideal (" .$Ideal .")</span>";
 
                    }
                    else{
                     echo "<span style = 'color:blue;'> Você está em seu Peso Ideal(" .$Ideal .")</span>";
 
                    }
 
              }
            }
            else{
                echo "O Sexo não foi informado";

            }

        }

      ?>
  </body>

</html>