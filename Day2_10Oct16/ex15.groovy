///GuessTheNumber

int numberToGuess = Math.abs(1000 * Math.random())
int userAnswer = 0
int guess = 0

println ("Try to guess my number!")
while(true){
	print "Tell me a number: "
	str = System.console().readLine()
	userAnswer = Integer.parseInt(str)

	if(userAnswer > numberToGuess){
		println("No! My number is lower.")
		guess ++
	}else if(userAnswer < numberToGuess){
		println("No! My number is higher.")
		guess ++
	}else{
		println("CORRECT!")
		guess ++
		println("You needed " + guess + " guesses.")
		break;
	}
}

