Using SpringProject how can we deploy the project to Docker and run from the container 
Step to follow 
1. create docker-compose file
2. run the project
3. use the command "docker build -t "AnyNAME" ."
4. check wither you're images is created or not using command "docker images"
5. run the docker image "docker run -d -p 8082:8080 <containerName>"
