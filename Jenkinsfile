pipeline{
    agent any

    tools{
        maven '3.8.8'
        jdk 'jdk17'
    }
    stages{
        stage('Login docker'){
            steps{
                withCredentials([string(credentialsId: 'my-credentials', variable: 'my-credentials')]) {
                    bat 'docker login -u thanhdinh01 -p %my-credentials%'
                }
            }
        }

    }
}