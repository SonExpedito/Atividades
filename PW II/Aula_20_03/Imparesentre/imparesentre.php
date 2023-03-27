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
         $Resu = 0;

        if ($N1==$N2){
             echo "Os Valores são iguais e não possuem valores ímpares entre eles.";
        }
        else{
             if($N1>$N2){
               
                  if($N2 %2 != 0){
                       for($Cont = $N2; $Cont<=$N1; $Cont=$Cont+2){
                            $Resu = $Resu+$Cont;
                       }
                         echo $Resu;
                  }
                  else{
                    for($Cont = $N2+1; $Cont<=$N1; $Cont=$Cont+2){
                         
                         $Resu = $Resu+$Cont;
                    }
                    echo $Resu;

                  }


             }
             else{
                   if($N1 %2 != 0){
                       for($Cont = $N1; $Cont<=$N2; $Cont=$Cont+2){
                         $Resu = $Resu+$Cont;
                         
                     }
                          echo $Resu;
                   }
                   else{
                       for($Cont = $N1+1; $Cont<=$N2; $Cont=$Cont+2){
                         $Resu = $Resu+$Cont;
                      
                   }      
                       echo $Resu;

                 }
 
        }
     }
      ?>
</body>
</html>