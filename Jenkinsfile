pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'jenkins/build.sh'
            }
        }
        stage('Deploy') {
            steps {
                sh 'jenkins/deploy.sh'
            }
        }
    }
}
