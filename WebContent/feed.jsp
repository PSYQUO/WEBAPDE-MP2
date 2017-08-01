<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<!-- Reaf - a Japanese stereotypical pronunciation of leaf. That is all. -->
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>${sessionScope.username} @ Reaf.</title>
		<script src="resources/js/jquery-3.2.1.js"></script>
		<script src="resources/js/helperscript.js"></script>
		<script src="resources/js/photos.js"></script>
        
		<link href="resources/css/mainstyle.css" type="text/css" rel="stylesheet"></link>
		<link href="resources/css/photos.css" type="text/css" rel="stylesheet"></link>

        <script src="resources/js/feed.js"></script>
		<link href="resources/css/feed.css" type="text/css" rel="stylesheet"></link>
	</head>
	<body>
		<div class="topbar">
			<div id="name">
				<img style="margin-right: 10px;" src="resources/assets/leaf.png"></img>
				Reaf.
			</div>
			<div id="search-div">
				<input id="search-bar" type="search"></input>
			</div>
			<div id="upload-div">
				<input type="file" accept=".png, .jpg, .tiff" name="upload"/>
				<button id="upload-button">
					<img style="margin-right: 8px;" src="resources/assets/upload.png"/>
					Upload
				</button>
			</div>
			<div>
				<button id="user-button">
					<img style="margin-right: 8px;" src="resources/assets/avatar-18px.png"/>
					${sessionScope.username}
				</button>	
			</div>
		</div>
		<div class="content">
			<div id="menu-user">
				<a id="user-logout" href="Logout">Logout</a>
			</div>
			<div id="photo-grid">
			</div>
		</div>
		<div class="popup">
			<div id="popup-upload">
				<div id="upload-view">
					<img id="photo-full" src="resources/assets/sample.jpg"/>
				</div>
				<div id="upload-info">
					<div id="edit-pic">
						<button id="edit-close"><img src="resources/assets/cancel.png"/></button>
						<div id="edit-title">
							<input name="title" placeholder="Title" size="20" type="text"/>
						</div>
						<div id="edit-desc">
							<textarea name="description" placeholder="description" rows="3" cols="35"></textarea>
						</div>
					</div>
					<div id="edit-tags">
						<img src="resources/assets/tag.png"/>
						<input name="tags" placeholder="tags" size="27" type="text"/>
					</div>
					<button id="edit-upload-button">Upload</button>
				</div>
			</div>
			<div id="popup-confirm">
				<img style="margin-right: 20px;" src="resources/assets/tick.png"/>
				<span id="confirm-dialog">Image uploaded!</span>
			</div>
			<div id="popup-photo">
				<div id="photo-view">
				</div>
				<div id="photo-info">
					<div id="info-pic">
						<button id="photo-close"><img src="resources/assets/cancel.png"/></button>
						<div id="photo-title">Photo from the Internet</div>
						<div id="photo-desc">A nice photo from the internet.</div>
					</div>
					<div id="info-user">
						<span id="photo-user"><img style="margin-right: 9px;" src="resources/assets/avatar.png"/>admin</span>
						<div id="photo-tags">
							<img style="margin-right: 4px;" src="resources/assets/tag.png"/>
							<span id="tag-item">meme?</span>
							<span id="tag-item">internet</span>
							<span id="tag-item">something</span>
						</div>
					</div>
				</div>
			</div>
        </div>
	</body>
</html>