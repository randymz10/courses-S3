# API Cursos

## Description

API made with spring-boot was development to practice upload, get and delete files in a bucket S3 from AWS. This API emule Courses that can be available into the internet.

## Paths

|  Method  | Path                     | Description                     |
|----------|--------------------------|---------------------------------|
|   GET    | /api/cursos              | get all courses                 |
|   POST   | /api/cursos              | Create an course                |
|   POST   | /upload                  | Upload file to Amazon S3        |
|   GET    | /get-object?key={key}    | Get the and the url of the file |
|   DELETE | /delete-object?key={key} | Delete the file from Amazon S3  |

## Author

[@Randymz10](https://github.com/randymz10)
