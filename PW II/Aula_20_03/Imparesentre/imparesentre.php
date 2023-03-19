<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>ímpares-Entre</title>
</head>
<body>
     <?php
         $N1 = $_POST['N1'];
         $N2 = $_POST['N2'];
         

         if ($N1>$N2){
             if ($N2 %2 != 0){
                  for ($Cont = $N2+2; $Cont =$N1; +2){
                       echo $Cont . "<br>";
                  }
             }
             else{
                for ($Cont = $N2+1; $Cont =$N1; +2){
                    echo $Cont . "<br>";
               }
             }

         }
         else{
            if ($N1 %2 != 0){
                for ($Cont = $N1+2; $Cont =$N2; +2){
                     echo $Cont . "<br>";

                }
           }
           else{
              for ($Cont = $N1+1; $Cont =$N2; +2){
                  echo $Cont . "<br>";

             }
           }


         }
      ?>
</body>
</html>