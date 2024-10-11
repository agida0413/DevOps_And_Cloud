#베이스 이미지를 명시해준다.
FROM alpine

#추가적으로 필요한 파일들을 다운로드 받는다. 
#RUN command

#컨테이너 시작시 실행 될 명령어를 명시해준다.
CMD ["echo","hello"]



## 도커 볼륨 

docker run -d  -p 5000:8080 -v /usr/src/app32/node_modules -v %cd%:/usr/src/app32 agida0413/node2


##도커 컴포즈 


docker-compose up 
## 소스 수정시 이미지 다시 빌드 후 컴포즈
docker-compose up --build  

#도커 컴포즈 삭제 
docker-compose down


## Docker.dev
docker build -f Dockerfile.dev .







FROM node:10

#컨테이너 접근시 이동하는 경로
WORKDIR /usr/src/app32
# 효율적인 카피 - > CACHE 
COPY package.json ./
RUN npm install 
COPY ./ ./

CMD ["node","server.js"]