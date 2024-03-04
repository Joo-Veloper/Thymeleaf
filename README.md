# Thymeleaf란?

---

<aside>
💡 Java 기반의 서버 측 템플릿 엔진이다.
HTML, XML, JavaScript, CSS 등의 마크업 언어를 처리하며, 
자연스러운 템플릿과 통합되어 있어 데이터를 서버에서 동적으로 렌더링하는 데 용이하다.
특히 스프링 프레임워크와의 통합이 강하며, 스프링 Web Application에 사용된다.
Thymeleaf는 간편하고 직관적인 문법을 제공하여 템플릿 작성 및 유지보수를 용이하게 만듭니다.

</aside>


### **스프링과의 통합**

- 스프링과 자연스럽게 통합되고, 스프링의 다양한 기능을 편리하게 사용할 수 있게 지원한다.

### **Server Side Rendering (SSR)**

- BackEnd 서버에서 HTML을 동적으로 Rendering 하는것.

### **Natural Template**

- 타임리프는 순수 HTML을 최대한 유지하는 특징을 가지고 있다.
    - 웹 브라우저에서 파일을 직접 열어도 정상적인 내용을 확인할 수 있다.
    - 참고 : JSP 등의 파일은 확인할 수 없다.
    
- Server에서 동적으로 변경된 결과를 확인할 수 있다.
    - 동적 HTML, SSR
    - JSP는 Server에서 Rendering 되고 HTML 응답 결과를 받아야만 화면을 확인할 수 있다.
    - Thymeleaf는 위와같은 경우 동적인 결과는 조회하지 못하지만 HTML은 조회할 수 있다.

- HTML 마크업 결과를 바로 확인할 수 있다.
    - 순수 HTML

- 순수 HTML을 유지하면서 View Template 까지 사용할 수 있는것을 **Natural Template** 이라고 한다.

### 참고자료

- 타임리프 공식 사이트

https://www.thymeleaf.org/

- 타임리프 공식 메뉴얼

[Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html)

- 타임리프 + Spring 공식 메뉴얼

[Tutorial: Thymeleaf + Spring](https://www.thymeleaf.org/doc/tutorials/3.1/thymeleafspring.html)

# 프로젝트 생성

---

<aside>
💡 실습을 위한 프로젝트 세팅

</aside>

- **프로젝트 세팅 가이드**
    - Spring initializr 접속
    
    [](https://start.spring.io/)
    
    - 좌측 탭 아래 이미지와 같이 세팅
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/b258f115-1a74-4335-9546-5687dedc5efa/Untitled.png)
    
    - ADD DEPENDENCIES 클릭 → 라이브러리 추가
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/79653c8b-6589-4dcf-8be4-1816d3f89ea1/Untitled.png)
    
    - 라이브러리 추가
        - Spring Web
        - Lombok
        - Thymeleaf
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/adc4647f-c77f-4ec2-9e1f-a6f9b9eeee37/Untitled.png)
    
    - Generate 클릭
        - 다운로드 후 압축해제
    
    - Intellij 실행
        - 프로젝트 선택화면에서 OPEN 클릭
        - 현재 실행중인 프로젝트가 있다면 닫으면 해당 화면이 나옵니다.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e9f965d8-2e89-4faa-8e4c-186929f31286/Untitled.png)
    
    - 다운로드 받은 폴더 경로를 찾아 더블클릭
        - 경고 메세지 나오면 Trust Project 클릭
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/38df3f96-7dc0-4d90-b70b-e4431129b41f/Untitled.png)
    
    - 기본세팅 완료
        - 우측 하단 바에서 인덱싱, 빌드 과정이 꽤 걸리니 완료될때까지 기다려주세요.
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/37182b6b-d29e-4403-9b1a-d214afc663ab/Untitled.png)
    
    - 빌드 완료되면 Application 실행 확인
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/95d5b26f-c6c6-435a-be22-560185d7ff18/Untitled.png)
    
    - 콘솔에 Tomcat port번호 확인 → 8080
    
    - URL [localhost:8080](http://localhost:8080) 접속 후 Whitelabel Error Page 확인
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/257ff13f-99f2-4119-841e-4cc8b5fca317/Untitled.png)
    
    - src/resources/static 경로게 index.html 파일생성
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/add6d9e5-bb47-4a94-853e-bee3af2fe229/Untitled.png)
    
    - Index.html
    
    ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Title</title>
    </head>
    <body>
    메인 페이지 입니다.
    </body>
    </html>
    ```
    
    - Application 재실행 후 localhost:8080 접속
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/2a49d21a-7090-40b3-8389-2023ea7606d4/Untitled.png)
    
    - 프로젝트 세팅 끝
        - 혹시 모르니 lombok 세팅 확인해주세요~!
    
    - Settings → Annotation Processors → Enable annotation processing 체크 → OK
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e9d99340-e000-478a-8b56-be7d3af22a29/Untitled.png)
    

### Spring 기능소개

- 참고자료

[Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#standard-expression-syntax)

> 쉬운만큼 자기것으로 만들고자 한다면 꼭 실습을 해보아야 한다.
> 

# Text

---

<aside>
💡 Thymeleaf는 기본적으로 HTML Tag의 속성에 기능을 정의한다.

</aside>

- **Text 기능 실습**
    
    
    1. **controller 디렉토리 생성 후 TextController Class 생성**
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/77a03770-7202-4a70-a58e-619c9fc54cc9/Untitled.png)
    
    - **TextController**
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/f6a470b7-e48a-48ce-99b6-374fd3c7c4a1/Untitled.png)
            
        - 코드
            
            ```java
            @Controller
            @RequestMapping("/text")
            public class TextController {
            
                @GetMapping("/basic")
                public String basic(Model model) {
            
                    model.addAttribute("key", "value");
            
                    return "test/basic";
                }
            }
            ```
            
        
    
    - **templates → test 디렉토리 생성 → basic.html 생성**
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/4751b8c2-0c1e-4d90-9829-22c013246708/Untitled.png)
    
    - **basic.html**
        - **주의!** `<html xmlns:th=”http://www.thymeleaf.org”>` 경로설정 필수
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/0c27be8e-ddb2-4d48-b58e-694c923168df/Untitled.png)
            
        
        - 코드
            
            ```html
            <!DOCTYPE html>
            <html xmlns:th="http://www.thymeleaf.org" lang="en" >
            <head>
                <meta charset="UTF-8">
                <title>Basic</title>
            </head>
            <body>
                <h1>Text</h1>
                <ul>
                    <li>text 기능, Tag 사용 <span th:text="${key}"></span></li>
                    <li>text 기능, contents 치환 = [[${key}]]</li>
                </ul>
            </body>
            </html>
            ```
            
    
    - **Application 재실행 후 브라우저 URL에 [`localhost:8080/text/basic`](http://localhost:8080/text/basic) 입력**
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/05255108-6e3a-443b-978c-bab36a35b87c/Untitled.png)
    
    - **실행흐름**
        - GET /text/basic URL로 접근
        - model 객체의 addAttribute를 통해 key라는 이름으로 Key값을 세팅
        - model 객체의 addAttribute를 통해 value라는 이름으로 Value값을 세팅
        - return test/basic → **template/test/basic.html** View 호출
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/76060e45-1f50-4c35-bd2f-89d3f9f3fd2a/Untitled.png)
    
    ```html
    <!-- key라는 Key값을 찾아와 Value값으로 대체 -->
    <li>text 기능, Tag 사용 <span th:text="${key}"></span></li>
    
    <!-- key라는 Key값을 찾아와 Value값으로 대체 -->
    <li>text 기능, contents 치환 = [[${key}]]</li>
    ```
    

