pipeline {
    agent any

    stages {
        stage ('Build') {
            steps {
                sh 'docker build -t test-app .'
            }
        }

        stage ('Deploy') {
            steps {
                sh 'docker run -d --name test-application -p 8088:8080 test-app'
            }
        }
    }
}
