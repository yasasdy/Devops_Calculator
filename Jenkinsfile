#!groovy
pipeline {
    agent any
   stages {
    stage('Running Maven and Generating .jar file') {
  steps {
       sh 'mvn clean package -DskipTests'
       }
     }
     stage('BUILD Docker Images'){
     steps{
      sh 'docker build -t durgayasasvi/devopscalc:latest .'
     }
     }
     stage('PUBLISH to DockerHub')
    {
        steps
        {
            withDockerRegistry([ credentialsId: "dockerhub", url: "" ])
            {
              sh 'docker push durgayasasvi/devopscalc:latest'

            }
        }
    }
    stage('Deploy using Rundeck') {
      agent any
      steps {
        script {
          step([$class: "RundeckNotifier",
          rundeckInstance: "Rundeck",
          shouldFailTheBuild: true,
          shouldWaitForRundeckJob: true,
          options: """
            BUILD_VERSION=$BUILD_NUMBER
          """,
          jobId: "d353680d-7161-48ed-a490-c6e89b40a510"])
        }
      }
    }
   }
 }