### Escape

<aside>
💡 HTML 문서는 특수 문자 기반으로 구성되어 있다. `“<”, “>”`
뷰 템플릿으로 HTML 화면을 생성할 때는 출력하는 데이터에 특수 문자가 있는 것을 주의해야 한다.
아래 실습을 통해 알아보자.

</aside>

- 참고 : `<b>` 태그는 태그 안의 글자를 굵게 만드는 역할을 한다.

- **Escape 기능 실습**
    
    
    1. **기존 TextController 수정**
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e7da50c5-0be5-461f-ac94-b49ab0ef812a/Untitled.png)
            
        
        - 코드
            
            ```java
            @Controller
            @RequestMapping("/text")
            public class TextController {
            
                @GetMapping("/basic")
                public String basic(Model model) {
            
                    model.addAttribute("key", "<b>value</b>"); // 여기 수정!
            
                    return "test/basic";
                }
            }
            ```
            
    
    1. **서버 재실행 후 [localhost:8080/text/basi](http://localhost:8080/test/basic.html)c URL 접근**
        - “value” 글자가 굵게 나온것이 아니라 특수문자 그대로 출력됨
    
    ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/f5c78f76-1c32-4275-8141-bab7baa24035/Untitled.png)
    
    1. **비어있는 HTML에 우클릭 → 페이지 소스 보기 클릭**
        - 특수문자가 `&lt;`  혹은  `&gt;` 형태로 바뀌어 있는것을 확인할 수 있다.
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/52aca28b-f948-4700-8dac-e8d41482e3ed/Untitled.png)
        
    

### HTML 엔티티

<aside>
💡 브라우저는 특수문자 ‘<’ 를 HTML Tag의 시작지점으로 인식한다.
이것을 문자로 표현할 수 있는 방법이 HTML 엔티티이다.
HTML에서 사용하는 특수 문자를 HTML 엔티티로 변경하는것을 Escape라고 한다.

</aside>

- Thymeleaf Text 기능은 기본적으로 Escape 기능을 제공하는것을 알 수 있다.
    - 게시판을 만들었다고 가정해보자
        - 사용자들은 얼마나 많은 특수문자를 사용하는가!
    
- 참고자료

