<?php
include "db.php";

$site=$_POST['site'];
$notes=$_POST['notes'];
$name=$_POST['name'];
$action=$_POST['action'];
$event="in";


$sql = "INSERT INTO tbllogs (site, notes, officer, in_out)
VALUES ('$site', '$notes', '$name', '$event')";

$sql2 = "INSERT INTO tblsite (siteName, officerName)
VALUES ('$site', '$name')";

if ($action === "new"){
	$con->query($sql2);
}

if ($con->query($sql) === TRUE) {
	echo "Success";
} else {
    echo "Error";
}

$con->close();
?>