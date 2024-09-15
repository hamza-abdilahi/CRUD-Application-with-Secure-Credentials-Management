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
                echo 'Building..'
                sh '''
                    echo 'doing build stuff..'
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                    echo 'running tests..'
                '''
            }
        }

        stage('Deliver') {
            steps {
                echo 'Delivering application..'
            }
        }
    }

}