[코딩교육 티씨피스쿨](https://tcpschool.com/html/html_text_entities)

# uText

---

<aside>
💡 Escape 기능을 사용하지 않고자 할 때 사용하는 방법.
utext의 u는 unescape를 의미한다.

</aside>

### Unescape

<aside>
💡 Escape의 반대를 의미한다. Thymeleaf는 Unescape를 위해 두가지 기능을 제공한다.
실제로 개발을 진행하다보면 Escape 처리를 사용하지 않아서 
Rendering이 정상적으로 되지 않는 문제가 자주 발생한다.
그러므로 꼭 필요한 경우에만 Unescape 기능을 사용하여야 한다.

</aside>

- **Unescape 기능 실습**
    
    
    1. **TextController에 Controller 추가**
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/bc0fd9f0-60db-4b3b-b4f4-cabf08d65ade/Untitled.png)
            
        
        - 코드
            
            ```java
            @Controller
            @RequestMapping("/text")
            public class TextController {
            
                @GetMapping("/basic")
                public String basic(Model model) {
            
                    model.addAttribute("key", "<b>value</b>");
            
                    return "test/basic";
                }
            		
            		// 아래 코드가 추가되었습니다.
                @GetMapping("/unescaped")
                public String unescaped(Model model) {
            
                    model.addAttribute("key", "<b>value</b>");
            
                    return "test/basic-unescaped";
                }
            }
            ```
            
        
    2. **template/test 경로에 basic-unescaped.html 파일 생성**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/3287f184-8db5-4cd9-871e-16817717a497/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org" lang="en" >
        <head>
            <meta charset="UTF-8">
            <title>Basic</title>
        </head>
        <body>
        <h1>utext</h1>
        <ul>
            <li>text 기능, escape : text <span th:text="${key}"></span></li>
            <li>text 기능, Unescape : utext <span th:utext="${key}"></span></li>
        </ul>
        
        <h1><span th:inline="none">[[변수Key값]] OR [(변수Key값)]</span></h1>
        <ul>
            <li><span th:inline="none">[[변수Key값]] </span>[[${key}]]</li>
            <li><span th:inline="none">[(변수Key값)] </span>[(${key})]</li>
        </ul>
        </body>
        </html>
        ```
        
    
    1. **서버 재실행 후 `localhost:8080/text/unescaped` URL 접근**
        - utext 사용결과 value 글자가 굵게 출력됨
        - [(변수)] 사용결과 value 글자가 굵게 출력됨
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/1f62ccb5-0ec5-4799-beae-c74562794c96/Untitled.png)
            
    

# SpringEL

---

<aside>
💡 Thymeleaf는 변수를 사용할 때 변수 표현식을 사용한다. 
ex) `${변수값}`
여기서 사용되는 변수 표현식에 사용되는것이 바로 Spring EL이다.

</aside>

- **Spring EL 실습**
    
    
    1. **TextController에 Controller @GetMapping(“/variable”)추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/cb1a5d7d-e47b-4722-b523-109ee8b224a7/Untitled.png)
        
        - 코드
            - TMI : 원규는 튜터 친형 이름
            
            ```java
            @GetMapping("/variable")
                public String variable(Model model) {
            
                    User wonuk = new User("wonuk", 100);
                    User wongyu = new User("wongyu", 101);
            
                    List<User> userList = new ArrayList<>();
                    userList.add(wonuk);
                    userList.add(wongyu);
            
                    Map<String, User> userMap = new HashMap<>();
                    userMap.put("wonuk", wonuk);
                    userMap.put("wongyu", wongyu);
            
                    model.addAttribute("wonuk", wonuk);
                    model.addAttribute("wongyu", wongyu);
            
                    model.addAttribute("userList", userList);
                    model.addAttribute("userMap", userMap);
            
                    return "test/variable";
                }
            ```
            
        
        1. **com/thymeleaf 하위에 data 디렉토리 생성 후 User 클래스 생성**
            - 사진
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/4eaa99ac-4615-45a6-b64a-72dcd0b155a3/Untitled.png)
                
            
            - 코드
                
                ```java
                @Data
                public class User {
                    private String name;
                    private int age;
                
                    public User(String name, int age) {
                        this.name = name;
                        this.age = age;
                    }
                }
                ```
                
        
        1. **resources/templates/test 하위에 variable.html 생성**
            - 사진
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/8fbfbc77-708d-40b8-8500-c9c169ce7562/Untitled.png)
                
        
        - 코드
            
            ```html
            <!DOCTYPE html>
            <html xmlns:th="http://www.thymeleaf.org" lang="en">
            <head>
                <meta charset="UTF-8">
                <title>Basic</title>
            </head>
            <body>
            <h1>SpringEL</h1>
            
            <h2>SpringEL 기본</h2>
            <ul>
                <li>${wonuk.name} = <span th:text="${wonuk.name}"></span></li>
                <li>${wonuk['name']} = <span th:text="${wonuk['name']}"></span></li>
                <li>${wonuk.getName()} = <span th:text="${wonuk.getName()}"></span></li>
            
                <li>${wongyu.name} = <span th:text="${wongyu.name}"></span></li>
                <li>${wongyu['name']} = <span th:text="${wongyu['name']}"></span></li>
                <li>${wongyu.getName()} = <span th:text="${wongyu.getName()}"></span></li>
            </ul>
            
            <h2>userList</h2>
            <ul>
                <li>${userList[0].name} = <span th:text="${userList[0].name}"></span></li>
                <li>${userList[0]['name']} = <span th:text="${userList[0]['name']}"></span></li>
                <li>${userList[0].getName()} = <span th:text="${userList[0].getName()}"></span></li>
            
                <li>${userList[1].name} = <span th:text="${userList[1].name}"></span></li>
                <li>${userList[1]['name']} = <span th:text="${userList[1]['name']}"></span></li>
                <li>${userList[1].getName()} = <span th:text="${userList[1].getName()}"></span></li>
            </ul>
            
            <h2>userMap</h2>
            <ul>
                <li>${userMap['wonuk'].name} = <span th:text="${userMap['wonuk'].name}"></span></li>
                <li>${userMap['wonuk']['name']} = <span th:text="${userMap['wonuk']['name']}"></span></li>
                <li>${userMap['wonuk'].getName()} = <span th:text="${userMap['wonuk'].getName()}"></span></li>
            
                <li>${userMap['wongyu'].name} = <span th:text="${userMap['wongyu'].name}"></span></li>
                <li>${userMap['wongyu']['name']} = <span th:text="${userMap['wongyu']['name']}"></span></li>
                <li>${userMap['wongyu'].getName()} = <span th:text="${userMap['wongyu'].getName()}"></span></li>
            </ul>
            </body>
            </html>
            ```
            
        1. [**localhost:8080/text/variable](http://localhost:8080/text/variable) URL로 접근**
            - 결과확인
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/9abba67e-cd4a-4944-a789-b099f92c2231/Untitled.png)
                
                - **Spring EL 기본 : Object 접근 문법**
                    1. `${인스턴스명.필드명}`
                    2. `${인스턴스명[’필드명’]}`
                    3. `${인스턴스명.get필드명()}`
                    
                - **userList : List 접근 문법**
                    1. `${리스트[인덱스].필드명}`
                    2. `${리스트[인덱스][’필드명’]}`
                    3. `${리스트[인덱스].get필드명()}`
                    
                - **userMap : Map 접근 문법**
                    1. `${맵['Key값'].필드명}`
                    2. `${맵['Key값'][’필드명’]}`
                    3. `${맵['Key값'].get필드명()}`

### 지역변수

<aside>
💡 thymeleaf 내에서도 지역 변수를 사용할 수 있다.
지역 변수는 선언한 HTML Tag 내부에서만 사용할 수 있다.

</aside>

- **지역변수 실습**
    
    
    1. **기존 variable.html 수정**
        - th:with 사용
            - index0 이라는 변수에 값을 담을 수 있다.
            
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/06bb74b8-fe38-492f-a323-da877d077cc1/Untitled.png)
        
        - 코드
        
        ```html
        <h2>지역변수</h2>
        <ul>
            <li th:with="index0=${userList[0]}">
               <p>Index 0 Name = <span th:text="${index0.name}"></span></p>
            </li>
        </ul>
        ```
        
    2. **브라우저 [localhost:8080/text/variable](http://localhost:8080/text/variable) URL로 접근**
        - 결과 확인
            - index0 이라는 변수에 값이 담겨있다.
            - 변수의 범위는 li Tag 내부 에서만 적용된다.
                - li 하위 p태그도 적용 대상
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6961abe3-0186-4cb1-8459-957d4e56a049/Untitled.png)
        

# Object

---

<aside>
💡 Thymeleaf는 기본 제공하는 Object들이 있다.
기본 제공되는 객체들에 대해서 알아보자.

</aside>

- 아래 ——— 처리가 되어있는 것들은 Spring Boot 3.0부터 지원되지 않는다.
1. `~~${#session}~~`
2. `~~${#servletContext}~~`
3. `~~${#request}` : HttpServletRequest 객체~~
    - `~~request.getParameter()` 형태로 내부 값에 접근해야 한다.~~
4. `~~${#response}~~`
5. `${#locale}`
6. `${#param}` : 요청 파라미터 접근
7. `${@스프링 빈}` : Spring Bean 접근

- **Thymeleaf가 제공하는 Object 실습**
    
    
    1. **TextController에 @GetMapping(”/object”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/38cf6c34-80af-4cb3-9d34-590b77d7b1de/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/object")
            public String object() {
        
                return "test/object";
            }
        ```
        
    2. **com/thymeleaf 하위에 config 디렉토리 생성 후 TestSpringBean 클래스 생성**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e03bc6a2-829a-41b0-bf8a-9bbdda51dbcc/Untitled.png)
        
        - 코드
        
        ```java
        @Component("testSpringBean")
        public class TestSpringBean {
            public String test(String data) {
                return "test" + data;
            }
        
        }
        ```
        
    
    1. **resources/templates/test 디렉토리 하위에 object.html 추가**
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/340f9cd6-2e97-44a2-bf1e-d2cee95fae4f/Untitled.png)
            
        
        - 코드
            
            ```html
            <!DOCTYPE html>
            <html xmlns:th="http://www.thymeleaf.org" lang="en">
            <head>
                <meta charset="UTF-8">
                <title>Basic</title>
            </head>
            <body>
            <h1>기본 제공 객체</h1>
            <ul>
                <li>locale = <span th:text="${#locale}"></span></li>
            </ul>
            
            <h1>편의 객체</h1>
            <ul>
                <li>Request Param = <span th:text="${param.key}"></span></li>
                <li>Spring Bean = <span th:text="${@testSpringBean.test('Bean 객체 테스트')}"></span></li>
            </ul>
            </body>
            </html>
            ```
            
    
    1. **브라우저 GET [http://localhost:8080/text/object?key=아무거나](http://localhost:8080/text/object?key=%EC%95%84%EB%AC%B4%EA%B1%B0%EB%82%98) URL로 접근**
        - 결과 확인
            - locale
            - param
            - Spring Bean
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/3d685585-86e3-4876-b484-1b8515d2b87b/Untitled.png)
        
        - 원래대로라면 Model 객체를 사용해야 하지만 간편하게 접근할 수 있도록 편의 객체를 제공한다.

# 유틸리티 객체

---

<aside>
💡 Thymeleaf는 문자, 숫자, 날짜 등을 편리하게 다룰 수 있도록
다양한 유틸리티 객체들을 제공한다.
실제 사용할 때 찾아보면 되기때문에 실습은 굳이 하지 않겠습니다.

</aside>

- 참고자료
    - 유틸리티 객체
    
    [Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#expression-utility-objects)
    
    - 코드예시
    
    [Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#appendix-b-expression-utility-objects)
    

1. `#execInfo`
    - 처리중인 템플릿 정보
    
2. `#message` 
    - 메세지, 국제화
    
3. `#uris`
    - URI Escape
    
4. `#dates`
    - java.util.Date
    
5. `#calendars`
    - java.util.Calendar
    
6. `#temporals`
    - JAVA8 날짜
    
7. `#numbers`
    - 숫자 관련
    
8. `#strings`
    - 문자 관련
    
9. `#objects`
    - 객체 관련

1. `#bools`
    - boolean 관련

1. `#arrays`
    - 배열 관련

1. `#lists`
    - Collection List

1. `#sets`
    - Collection Set

1. `#maps`
    - Collection Map

1. `#aggregates`
    - 배열 또는 Collection의 총계

1. `#ids`
    - 아이디 처리 관련

**실제 사용할 때 찾아보면 되기때문에 실습은 필요 없습니다.**

# URL Link

---

<aside>
💡 Thymeleaf에서 URL 링크를 생성하는 방법에 대해 알아보자.

</aside>

- `@{}`
- 참고 : 상대경로, 절대경로 모두 사용할 수 있다.

[Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#link-urls)

- **URL Link 생성 실습**
    
    
    1. **TextController에 @GetMapping(”/link”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/73b2bcc9-fdcf-42c9-b4d9-ed491e004f90/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/url-link")
        public String urlLink(Model model) {
            model.addAttribute("test1", "value1");
            model.addAttribute("test2", "value2");
        
            return "test/url-link";
        }
        ```
        
    
    1. **templates/test 디렉토리 하위에 url-link.html 파일 생성**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/ae06e9dc-5b2c-4fb2-9854-cd60da1fd70b/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>URL Link</h1>
        <ul>
            <li><a th:href="@{/example}">기본 URL</a></li>
            <li><a th:href="@{/example(test1=${test1}, test2=${test2})}">Query Parameter</a></li>
            <li><a th:href="@{/example/{test1}/{test2}(test1=${test1}, test2=${test2})}">Path Variable</a></li>
            <li><a th:href="@{/example/{test1}(test1=${test1}, test2=${test2})}">Path Variable + Query Parameter</a></li>
        </ul>
        </body>
        </html>
        ```
        
    
    1. 브라우저 http://localhost:8080/text/url-link URL로 접근
        - 결과 확인
            - 현재 삽입된 href URL Link와 Model객체, HTML `@{…}` 를 비교해서 보시면 됩니다.
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e26f1a63-1579-4939-be55-d38c92430342/Untitled.png)
        
        - 빈곳에 우클릭 → 페이지 소스보기 클릭
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/7c48d96c-39d4-4fc5-81a4-8d1f3664d96b/Untitled.png)
        
        - 링크를 하나씩 클릭해서 결과 확인
            1. **기본 URL**
                1. 단순 URL
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/202c6376-4070-4ab2-bab8-ff085993ac5f/Untitled.png)
                
            2. **Query Parameter**
                1. (test1=${test1}, test2=${test2}) 
                2. ‘()’ 부분들은 Query Parameter로 처리
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e88d58a7-a769-4f45-9ed6-abffa173e68b/Untitled.png)
                
            
            1. **PathVariable**
                1. @{/example/{test1}/{test2}(test1=${test1}, test2=${test2})}
                2. 경로에 변수가 있으면 ‘()’ 부분들은 PathVaraible 처리
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/657ba605-37e5-478d-9451-fc12efc0df75/Untitled.png)
                
            
            1. **PathVariable + Query Parameter**
                1. 동시 사용가능
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/55446920-e19d-4bb8-a092-c690e3952dbf/Untitled.png)
                

