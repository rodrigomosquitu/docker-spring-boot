pipeline {
  environment {
    registry = "rodmosq/docker-spring-boot"
    registryCredential = "dockerhub"
  }
  agent any
  stages {
    stage('Cloning Git') {
      steps {
        git 'https://github.com/rodrigomosquitu/docker-spring-boot.git'
      }
    }
    stage('Building image') {
      steps{
        script {
          docker.build registry + ":$BUILD_NUMBER"
        }
      }
    }
    stage('Runimage') {
      steps{
        sh "docker run -p 8085:8085 " + registry + ":$BUILD_NUMBER"
      }
    }
  }
}