pipeline{
    agent any

    tools{
        maven '3.8.8'
        jdk 'jdk17'
    }
    stages{
        stage('Build Maven'){
            steps{
                bat 'mvn --version'
                bat 'java --version'
            }
        }
    }
}