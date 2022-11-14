#!/bin/bash

# Absolute path C:\folder\src\main\resources\ - file(s) you want to be changed in container.

docker run -d --name weatherapp -v C:\folder\src\main\resources\:/app/src/main/resources/ -p 8080:8080 weatherapp:1.0.0