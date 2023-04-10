<html>
 <head>
   <meta charset="utf-8">
    <title>Positivo ou Negativo</title>
 </head>
  <body>
     <?php
       $Num = $_POST['num'];
         
       if ($Num>=0){
        echo "<span style='color:blue'>Número Positivo</span>";    
        
       }
       else{
        echo "<span style='color:red;'>Número Negativo </span>";    
 
       }

     ?>
  </body>

</html>