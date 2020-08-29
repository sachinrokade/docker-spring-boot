# Docker Commands
docker login</br>docker build -t <img_name> Dockerfile .		// spotify is maven plugin to auto build docker image with maven command ex. [mvn install or mvn package]</br>docker rmi $(docker images -q) -f   		//remove all img</br>Docker-machine env default			//Docker env veriable value</br>Docker-machine ip				//Docker ip</br></br></br>

# Push docker imgae
</br>docker tag ${image_id} docker.io/${login_name}/${image_name} </br>docker push docker.io/${login_name}/${image_name}</br>docker pull <repo>/<imgae></br></br></br></br>

# Docker run</br>
docker run -p hostport:contport  img_id/nm        						  //docker run -p 8091:8091 a80c</br>docker run -p hostport:contport -d img_id/nm    						  //docker run -p 8091:8091 -d a80c  -d=detach mode</br>docker run -p hostport:contport -m 256m --cpu-quota 5000 img_id/nm        //docker run -p hostport:contport -m $ram --cpu-quota $in% img_id/nm   5%=5000</br></br>

# Docker logs
</br>docker logs</br>docker logs -f 									 //-f live log</br>docker logs <contn_id></br></br>

# Docker Env
 docker inspect [cont_id]

# Container
</br>docker ps  //list of container</br>docker ls -a</br>docker st
</br>docker kill</br>docker container prune  //remove all conti</br></br>
docker stats            //below op</br>	
| CONTAINER ID | NAME          | CPU % | MEM USAGE / LIMIT   | MEM %  | NET I/O         | BLOCK I/O      | PIDS |
|:------------:|---------------|-------|---------------------|--------|-----------------|----------------|------|
| 6dd2fb6b6933 | busy_pascal   | 0.23% | 162MiB / 985.4MiB   | 16.44% | 40.3kB / 80.3kB | 50.3MB / 0B    | 28   |
| 09fafaa5d489 | loving_bhabha | 0.28% | 182.1MiB / 985.4MiB | 18.48% | 78.9kB / 216kB  | 5.16MB / 0B    | 28   |
| d166926a9d84 | mysql-boot    | 1.65% | 330.4MiB / 985.4MiB | 33.53% | 138kB / 98.6kB  | 75.9MB / 284MB | 64   |


</br>docker system df</br>	
| TYPE          | TOTAL | ACTIVE | SIZE    | RECLAIMABLE   |
|---------------|-------|--------|---------|---------------|
| Images        | 5     | 4      | 770.8MB | 104.8MB (13%) |
| Containers    | 65    | 3      | 595.1MB | 595MB (99%)   |
| Local Volumes | 29    | 15     | 2.903GB | 1.975GB (68%) |
| Build Cache   | 0     | 0      | 0B      | 0B            |
