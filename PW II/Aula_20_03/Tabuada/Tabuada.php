<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tabuada</title>
</head>
<body>
    <?php
       $Num = $_POST['Number'];
        for ($Cont = 0; $Cont <=10;$Cont++){
           $Resul = $Num * $Cont;
           echo $Num. " x " .$Cont ." = " .$Resul ."<br>";


        }

    ?>
</body>
</html>