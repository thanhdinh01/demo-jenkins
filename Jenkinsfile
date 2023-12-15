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
            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t thanhdinh01/dev-integration:v1 .'
                }
            }
        }
        stage('Push Docker Image to Hub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhubpw', variable: 'dockerhubpw')]) {
                        bat 'docker login -u thanhdinh01 -p %dockerhubpw%'
                    }
                    bat 'docker push thanhdinh01/dev-integration:v1'
                    bat 'docker image prune'
                }
            }
        }
        stage('Test'){
            steps{
                bat 'mvn test'
            }
            post{
                always{
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }

    }
}