package Ramdom;

import java.util.Random;

public class jobRandom {
	public String getRandTestString(){
		 
	     String RandomNames[] = { "���Ǿ�","�ù�","����","�ǻ�","�ù�" };
	 
	 
	    Random oRandom = new Random();
	    int randNum = oRandom.nextInt(RandomNames.length);     
	 
	    //Boolean rand_true_false = oRandom.nextBoolean(); //( �������� �� ������ �̾Ƴ� )
	    
	 
	    return RandomNames[randNum];
	}
}
