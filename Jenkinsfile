pipeline {
    agent any
    
    tools {
        maven "maven353"
    }
    
    stages {
        stage("Compile") {
            steps {
                sh "mvn compile"
            }
        }
        stage("Unit test") {
            steps {
                sh "mvn test"
            }
        }
    }
}
