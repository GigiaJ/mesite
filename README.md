Simple README

Just use Docker to build and to run for ease:
Build:
```
docker build -t gigiaj/mesite .
```
Run:
```
docker run -p 8084:80 gigiaj/mesite
```

Can access in browser now at:
```
localhost:8084
```

deploy to docker repo
```
echo "$DOCKERHUB_PAT" | docker login --username gigiaj --password-stdin
docker push gigiaj/mesite:latest
```
