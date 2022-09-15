pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('cicd-demo')
	}

	stages {

		stage('Build') {

			steps {
				sh 'docker build -t martel7/ct360:latest .'
			}
		}

		stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}

		stage('Push') {

			steps {
				sh 'docker push dusan77/ct360:latest'
			}
		}
	}

	post {
		always {
			sh 'docker logout'
		}
	}

}
