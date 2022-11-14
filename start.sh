#!/bin/bash

docker build --platform linux/amd64 -t weatherapp:1.0.0 .

docker run -d --name weatherapp -p 8080:8080 weatherapp:1.0.0