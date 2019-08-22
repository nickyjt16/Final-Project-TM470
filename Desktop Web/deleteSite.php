<head>

    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript"> //function to insert existing sites from db into dropdown list
        $(document).ready(function () {
            var url = "http://192.168.1.247/getSites.php"; //ip of local host over ethernet
            $.getJSON(url, function (result) {
                $("#siteDropDown").empty();
                $("#siteDropDown").append("<option value='base'>Please select a site to delete</option>");
                $.each(result, function (i, field) {
                    var siteName = field.siteName;
                    $("#siteDropDown").append("<option value='" + siteName + "'>" + siteName + "</option>");
                });
            });
        });
    </script>
<script>
$(document).ready(function() {
    $("#deleteSite").click(function(){
        if ($("#siteDropDown option:selected").val() != "Please select a site to delete") {   
            if (confirm('Are you sure you want to delete this site?')) {
                    var siteName = $("#siteDropDown option:selected").val();
                    var url = "http://192.168.1.247/deleteSite.php";
                    var dataString = "siteName=" + siteName;
                        $.ajax({
                            type: "POST",
                            url: url,
                            data: dataString,
                            crossDomain: true,
                            cache: false,
                            success: function (data) {
                                if (data === "Success")
                                {
                                    alert("The site has been deleted");
                                } else if (data === "Error")
                                {
                                    alert("error");
                                }
                            }
                        });
                    return false;

        } else {
            alert("The site HAS NOT been deleted");
        }
        } else {
           alert("Please select a site"); 
        }
    });
});
</script>
     <script type="text/javascript">
            $(document).ready(function(){
                 $("#home").click(function(){
                     $("#body").load("home.php");
                 });
            });
        </script>
    <script type="text/javascript">
            $(document).ready(function(){
                 $("#addManager").click(function(){
                     $("#body").load("addAManager.php");
                 });
            });
        </script>
    <script type="text/javascript">
            $(document).ready(function(){
                 $("#addOfficer").click(function(){
                     $("#body").load("addAnOfficer.php");
                 });
            });
        </script>
    <script type="text/javascript">
            $(document).ready(function(){
                 $("#editManager").click(function(){
                     $("#body").load("editAManager.php");
                 });
            });
        </script>
    <script type="text/javascript">
            $(document).ready(function(){
                 $("#editOfficer").click(function(){
                     $("#body").load("editAnOfficer.php");
                 });
            });
        </script>
    <script type="text/javascript">
            $(document).ready(function(){
                 $("#deleteSite").click(function(){
                     $("#body").load("deleteSite.php");
                 });
            });
        </script>
</head>
<body>
<select id="siteDropDown">
    <option value="base">Please select a site to delete</option>
    </select>
    <button id="deleteSite">Delete</button>
</body>