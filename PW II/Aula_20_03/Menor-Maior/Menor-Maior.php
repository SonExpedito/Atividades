<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Menor e Maior</title>
</head>
<body>
    <?php
        $N1 = $_POST['N1'];
        $N2 = $_POST['N2'];
        $N3 = $_POST['N3'];

        if ($N1 > $N2){
            if ($N1>$N3){
                  if($N2>$N3){
                    echo "O Maior valor é o " .$N1 ." e o Menor é o " .$N3;

                  }
                  else {
                    echo "O Maior valor é o " .$N1 ." e o Menor é o " .$N2;
                  }
            }
            else{
                echo "O Maior valor é o " .$N3 ." e o Menor é o " .$N2;
            }
      

        }
        else{
            if ($N2>$N3){
                if($N1>$N3){
                  echo "O Maior valor é o " .$N2 ." e o Menor é o " .$N3;

                }
                else {
                  echo "O Maior valor é o " .$N2 ." e o Menor é o " .$N1;
                }
          }
          else{
              echo "O Maior valor é o " .$N3 ." e o Menor é o " .$N1;
          }


        }
 
     ?>
</body>
</html>