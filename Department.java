class Department{
	static final String[] faculty = {"Akshay fajge","Balaji Shetty","Ubaid Ahmed","Megha mam","Pakle"}
	
	Faculty getFaculty(String fname){
	 for(i=0;i<faculty.length;i++){
	 if(fname.equalsIgnoreCase(arr[i])){
	  Faculty f = new Faculty("Akshay Fajge");
	
	  return f;
	  }
	  else{
	  throw new FacultyNotFoundException;
	  }
	  }
	}

}


class Faculty{
   String fname;
	Faculty(String fname){
	this.fname = fname;
	}

}
