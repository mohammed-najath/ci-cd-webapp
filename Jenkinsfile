pipeline{
	agent any

//Runs every 7 days
triggers{
	cron('H H * * 0')
}
stages{
	stage('Checkout Code'){
		steps{
			git branch:'master',url:'https://github.com/mohammed-najath/ci-cd-webapp.git'
	}
	}


	stage('Build'){
		steps{
			sh 'mvn clean install'
	}
	}


	stage('Test'){
		steps{
			sh 'mvn test'
	}
	}

	stage('Deploy'){
		steps{
			echo 'Deploying application......'
	}
	}
}


post{

	success{
		echo 'Build Successful!'
		}

	failure{
		echo 'Build Failed!'	
	}
}
}