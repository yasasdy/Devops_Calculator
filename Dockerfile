FROM openjdk:8-alpine
COPY target/Devops_Calculator_DurgaYasasvi-1.0-SNAPSHOT.jar /home/Devops_Calculator_DurgaYasasvi-1.0-SNAPSHOT.jar
CMD ["java","-cp","/home/Devops_Calculator_DurgaYasasvi-1.0-SNAPSHOT.jar", "Main"]