# Literals

---

<aside>
💡 코드상의 고정된 값을 의미한다.
ex) `int a = 10` 에서 10 이 Literal이다.

</aside>

1. 문자 
    - ‘문자열’
    - 문자열은 (‘) **작은 따옴표로 감싸야 한다.**
    - ex) `<p th:text=”**’test’**”>`
    - 공백 없이 쭉 이어진다면 작은 따옴표 생략 가능
    - 규칙)
        1. A-Z 대문자만
        2. a-z 소문자만
        3. 0-9 숫자만
        4. []
        5. .
        6. - 
        7. _ 
    
2. 숫자 
    - 1
    
3. boolean
    - true, false
    
4. null
    - null

- **Literal 실습**
    
    
    1. **TextController에 @GetMapping(”/literal”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/3c32a577-03a9-42bc-a4ce-48d429f2e4e3/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/literal")
        public String literal(Model model) {
            model.addAttribute("key", "value");
        
            return "test/literal";
        }
        ```
        
    2. **templates/test 디렉토리에 literal.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/90541aa1-1b6e-4f4d-b2a8-696ad612f37a/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>Literal</h1>
        <ul>
        
            <!-- 아래 주석 풀지마세요 에러가 발생합니다! -->
            <!-- <li>"This Is Sparta!" = <span th:text="This Is Sparta!"></span></li> -->
        
            <li>'This' + ' Is' + ' Sparta!' = <span th:text="'This' + ' Is' + ' Sparta!'"></span></li>
            <li>'This is Sparta' = <span th:text="'This Is Sparta!'"></span></li>
            <li>'This Is' + ${key} = <span th:text="'This Is ' + ${key}"></span></li>
            <li>|This Is ${key}| = <span th:text="|This Is ${key}|"></span></li>
        </ul>
        </body>
        ```
        
    3. 브라우저 http://localhost:8080/text/literal URL로 접근
        - 결과 확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/0e783ae6-8f7b-43cc-8651-de991dd23f7a/Untitled.png)
        
    
    1. **만약 HTML의 주석을 풀게되면?**
        - HTML 맨위 주석해제
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/38c59bd5-a4ca-474b-8c65-e93048195bfb/Untitled.png)
        
        - 서버 재실행 후 URL http://localhost:8080/text/literal 재접속
            - Error가 발생하는것을 확인할 수 있다.
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/5b83a9ae-30a4-41c9-8955-878cb5b596d3/Untitled.png)
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/14f775e6-d11d-4fdb-9196-bc25ba8794b0/Untitled.png)
        

