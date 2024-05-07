//exception handling
interface Voter{
	void castVote();
}

interface EC {
	void checkVailidityOfVoter(int age) throws InvalidVoter;
}


class ECIndia implements Voter, EC{
	final int minAge;
	
	ECIndia(int minAge){
		this.minAge = minAge;
	}

	public void castVote(){
		System.out.println("In CastVote:: ECIndia");	
	}
	
	public void checkVailidityOfVoter(int age) throws InvalidVoter{
		if(age < minAge){
			throw new InvalidVoter("Invalid Voter");
		}
	}
}

class ECBrazil implements Voter, EC{
	public void castVote(){
		System.out.println("In CastVote:: ECBrazil");	
	}
	
	public void checkVailidityOfVoter(int age){
		
	}
}


class Election2024{

	public static void main(String ...args){
		ECIndia ecIndia = new ECIndia(18);
		ecIndia.checkVailidityOfVoter(4);
	}
}
//agar RunTimeException likha to main method ke side mein throws nahi likha to bhi chalega
//it occurs at Runtime not compile-time
//Exception is super class of RuntimeException. but main ke baju me throws nahi likha to agar (Exception use kara hota at linne 50) to wo compile time me hi error de deta ki dekho yahan problem hai karke..
class InvalidVoter extends RuntimeException{
	InvalidVoter(String error){
		super(error);
	}
}

