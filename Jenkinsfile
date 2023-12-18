pipeline{
    agent any

    tools{
        maven '3.8.8'
        jdk 'jdk17'
    }
    stages{
        stage('Login docker'){
            steps{
                withCredentials([string(credentialsId: 'credentials-text-secret', variable: 'credentials-text-secret')]) {
                    bat 'docker login -u thanhdinh01 -p %credentials-text-secret%'
                }
            }
        }

    }
}