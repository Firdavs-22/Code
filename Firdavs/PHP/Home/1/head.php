<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <style>
        * {
            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        header {
            display: flex;
            width: 100vw;
            justify-content: space-around;
            border: black 1px solid;
            height: 2.5em;
        }
        .url {
            font-size: 2em;
            font-weight: bold;
            text-align: center;
        }
        .url a {
            text-decoration: none;
            color: black;
        }
    </style>
</head>
<body>

<header>
    <div class="url"><a href="./index.php">Main</a></div>
    <div class="url"><a href="./contact.php">Contact</a></div>
    <div class="url"><a href="./about.php">About</a></div>
</header>