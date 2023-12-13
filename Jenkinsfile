pipeline {
    agent any
    triggers{
        githubPush()
    }
    stages {
        stage('Clone') {
            steps {
                git 'https://github.com/thanhdinh01/demo-jenkins.git'
            }
        }
    }
}