<?php
include "db.php";
$data=array();
$q=mysqli_query($con,"select siteName from `tblsite` ORDER BY siteName ASC");
while ($row=mysqli_fetch_object($q)){
 $data[]=$row;
}
echo json_encode($data);
?>
