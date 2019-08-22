<?php
include "db.php";
$data=array();
$q=mysqli_query($con,"select name from `tblofficers` ORDER BY name ASC");
while ($row=mysqli_fetch_object($q)){
 $data[]=$row;
}
echo json_encode($data);
?>
