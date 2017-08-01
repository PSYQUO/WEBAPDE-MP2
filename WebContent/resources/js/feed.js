$(document).ready
(
    function()
    {    	
        loadPhotos();

        $("#user-button").click
        (
            function()
            {
                if($("#menu-user").css("display") == "none")
                    $("#menu-user").css("display", "flex");
                else
                    $("#menu-user").css("display", "none");
            }
        );

        $("#edit-upload-button").click
        (
            function()
            {
                $("#popup-upload").css("display", "none");
                $("#popup-confirm").css("display", "flex");
                setTimeout
                (
                	function() 
                	{
                		$("#popup-confirm").css("display", "none");
                		hidePopup();
                	}, 
                	1000
                );
            }
        );

        $("#upload-button").click
        (
            function()
            {
                console.log("clicked");
                $("input[name=upload]").click();
            }
        );

        $("input[name=upload]").change
        (
            function()
            {
                $("#popup-upload").css("display", "flex");
                showPopup();
            }
        );

        $("#edit-close").click
        (
            function()
            {
                hidePopup();
                $("#popup-upload").css("display", "none");
            }
        );
    }
);