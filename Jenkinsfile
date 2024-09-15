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
                    # Add actual build commands here, e.g. mvn clean install
                '''
            }
        }

        stage('Test') {
            steps {
                echo 'Testing..'
                sh '''
                    # Add test commands here, e.g. mvn test
                    echo 'running tests..'
                '''
            }
        }

        stage('Deliver') {
            steps {
                echo 'Delivering application..'
                // Add delivery commands here
            }
        }
    }

    post {
        always {
            // Post build actions such as archiving artifacts or publishing test results
        }
    }
}
