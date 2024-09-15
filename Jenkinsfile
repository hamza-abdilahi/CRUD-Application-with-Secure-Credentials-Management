pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'dev', url: 'https://github.com/hamza-abdilahi/CRUD-Application-with-Secure-Credentials-Management.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deliver') {
            steps {
                echo 'Delivering application...'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
