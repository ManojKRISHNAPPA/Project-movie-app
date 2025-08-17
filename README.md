# This is Complete Integration of Maven Project

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20065236.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20065904.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20070129.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20071429.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20081107.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20081434.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20081534.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20082203.png?raw=true)

## Code for sonarqube installation.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20083129.png?raw=true)
This is the exact script i need for sonarqube.
After saving the script,
We need to adduser.

Adding user to the sonarqube.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20083306.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20084612.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20084820.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20084842.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-21%20091808.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20230216.png?raw=true)

```
sudo apt update && sudo apt upgrade -y
sudo apt install openjdk-17-jdk unzip wget -y
adduser sonarqube
su - adduser
wget https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-9.4.0.54424.zip
unzip *
chmod -R 755 /home/sonarqube/sonarqube-9.4.0.54424
chown -R sonarqube:sonarqube /home/sonarqube/sonarqube-9.4.0.54424
cd sonarqube-9.4.0.54424/bin/linux-x86-64/
./sonar.sh start

```

SonarQube will get started.

Sonarqube default port is 9000.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20231141.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20003142.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20231402.png?raw=true)

In this, we have setup Jenkins and Sonarqube, now we must set up docker.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20231645.png?raw=true)

Exit from sonarqube
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20231917.png?raw=true)
While running the script , we wont get any messages , because everything goes for /dev/null

apt-get install docker.io also works fine to install docker

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20232017.png?raw=true)
Only , docker status and version will be printed.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20232242.png?raw=true)
Checking the Docker Status

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20232515.png?raw=true)
Installing Trivia

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-23%20232934.png?raw=true)
Project Folder View

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20000252.png?raw=true)

Stage 1 is setting the git.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20001402.png?raw=true)

Stage 2 is compiling
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20001420.png?raw=true)
Stage 3 is Building

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20001449.png?raw=true)

Stage 4 is codescaning.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20001329.png?raw=true)

Create a new Pipeline in Jenkins
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20004001.png?raw=true)
Check the Identation of the Jenkinsfile
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20010211.png?raw=true)
Add the Eclipse Plugin
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20095000.png?raw=true)
Next, add the Tools
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20095155.png?raw=true)
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20095319.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20095612.png?raw=true)

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20095716.png?raw=true)
Just add name, apply and save.
So as per script, we finished setting up tools,
Next we must setup stages.

Next, we must connect Sonarqube to Jenkins.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20100731.png?raw=true)
Generating the Token.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20100935.png?raw=true)
Here, add that created token as secret id.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20101249.png?raw=true)
Here, also we need to mention the Token
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20101647.png?raw=true)
Next we need to give permissions to Docker to Jenkins and vice versa.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20102303.png?raw=true)
We can see the assigned permissions
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20102429.png?raw=true)
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20102758.png?raw=true)
Add the credentials
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20103352.png?raw=true)
Use DockerHub credentials.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20103929.png?raw=true)
Next Installing the Tomcat server
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20104727.png?raw=true)
Logging in docker user
Copying the webapp.war into the container’s webapp folder.

docker login -u prathikmr —------>command to manually login into docker.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20105007.png?raw=true)
All the necessary Plugins have been installed.
Create a new Item with Pipeline Syntax
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20105103.png?raw=true)
Create a Pipeline Syntax.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20105304.png?raw=true)
Add these docker credentials here.
This registry credentials will be taken automatically.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20110235.png?raw=true)
Creating a new Item for Intergation
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20110406.png?raw=true)
Give this Jenkins script path
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20110554.png?raw=true)
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20110658.png?raw=true)
Install this plugin to view the Pipeline.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20154226.png?raw=true)
Check the docker images created.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20154457.png?raw=true)
Also, Docker container is in created state.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20154907.png?raw=true)
If any error arises, change the port number and try.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20155355.png?raw=true)
This is SonarQube view.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20155902.png?raw=true)
We can see the Tomcat server is Up.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20160534.png?raw=true)
After that we must enable the git SCM POLLING in jenkins item.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20161308.png?raw=true)
Create a Git Webhook
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20160824.png?raw=true)
Adding the WebHook in Payload URL.
After my commit, it started automatically to build.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20162820.png?raw=true)
Complete Stage Pipeline view of the Build.
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20162954.png?raw=true)
We can see the Trivy Codescan report in Jenkins console ouput
![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20163136.png?raw=true)
SonarQube view of Complete code scan

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20160227.png?raw=true)
We can see the Web application is loaded.

![](https://github.com/prathikmr7/Project-movie-app1/blob/images/Screenshot%202025-05-24%20163410.png?raw=true)
We can see the docker hub repository.
![]()
