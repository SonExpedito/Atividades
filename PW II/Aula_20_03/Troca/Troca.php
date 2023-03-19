<!DOCTYPE html>
<html lang="en">
<head>
    <title>Troca</title>
</head>
<body>
     <?php
       $A = $_POST["A"];
       $B = $_POST["B"];
       echo "Os Valores antes da Troca <br>
       A: " .$A 
       ."<br> B: " .$B ."<br>";
         $C = $A;
         $A = $B;
         $B = $C;
       echo "Os Valores depois da Troca <br>
        A: " .$A 
        ."<br> B: " .$B;
     
     ?>

</body>
</html>