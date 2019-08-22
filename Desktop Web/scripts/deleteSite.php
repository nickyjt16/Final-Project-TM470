<?php
include "db.php";

$siteName=$_POST['siteName'];

$sql = "DELETE FROM tblsite
WHERE siteName='$siteName'";

if ($con->query($sql)) {	
	echo "Success";
} 	else {
    echo "Error";
} 

$con->close();
?>