pipeline {
    agent any

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/khushii007/ci-demo.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'  // Change this if using Gradle: 'gradle build'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Success') {
            steps {
                echo "Build & Tests Passed! 🎉"
            }
        }
    }
}

