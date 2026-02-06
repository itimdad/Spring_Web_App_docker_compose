<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Book Store</title>
    <link rel="stylesheet" href="style.css">
  </head>
  <body>
	<h1>Getting book details By Id </h1>
	
	<form action="book" >
		
		Enter Book Id: <input type="text" name = "id" id="id"> <br>
		<input type="submit" value="Search">
		
	</form>
	
	<hr>
	<br>
	Book ID: ${bookObj.bookId}  <br>
	Book Name: ${bookObj.bookName} <br>
	Book price:  ${bookObj.bookPrice}
	
  </body>
</html>