# Operation

---

<aside>
💡 Thymeleaf를 사용하면 HTML 내부에서 연산을 할 수 있다.
이 과정에서 위에서 나온 HTML 엔티티를 사용한다.

</aside>

- **Thymeleaf 연산 실습**
    
    
    1. **TextController @GetMapping(”/operation”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d6887dde-cd5a-449e-96ae-697e07520eeb/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/operation")
        public String operation(Model model) {
            model.addAttribute("null", null);
            model.addAttribute("key", "sparta");
        
            return "test/operation";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 operation.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6f31223d-9373-45c4-a31e-a11106335f84/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <ul>
            <li>사칙연산
                <ul>
                    <li>1 + 1 = <span th:text="1 + 1"></span></li>
                    <li>1 - 1 = <span th:text="1 - 1"></span></li>
                    <li>4 % 2 = <span th:text="4 % 2"></span></li>
                    <li>2 * 2 = <span th:text="2 * 2"></span></li>
                </ul>
            </li>
            <li>비교
                <ul>
                    <li>1 > 2 = <span th:text="1 &gt; 2"></span></li>
                    <li>1 gt 2 = <span th:text="1 gt 2"></span></li>
                    <li>1 >= 2 = <span th:text="1 >= 2"></span></li>
                    <li>1 ge 2 = <span th:text="1 ge 2"></span></li>
                    <li>1 == 2 = <span th:text="1 == 2"></span></li>
                    <li>1 != 2 = <span th:text="1 != 2"></span></li>
                </ul>
            </li>
            <li>조건식
                <ul>
                    <li>(4 % 2 == 0)? '짝':'홀' = <span th:text="(4 % 2 == 0)? '짝':'홀'"></span></li>
                </ul>
            </li>
            <li>Elvis
                <ul>
                    <li>${key}?: 'null 입니다.' = <span th:text="${key}?: 'null 입니다.'"></span></li>
                    <li>${null}?: 'null 입니다.' = <span th:text="${null}?: 'null 입니다.'"></span></li>
                </ul>
            </li>
            <li>No-Operation
                <ul>
                    <li>${key}?: _ = <span th:text="${key}?: _">null 입니다.</span></li>
                    <li>${null}?: _ = <span th:text="${null}?: _">null 입니다.</span></li>
                </ul>
            </li>
        </ul>
        </body>
        </html>
        ```
        
    3. 브라우저 http://localhost:8080/text/operation URL로 접근
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/42c02ece-f430-49db-a2f4-2aa861b9cf55/Untitled.png)
        
        - **사칙연산**
            - +
            - -
            - *
            - %
        - **비교**
            - >(gt)
            - ≥(ge)
            - <(lt)
            - ≤(le)
            - ==(eq)
            - ≠(neq, ne)
        - **삼항 연산자와 같음**
        - **No-Operation**
            - `<li>${null}?: _ = <span th:text="${null}?: _">null 입니다.</span></li>`
            - ‘_‘ 인 경우 thymeleaf가 적용되지 않는것처럼 실행된다.
        

# Attribute

---

<aside>
💡 Thymeleaf는 HTML 태그에 th: 속성을 정의하여 동작한다.
속성을 적용하면 기존 속성을 대체하거나 속성을 새로 만든다.

</aside>

- **Attribute 실습**
    
    
    1. **TextController에 @GetMapping(”/attribute”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/5b91c9d2-3dd7-4eaf-8a47-cfaf4067b7de/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/attribute")
        public String attribute() {
            return "test/attribute";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 attribute.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6866a325-5f72-4fb3-ba72-32cd8b886747/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>Set Attribute</h1>
        name=test + th:name<input type="text" name="test" th:name="member"/>
        
        <h1>Add Attribute</h1>
        class=sparta + th:classappend="test" <span class="sparta" th:classappend="test"></span><br/>
        class=sparta + th:attrappend="class='test'" <span class="sparta" th:attrappend="class='test'"></span><br/>
        class=sparta + th:attrprepend="class='test'" <span class="sparta" th:attrprepend="class='test'"></span><br/>
        
        <h1>checked</h1>
        - checked true 설정 <input type="checkbox" name="sparta" th:checked="true"/><br/>
        - checked false 설정 <input type="checkbox" name="sparta" th:checked="false"/><br/>
        </body>
        </html>
        ```
        
    
    1. 브라우저 http://localhost:8080/text/attribute URL로 접근
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d068311d-98f8-4713-a794-ac5c373c30e5/Untitled.png)
        
        - 페이지 소스 보기
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/005dfdfb-260a-4ac8-8db1-79805e1db84e/Untitled.png)
        
        1. `<input type="text" name="test" th:name="member"/>`
            - name=”member”로 변경된것을 확인
            - 기존에 name 속성이 없었다면 name속성이 새로 생기게된다.
            
        2. `<span class="sparta" th:classappend="test"></span>`
            - 기존의 class 명인 “sparta” 뒤에 “ test”가 추가됨 (공백 있음)
            - classapend를 사용하면 자연스럽게 추가하도록 공백을 추가해준것.
            
        3. `<span class="sparta" th:attrappend="class='test'"></span>`
            - 기존의 class 명인 sparta 뒤에 “test”가 추가됨 (공백 없음)
            
        4. `<span class="sparta" th:attrprepend="class='test'"></span>`
            - 기존의 class 명인 sparta 앞에 “test”가 추가됨 (공백 없음)
        
        1. `<input type="checkbox" name="sparta" th:checked="true"/>`
            - check
            
        2. `<input type="checkbox" name="sparta" th:checked="false"/>`
            - uncheck
            - check 속성 자체가 사라진다.
            

