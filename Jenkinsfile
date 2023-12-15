pipeline{
    agent any

    tools{
        maven '3.8.8'
        jdk 'jdk17'
    }
    stages{
        stage('Build Maven'){
            steps{
                git credentialsId: 'githubpw', url: 'https://github.com/thanhdinh01/demo-jenkins.git'
                bat 'mvn clean install'
            }
        }


    }
}