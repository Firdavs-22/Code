<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Employees</title>
    <style>
        * {
            box-sizing: border-box;
            padding: 0;
            margin: 0;
        }

        body {
            font-family: Inter, -apple-system, system-ui, "Segoe UI", Helvetica, Arial, sans-serif;
        }

        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 1em;
        }

        th,
        td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 0.5em;
        }

        th {
            background-color: #f2f2f2;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {

    </style>
</head>
<body>
<p><a href="./create.php">Add New Employer</a></p>
<?php
$db_name = 'employees.json';
if (file_exists($db_name)) {
    $db = file_get_contents($db_name);
    $db = json_decode($db,true);
    if (count($db) > 0) {
        ?>
        <table>
            <tr>
                <th>№</th>
                <th>First Name</th>
                <th>Last Name</th>
            </tr>
            <?php
            $i = 1;
            foreach ($db as $employee) {
                ?>
                <tr>
                   <td><?=$i++;?></td>
                   <td><?=$employee['fname'];?></td>
                   <td><?=$employee['lname'];?></td>
                </tr>
                <?php
            }
            ?>
        </table>
        <?php
    } else {
        echo 'Data doesn\'t exist';
        die();
    }
} else {
    echo 'Data Base not working';
    die();
}
?>
</body>
</html>