# Iteration

---

<aside>
💡 Thymeleaf에서는 동적인 화면을 반복적으로 쉽게 그릴 수 있도록 기능을 지원해준다.

</aside>

- `th:each`
- **반복 실습**
    
    
    1. **TextController에 @GetMapping(”/th-each”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/df387c73-0e1b-43e8-82d0-b6940589b42c/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/th-each")
        public String thEach(Model model) {
            List<User> userList = new ArrayList<>();
        
            userList.add(new User("user1", 21));
            userList.add(new User("user2", 22));
            userList.add(new User("user3", 23));
            userList.add(new User("user4", 24));
        
            model.addAttribute("userList", userList);
        
            return "test/th-each";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 th-each.html 추가**
        - 사진
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/033e4925-0651-4d6b-a34b-1c63f2b3b4de/Untitled.png)
            
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>th:each 테이블</h1>
        <table border="1">
            <tr>
                <th>name</th>
                <th>age</th>
            </tr>
            <tr th:each="user : ${userList}">
                <td th:text="${user.name}">name</td>
                <td th:text="${user.age}">1</td>
            </tr>
        </table>
        </body>
        </html>
        ```
        
    3. 브라우저 http://localhost:8080/text/th-each URL로 접근
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/e4596fbe-8c83-4cc1-8862-9fa4f8a90dba/Untitled.png)
        
        - userList 안의 결과물들이 하나씩 바인딩된다.
        - Iterable, Enumeration을 구현한 모든 객체를 사용할 수 있다.
        - 반복 상태값을 확인할 수 있다. (링크 참조)
            - ex) 인덱스, 홀수, 짝수, 사이즈, 처음, 마지막, 현재객체 상태 등
        
        [Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#iteration)
        

# 조건식

---

<aside>
💡 Thymeleaf에서는 동적인 화면을 그릴 때 조건을 활용할 수 있도록 기능을 지원해준다

</aside>

- `if`
- `unlesss` (if의 반대)
- `switch-case`

- **조건식 실습**
    
    
    1. **TextController에 @GetMapping(”if-unless”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/b7e25184-5735-4933-8943-0749cc9dca50/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/if-unless")
        public String condition(Model model) {
            List<User> list = new ArrayList<>();
        
            userList.add(new User("user1", 10));
            userList.add(new User("user2", 15));
            userList.add(new User("user3", 20));
            userList.add(new User("user4", 25));
        		
        		model.addAttribute("list", list);		
        
            return "test/if-unless";
        }
        ```
        
    
    1. **template/test 디렉토리 하위에 if-unless.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d8a77003-faab-425c-94b8-aa921749e019/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>if, unless</h1>
        <table border="1">
            <tr>
                <th>name</th>
                <th>age</th>
            </tr>
            <tr th:each="user : ${list}">
                <td th:text="${user.name}">name</td>
                <td>
                    <span th:text="${user.age}">0</span>
                    <span th:text="'20살미만'" th:if="${user.age lt 20}"></span>
                    <span th:text="'20살미만'" th:unless="${user.age ge 20}"></span>
                </td>
            </tr>
        </table>
        
        <h1>switch</h1>
        <table border="1">
            <tr>
                <th>username</th>
                <th>age</th>
            </tr>
            <tr th:each="user : ${list}">
                <td th:text="${user.name}">name</td>
                <td th:switch="${user.age}">
                    <span th:case="10">10살</span>
                    <span th:case="20">20살</span>
                    <span th:case="*">기타</span>
                </td>
            </tr>
        </table>
        </body>
        </html>
        ```
        
    2. **브라우저 http://localhost:8080/text/if-unless URL로 접근**
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/09f5fca3-7b6c-47d5-84b6-ca1586fa7ea0/Untitled.png)
        
        1. `<span th:text="'20살미만'" th:if="${user.age lt 20}"></span>`
            - if(age < 20) 와 같다
            
        2. `<span th:text="'20살미만'" th:unless="${user.age ge 20}"></span>`
            - if(!(age > 20))과 같다.
        
        1. `<td th:switch="${user.age}">
             <span th:case="10">10살</span>
             <span th:case="20">20살</span>
             <span th:case="*">기타</span>
        </td>`
            - switch 뒤에 선언된 값이 case 일 때 출력
            - “*”는 이외의 모든 경우를 의미
        
        - Thymeleaf는 조건이 맞지 않으면 해당 태그를 생성하지 않는다.

# 주석

---

<aside>
💡 HTML에는 기본적으로 주석문이 존재하지만 Thymeleaf 주석도 따로 존재한다.

</aside>

- **주석 실습**
    
    
    1. **TestController @GetMapping(”comments”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/93335f1e-15b6-4ace-8daa-41acb139c4c5/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/comments")
        public String comments(Model model) {
            model.addAttribute("test", "Sparta");
        
            return "test/comments";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 comments.html 추가**
        - 사진
        
        - 코드
        
        ```java
        
        ```
        
    3. **브라우저 [localhost:8080/text/comments](http://localhost:8080/text/comments) URL 접근**
        - 결과확인
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6e7fbfd5-f2cd-4192-bad3-1850f09374ed/Untitled.png)
            
        - 페이지 소스 확인
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/4009f91b-92e8-4522-9663-55c426279cda/Untitled.png)
            
            1. **표준 HTML 주석**
                - 정상노출
                
            2. Thymeleaf Parser 주석
                - 태그 생성하지 않음, 주로 이걸 사용한다.
                
            3. Thymeleaf Prototype 주석 
                - Thymeleaf가 정상적으로 화면을 그린 경우에만 노출
                - HTML 파일로 열면 주석취급
                
                ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d17d4cba-9765-4553-94d6-a97814099241/Untitled.png)
                

# Block

---

<aside>
💡 Thymeleaf는 대부분 속성을 정의하여 사용하지만
자체 Tag 기능을 제공하기도 한다.

</aside>

- `th:block`
- **block 실습**
    
    
    1. **TestController @GetMapping(”block”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/0cbd1dce-2b08-409f-845a-583e8ec48e9a/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/block")
        public String block(Model model) {
            List<User> userList = new ArrayList<>();
            userList.add(new User("user1", 10));
            userList.add(new User("user2", 15));
            userList.add(new User("user3", 20));
            userList.add(new User("user4", 25));
        
            model.addAttribute("userList", userList);
        
            return "test/block";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 block.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/ea72260e-23ac-40dd-8bbc-e47b956a2859/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
          <meta charset="UTF-8">
          <title>Title</title>
        </head>
        <body>
        <h1>Block</h1>
        <th:block th:each="user : ${userList}">
          <div>
            이름 <span th:text="${user.name}"></span>
            나이 <span th:text="${user.age}"></span>
          </div>
        </th:block>
        </body>
        </html>
        ```
        
    3. **브라우저 localhost:8080/text/block URL 접근**
        - 결과확인
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/f88c3810-8eaa-4d47-9694-4589037e401e/Untitled.png)
            
        
        - 페이지 소스 확인
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/c38aa0b1-c0fb-484e-a3f3-25919b1141b9/Untitled.png)
            
            - 일정 블록을 반복하고 싶을 때 사용하는 Tag이다.
            - 위 그림에서는 div 태그 하위 전체가 반복되도록 만들었다.
                - **th:each 로는 불가능한 기능**

