class Department{
	static final String[] faculty = {"Akshay fajge","Balaji Shetty","Ubaid Ahmed","Megha mam","Pakle"};
	
	Faculty getFaculty(String fname){
	 for(int i=0;i<faculty.length;i++){
	 if(fname.contains(faculty[i].toLowerCase())){
	  Faculty f = new Faculty("Akshay Fajge");
	
	  return f;
	  }
	  else{
	  try{
	  throw new FacultyNotFoundException("No name Found in Faculty");
	  }
	  
	  catch(FacultyNotFoundException ae){
	  ae.printStackTrace();
	  }
	  }
	  }
	  return null;
	}

}


class Faculty{
   String fname;
	Faculty(String fname){
	this.fname = fname;
	}

}

class FacultyNotFoundException extends Exception{
	FacultyNotFoundException(String s){
	super(s);
	}

}
//void->return;  int->return 0; Faculty->return null
