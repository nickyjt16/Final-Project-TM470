<?php
include "db.php";

$site=$_POST['site'];
$notes=$_POST['notes'];
$name=$_POST['name'];
$event="out";


$sql = "INSERT INTO tbllogs (site, notes, officer, in_out)
VALUES ('$site', '$notes', '$name', '$event')";

$sql2 = "DELETE FROM tblsite 
WHERE siteName = '$site'
AND officerName = '$name'";


if ($con->query($sql) === TRUE) {
	$con->query($sql2) === TRUE;	
	echo "Success";
} else {
    echo "Error";
}

$con->close();
?>