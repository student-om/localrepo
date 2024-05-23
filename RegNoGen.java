import java.util.Random;
class RegNoGen{

	public String RegNoGenerator(){
	Random random = new Random();
	int year = 2000 + random.nextInt(24);
	
	String[] arr = {"BIT","BCS","BME","BEE"};
	String sss = arr[random.nextInt(arr.length)];
	
	int bbb = random.nextInt(61);
	String last = String.format("%03d",bbb);
	
	String regNumber = year + sss + last;
	//10 + "20" => "1020" ----> one of the most imporatant result
	return regNumber;
	}
	
	public String[] RegNosGenerator(int size){
	String[] arr = new String[size];
	 for(int i=0;i<arr.length;i++){
	 arr[i] = this.RegNoGenerator();
	 }
	 
	 return arr;
	}
	
	public static void main(String args[]){
	 RegNoGen r = new RegNoGen();
	 String[] n = r.RegNosGenerator(200);
	 System.out.println(n[0]);
	
	
	}

}
