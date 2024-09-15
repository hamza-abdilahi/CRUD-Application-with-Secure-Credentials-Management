pipeline {
    agent any

    environment {
        JAVA_HOME = tool name: 'JDK17'
        MAVEN_HOME = tool name: 'Maven3.9.8'
        PATH = "${env.MAVEN_HOME}/bin:${env.JAVA_HOME}/bin:${env.PATH}"
    }

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
