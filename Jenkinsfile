pipeline {
    agent any

    stages {
        stage('Compilación') {
            steps {
                echo 'Compilando el proyecto...'
                sh 'mvn compile'
            }
        }
        stage('Pruebas') {
            steps {
                echo 'Ejecutando pruebas...'
                sh 'mvn test'
            }
        }
        stage('Despliegue Simulado') {
            steps {
                echo '¡Despliegue simulado exitoso!'
            }
        }
    }
}