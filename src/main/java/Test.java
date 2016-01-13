/**
 * 
 */

/**
 * @author zhouxin
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int stayTime = 60;
		int day = stayTime/1440;
		int hour = 0;
		if(day > 0){
			hour = stayTime%1440/60;
		}else{
			hour = stayTime/60;
		}
		int minutes = stayTime%60;
		
		String str = day + "天" + hour + "小时" +  minutes +"分钟";
		System.out.println(str);
	}

}
