function showPopup()
{
    $(".topbar").css("filter", "blur(15px)");
    $(".content").css("filter", "blur(15px)");
    $(".popup").css("visibility", "visible");
    $(".popup").css("opacity", "1");
}

function hidePopup()
{
    $(".topbar").css("filter", "none");
    $(".content").css("filter", "none");
    $(".popup").css("visibility", "hidden");
    $(".popup").css("opacity", "0");
}
