pipeline {
    agent any

    environment {
        POSTGRES_USER = 'postgres'
        POSTGRES_PASSWORD = ''
        POSTGRES_DB = 'mydatabase'
    }

    stages {
        stage('Start PostgreSQL') {
            steps {
                script {
                    //
                    sh '''
                    docker run -d --name postgres-container \
                    -e POSTGRES_USER=${POSTGRES_USER} \
                    -e POSTGRES_PASSWORD=${POSTGRES_PASSWORD} \
                    -e POSTGRES_DB=${POSTGRES_DB} \
                    -p 5432:5432 postgres
                    '''
                }
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Stop PostgreSQL') {
            steps {
                sh 'docker rm -f postgres-container'
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished!'
        }
    }
}