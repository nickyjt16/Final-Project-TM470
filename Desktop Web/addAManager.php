<head>
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>

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
    <div>
        <h1>test</h1>
    </div>
</body>