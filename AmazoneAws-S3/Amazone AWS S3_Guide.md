# Amazone AWS S3 

> [!NOTE]
>
> - **S3 란 ?**
>
>   - 객체 스토리지 서비스 
>   -  버킷 단위의 컨테이너 
>   - 객체에 대한 URL 제공 
>     - 이미지 서버 역할
>
> - **구성**
>
>   - key: 파일의 이름
>   - value : 파일의 데이터
>   - version ID :파일의 버전
>   - metadata:  수정일 , 파일,타입 ,소유자 등의 정보를 담은 데이터
>   - CORS
>
>   
>
> - **설정**
>
>   - ***bucket생성***
>
>     
>
>     - aws 리전
>       - aws가 제공되는 지리적인 위치
>
>     - 버킷이름
>
>       - url의 일부로 유일해야함
>
>     - 객체 소유권
>
>       - s3 버킷 내에 저장된각 파일에 대한 소유자 
>
>     - 이 버킷의 퍼블릭 엑세스 차단설정
>
>       - 버킷과 그안에 저장된 객체가 url로 접근가능한 지 여부를 결정하는 설정
>
>     - 버킷 버전관리 
>
>       - 객체마다 버전을 관리할수 있는 기능
>
>     - 기본 암호화 
>
>       - 모든객체가 자동으로 암호화
>
>       
>
>   - ***bucket 권한부여*** 
>
>     - 버킷 정책 설정하기 
>       - 버킷에 대한 세밀한 제어 제공
>         - version : 정책버전
>         - statement: 하나 이상의 정책 선언
>         - sid: 특정 statement에 대한 식별자
>         - Effect : 규칙이 조건에 대해 허가 / 거부인지 명시
>         - **<u>Principal</u>**: 정책이 적용되는 사용자의 범위
>         - **<u>Action</u>**: 정책이 적용되는 행위의범위
>         - **<u>Resource</u>** : 정책이 적용되는 리소스를 지정 
>
>  
>
> ```
> > {
> >     "Version": "2012-10-17",
> >     "Statement": [
> >         {
> >             "Sid": "Statement1",
> >             "Principal":"*",            
> >             "Effect": "Allow",
> >             "Action":"s3:*",
> >             "Resource": "arn:aws:s3:::ta9yongjtest"
> >             
> >
> >         }
> >     ]
> >
> > }
> ```
>
> 



# IAM이란?

> [!NOTE]
>
> - **정의**
>
>   - Identify and Access Management
>
> -  **역할**
>
>   - 사용자 및 그룹 관리
>   - 역할 및 정책
>   - 세밀한 접근 제어
>   - 보안 강화
>   - API 키 관리
>
> - **S3 연계방법**
>
>   - 사용자생성 - > 직접정책 연결 (AmazoneS3FullAccess)
>     - [ s3서비스 엑세스의 역할]
>
>   - 엑세스 키 만들기 

​	

> [!TIP]
>
> **이후부터는 스프링 부트와 연동** 