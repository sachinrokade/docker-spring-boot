# Docker Commands
docker login</br>docker build -t <img_name> Dockerfile .		// spotify is maven plugin to auto build docker image with maven command ex. [mvn install or mvn package]</br>docker rmi $(docker images -q) -f   		//remove all img</br>Docker-machine env default			//Docker env veriable value</br>Docker-machine ip				//Docker ip</br></br></br>

# *************push docker imgae
</br>docker tag ${image_id} docker.io/${login_name}/${image_name} </br>docker push docker.io/${login_name}/${image_name}</br>docker pull <repo>/<imgae></br></br></br></br>

# *************docker run</br>
docker run -p hostport:contport  img_id/nm        						  //docker run -p 8091:8091 a80c</br>docker run -p hostport:contport -d img_id/nm    						  //docker run -p 8091:8091 -d a80c  -d=detach mode</br>docker run -p hostport:contport -m 256m --cpu-quota 5000 img_id/nm        //docker run -p hostport:contport -m $ram --cpu-quota $in% img_id/nm   5%=5000</br></br>

# ************* logs
</br>docker logs</br>docker logs -f 									 //-f live log</br>docker logs <contn_id></br></br>

# ************* container
</br>docker ps  //list of container</br>docker ls -a</br>docker stop</br>docker kill</br>docker container prune  //remove all conti</br></br>docker stats            //below op</br>	CONTAINER ID        NAME                CPU %               MEM USAGE / LIMIT    MEM %               NET I/O             BLOCK I/O           PIDS</br>	3af4d07b6c83        fervent_newton      0.02%               45.5MiB / 985.4MiB   4.62%               696B / 0B           0B / 0B             11</br>docker system df</br>	TYPE                TOTAL               ACTIVE              SIZE                RECLAIMABLE</br>	Images              1                   1                   144.1MB             0B (0%)</br>	Containers          1                   0                   0B                  0B</br>	Local Volumes       0                   0                   0B                  0B</br>	Build Cache         0                   0                   0B                  0B	
