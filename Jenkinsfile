pipeline{
	agent any
parameters{

	booleanParam(name: 'RUN_FAILURE',defaultValue: false,description:'Run Failure Sceanrio?')
}
//Runs every 7 days
triggers{
	cron('H H * * 0')
}
stages{

	stage('Build'){
		steps{
			echo 'compiling Java program....'
			bat 'javac HelloApp.java'
	}
	}


	stage('Test -Positive Scenario'){
		steps{
			echo 'Running Hello App Java program with Success Scenario....'
			bat 'java HelloApp'
	}
	}

	stage('Test - Faliure Scenario'){

		when{
			expression{params.RUN_FAILURE}
				}
		steps{
			echo 'Running Hello App Java program with Failure Scenario....'
			bat 'java HelloApp fail'
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