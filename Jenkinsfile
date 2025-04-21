
pipeline{
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage("build"){
            steps{
                echo 'building something here..'
                sh "mvn install"
            }
        }
        stage("test"){
            when{
                expression{
                    BRANCH_NAME == 'dev'
                }
            }
            steps{
                echo 'testing something. .'
            }
        }
        stage("deploy"){
            steps{
                echo 'deploying something!!'
            }
        }
    }
}