# Inlining

---

<aside>
💡 javascript에서 타임리프를 쉽게 사용할 수 있도록 인라인 기능을 제공하고 있다.

</aside>

- `<script th:inline=”javascript”>`
- **Inlining 실습**
    
    
    1. **TestController @GetMapping(”inline”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/65c56e48-8247-4ad7-9503-95b6430e2884/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/inline")
        public String inline(Model model) {
            User user = new User("user", 10);
        
            model.addAttribute("user", user);
        
            return "test/inline";
        }
        ```
        
    2. **templates/test 디렉토리 하위에 inline.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/7ce58cd1-5335-4432-b364-fd7807c460e0/Untitled.png)
        
        - 코드
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <script>
            var name = [[${user.name}]];
            var age = [[${user.age}]];
            var name2 = /*[[${user.name}]]*/ "test name";
            var user = [[${user}]];
        </script>
        <script th:inline="javascript">
            var name = [[${user.name}]];
            var age = [[${user.age}]];
            // Natural Template
            var name2 = /*[[${user.name}]]*/ "test name";
            // Object
            var user = [[${user}]];
        </script>
        </body>
        </html>
        ```
        
    3. **브라우저 localhost:8080/text/inline URL 접근**
        - 결과확인
            - 빈 페이지가 나오는게 맞습니다.
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/43980484-5f11-43a7-b79f-2f459a40ccf1/Untitled.png)
        
        - 페이지소스
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/b072cdef-71f4-4c8a-952e-788332e1a686/Untitled.png)
            
            - **inline 사용 전**
                - var name = user;
                - Natural Template 그대로 출력
                - 객체 toString()
                
            - **inline 사용 후**
                - var name = “user”;
                - 주석제거, 정상 치환
                - 객체 JSON으로 변환
            
            - inline에는 each도 지원이 된다.
                
                [Tutorial: Using Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.1/usingthymeleaf.html#inlining)
                

# 템플릿

---

<aside>
💡 Web 페이지는 상단, 하단 영역처럼 공통 영역이 있다.
Thymeleaf는 매 페이지마다 공통 영역을 작성하는것이 아닌 템플릿으로 해결할 수 있도록 지원해준다.
마치 HTML을 메서드로 만들어 재사용하는 느낌

</aside>

- 참고 : 프로젝트 패키지 구조가 . 구조로 이루어져있다면?

[intellij package 보기 형식 변경하기](https://lowell-dev.tistory.com/13)

- **템플릿 실습**
    - **주의! TemplateController가 추가되어야 합니다!!**
    
    1. **TemplateController추가 @GetMapping(”template”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/abd72de1-e873-4144-9fd2-961ec86d1592/Untitled.png)
        
        - 코드
        
        ```java
        @Controller
        @RequestMapping("/template")
        public class TemplateController {
        
            @GetMapping("/fragment")
            public String fragment() {
        
                return "fragment/main";
            }
        }
        ```
        
    2. **templates/fragment 디렉토리 하위에 footer.html과 main.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/4a7e8179-9e85-4f73-8c86-f50a0e525115/Untitled.png)
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d408ba2b-acdc-4328-8765-2f9e172e35da/Untitled.png)
        
        - 코드 footer.html
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <body>
        <footer th:fragment="copy">
            Footer
        </footer>
        <footer th:fragment="copyParam (param1, param2)">
            <p>Query Parameter</p>
            <p th:text="${param1}"></p>
            <p th:text="${param2}"></p>
        </footer>
        </body>
        </html>
        ```
        
        - 코드 main.html
        
        ```html
        <!DOCTYPE html>
        <html xmlns:th="http://www.thymeleaf.org">
        <head>
            <meta charset="UTF-8">
            <title>Title</title>
        </head>
        <body>
        <h1>부분 포함</h1>
        <h2>insert</h2>
        <div th:insert="~{fragment/footer :: copy}"></div>
        <h2>replace</h2>
        <div th:replace="~{fragment/footer :: copy}"></div>
        <h2>단순 표현식</h2>
        <div th:replace="fragment/footer :: copy"></div>
        
        <h1>파라미터 사용</h1>
        <div th:replace="~{fragment/footer :: copyParam ('파라미터1', '파라미터2')}"></div>
        </body>
        </html>
        ```
        
    3. **브라우저 localhost:8080/template/fragment URL 접근**
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/9868a3ae-5061-4686-88a7-e7a841f64cfe/Untitled.png)
        
        - 페이지소스
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/3095f884-750f-4029-a79c-b3563feb7da9/Untitled.png)
        
        - `<div th:insert="~{fragment/footer :: copy}"></div>`
            - `<footer th:fragment="copy">`
                - footer에서 th:fragment=”copy” 이름을 가진것을 가져오는코드
            - div 태그안에 footer 삽입
            
        - `<div th:replace="~{fragment/footer :: copy}"></div>`
            - replace 태그 자체를 대체하는것. (div 태그 없는것을 확인)
        
        - `<div th:replace="~{fragment/footer :: copyParam ('파라미터1', '파라미터2')}"></div>`
            - 아래 copyParam과 바뀐다.
            
            ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/027167d4-0730-483d-b4fe-4e6eb3b9f768/Untitled.png)
            
            - 파라미터 사용

# 템플릿 Layout

---

<aside>
💡 일부 코드 조각을 가져오는것이 아니라 레이아웃으로 넘겨서 사용하도록 지원한다.
공통으로 사용하는것 + 추가적인 코드가 필요할 때 주로 사용한다.

</aside>

- 레이아웃은 아주 어렵습니다.. 이해가 안될확률 90%
- **Layout 실습**
    
    
    1. **TemplateController에 @GetMapping(”/layout”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/89a829ce-7e2d-41dd-90cc-08de9feb3b5d/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/layout")
        public String layout() {
        
            return "layout/main";
        }
        ```
        
    2. **templates하위에 layout 디렉토리 추가 후 base.html, main.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/10ff1b9f-0c6e-4c8e-becb-fa9a7276e865/Untitled.png)
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/602907c0-dbfb-45b1-a1ad-ace91e5f5fde/Untitled.png)
        
        - base.html 코드
        
        ```html
        <html xmlns:th="http://www.thymeleaf.org">
        <head th:fragment="common_header(title,links)">
            <title th:replace="${title}">레이아웃 타이틀</title>
        
            <!-- 공통 -->
            <link rel="stylesheet" type="text/css" media="all" th:href="@{/css/sparta.css}">
            <link rel="shortcut icon" th:href="@{/images/sparta.ico}">
            <script type="text/javascript" th:src="@{/sh/scripts/sparta.js}"></script>
        
            <!-- 추가 -->
            <th:block th:replace="${links}"/>
        </head>
        ```
        
        - main.html 코드
        
        ```html
        <html xmlns:th="http://www.thymeleaf.org">
        <head th:replace="layout/base :: common_header(~{::title},~{::link})">
            <title>메인 타이틀</title>
            <link rel="stylesheet" th:href="@{/css/bootstrap.min.css}">
            <link rel="stylesheet" th:href="@{/themes/smoothness/sparta.css}">
        </head>
        <body> 메인 컨텐츠</body>
        </html>
        ```
        
    3. **브라우저 localhost:8080/template/layout URL 접근**
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6adca1a5-a6dd-4123-a975-a2a50981c5ed/Untitled.png)
        
        - 페이지소스
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/6ac68a09-dead-41f0-ac70-9bfd5aa8119a/Untitled.png)
        
        - `common_header(~{::title},~{::link})`
            - `::title` : 현재 페이지의 title Tag들을 전달한다.
            - `::link` : 현재 페이지의 link Tag들을 전달한다.
        
        - Title이 전달한 Title(메인 타이틀)로 변경되었다.
        
        - 공통 부분은 그대로 유지
        
        - 추가 부분에 전달한 `<link>` 들이 포함
