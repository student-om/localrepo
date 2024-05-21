import java.util.Random;
class RegNoGen{

	public String RegNoGenerator(){
	Random random = new Random();
	int year = 2000 + random.nextInt(24);
	
	String[] arr = {"BIT","BCS","BME","BEE"};
	String sss = arr[random.nextInt(arr.length)];
	
	int bbb = random.nextInt(61);
	String last = bbb.format("%03d",sss);
	}

}
