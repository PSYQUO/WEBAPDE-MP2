var localPhotos = [];

function loadPhotos()
{
    $.post("PhotoTemp").done(function(data)
    {
        var obj = JSON.parse(data);
        for(var i = 0; i < obj.photos.length; i++)
            localPhotos.push(obj.photos[i]);

        for(var i = 0; i < localPhotos.length; i++)
            layoutPhoto(localPhotos[i], i);
    });
}

function layoutPhoto(photo, i)
{
    var photoThumb = $("<img></img>").attr("src", photo).attr("id", "photo-thumb");
    var gridTile = $("<div></div>").append(photoThumb).attr("id", "grid-tile");

    gridTile.click
    (
        function()
        {
        	popupPhoto(localPhotos[$(this).index()]);
        }
    );

    $("#photo-grid").append(gridTile);
}

function popupPhoto(photo)
{
    console.log(photo);

    var photoFull = $("<img></img>").attr("src", photo).attr("id", "photo-full");
    $("#photo-view").html(photoFull);

    $("#popup-photo").css("display", "flex");

    showPopup();
}

$(document).ready
(
    function()
    {
        $("#photo-close").click
        (
            function()
            {
                hidePopup();
                $("#popup-photo").css("display", "none");
            }
        );
    }
);

