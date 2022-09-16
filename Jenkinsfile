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
                sh 'docker run -d -ti -name test-application test-app'
            }
        }
    }
}