- **Layout 확장 실습**
    
    
    1. **TemplateController에 @GetMapping(”/extend”) 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/ecc317c8-eca5-42ff-987c-39e77a853fb5/Untitled.png)
        
        - 코드
        
        ```java
        @GetMapping("/extend")
        public String extend() {
        
            return "extend/main";
        }
        ```
        
    2. **templates하위에 extend 디렉토리 추가 후 layout.html, main.html 추가**
        - 사진
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/4eab2f6f-1856-49a6-bbda-04bf183e255b/Untitled.png)
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/d7d7d6b2-577f-45c3-9d1b-23e42279ccd8/Untitled.png)
        
        - **layout**.html 코드
        
        ```html
        <!DOCTYPE html>
        <html th:fragment="layout (title, content)" xmlns:th="http://www.thymeleaf.org">
        <head>
            <title th:replace="${title}">Layout Title</title></head>
        <body>
        <h1>Layout</h1>
        <div th:replace="${content}">
            <p>Content</p></div>
        <footer>
            Footer
        </footer>
        </body>
        </html>
        ```
        
        - main.html 코드
        
        ```html
        <!DOCTYPE html>
        <html th:replace="~{extend/layout :: layout(~{::title},~{::section})}" xmlns:th="http://www.thymeleaf.org">
        <head>
            <title>Main Title</title>
        </head>
        <body>
        <section>
            <p>Main Contents</p>
            <div>Contents2</div>
        </section>
        </body>
        </html>
        ```
        
    3. **브라우저 localhost:8080/template/extend URL 접근**
        - 결과확인
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/1f7a9863-f221-4e82-8451-f0fe3c233ce7/Untitled.png)
        
        - 페이지소스
        
        ![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/83c75a39-3aba-4ba4-a792-7aefe4b07895/dc428cfc-014d-4bbf-bb77-e332a9175a40/Untitled.png)
        
        - `<html th:fragment="layout (title, content)">`
            - 기본 레이아웃을 가지고 있다.
            - 위 레이아웃을 베이스로 필요한 부분을 전달하여 부분부분 변경한다.
            
        - `<html th:replace="~{extend/layout :: layout(~{::title},~{::section})}">`
            - main.html의 <html> 태그 자체를 layout.html의 <html> 태그로 변경한다.
