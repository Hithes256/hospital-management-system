pipeline {
    agent any

    tools {
        jdk 'Java-21'
        maven 'Maven-3'
    }

    environment {
        IMAGE_NAME = "hospital-app"
        CONTAINER_NAME = "hospital-container"
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Hithes256/hospital-management-system.git'
            }
        }

        stage('Build & Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t %IMAGE_NAME% .'
            }
        }

        stage('Docker Deploy') {
            steps {
                bat '''
                docker stop %CONTAINER_NAME% || exit 0
                docker rm %CONTAINER_NAME% || exit 0
                docker run -d -p 9090:9090 --name %CONTAINER_NAME% %IMAGE_NAME%
                '''
            }
        }
    }
}
