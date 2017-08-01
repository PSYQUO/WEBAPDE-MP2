
$(document).ready
(
    function()
    {   
        loadPhotos();

        $("#account-button").click
        (
            function()
            {
                $("#popup-account").css("display", "block");
                showPopup();
            }
        );

        $("#account-toregister").click
        (
            function()
            {   
                $("#account-loginform").css("display", "none");
                $("#account-registerform").css("display", "inline");
            }
        );

        $("#account-tologin").click
        (
            function()
            {   
                $("#account-registerform").css("display", "none");
                $("#account-loginform").css("display", "inline");
            }
        );

        $("#account-close").click
        (
            function()
            {
                hidePopup();
                $("#popup-account").css("display", "none");
            }
        );

        $("#account-login").click
        (
            function()
            {
                console.log("owo");
                var loginError = $("<div></div>").append("Username/Password is incorrect.").attr("id", "account-error");

                $("#account-loginform").append(loginError);
            }
        );

        $("#account-register").click
        (
            function()
            {
                console.log("quit w");
                var loginError = $("<div></div>").append("\"" + $("#account-registerform input[name='username']").val() + "\" is already taken.").attr("id", "account-error");

                $("#account-registerform").append(loginError);
            }
        );
    }
);