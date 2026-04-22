pipeline {
  agent any
  tools{
    maven 'MAVEN_HOME'
  }
  stages{
    stage('welcome message'){
      steps{
        echo 'Welcome to Jenkins'
      }
    }
    stage('stage clean'){
      steps{
        bat 'mvn clean'
      }
    }
    stage('test case'){
      steps{
        bat 'mvn test'
      }
    }
    stage('buid stage'){
      steps{
        bat 'mvn install'
      }
    }
    stage('Final stage'){
      steps{
        echo 'Final stage succesfull'
      }
    }
  }
}
        
