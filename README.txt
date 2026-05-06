HOW TO RUN

1. Install Apache Tomcat 9
2. Copy servlet-api.jar from:
   apache-tomcat-9/lib
   into project lib folder

3. Compile:
   javac -cp "lib/*" -d WEB-INF/classes src/*.java

4. Copy project folder into:
   apache-tomcat-9/webapps

5. Start Tomcat:
   apache-tomcat-9/bin/startup.bat

6. Open browser:
   http://localhost:8080/OnlineQuizApp/index.html

LOGIN:
username: admin
password: 1234
