package mafia_TimeTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class voting {

   public static void main(String[] args) {

      String[] data = {"���", "����", "����", "���", "����"};

      Map<String, Integer> map = new HashMap<>();
     
    
      for(int i=0; i<data.length; i++) { 
         if(map.containsKey(data[i])) { 
           int value = (int)map.get(data[i]); 
            map.put(data[i], value + 1);
         } else {
            map.put(data[i], 1);
         }
      }
      
      List<String> keySetlist = new ArrayList<>(map.keySet());
      Collections.sort(keySetlist, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
      for(String key : keySetlist) {
			System.out.println("key : " + key + " / " + "value : " + map.get(key));
		}
      
      

      System.out.println(map);



      Iterator it = map.entrySet().iterator();

      
      while(it.hasNext()) {
      
         Map.Entry entry = (Map.Entry)it.next();
         int value = (int)entry.getValue();
         
//         int temp = entry.getValue();

         if((int)entry.getValue() > 5/2.0) { // 50000 41000 32000 31100 22100 21110 11111  
            System.out.println(entry.getKey() + "�� �׿����ϴ�.");
            break;
         }
         else if((int)entry.getValue() == 2) { //2 1 1 
            System.out.println(entry.getKey() + "�� �׿��������ϴ�." ); 
            break;
         } 

         else
            System.out.println(entry.getKey() + " �ƹ��ϵ� �Ͼ�� �ʾҽ��ϴ�."); // 1 1 1 1 1 / 2 2 1
            break;
      }
   }


}   



//      Iterator it = map.entrySet().iterator();
//
//      while(it.hasNext()) {
//         Map.Entry entry = (Map.Entry)it.next();
//         int value = (int)entry.getValue();
//
//         if((int)entry.getValue() == 5 || (int)entry.getValue() == 4 || (int)entry.getValue() == 3) {
//            System.out.println(entry.getKey() + "�� �׿����ϴ�.");
//         }
//         else if((int)entry.getValue() == 1) { // 1 1 1 1 1
//            System.out.println(entry.getKey() + " �ƹ��ϵ� �Ͼ�� �ʾҽ��ϴ�.");
//         } 
//
//         else {
//            if((int)entry.getValue() == 2) { 
//               System.out.println(entry.getKey() + "�� �׿����ϴ�."); // 2 1 1 1 
//            }
//            else {
//               System.out.println(entry.getKey() + " �ƹ��ϵ� �Ͼ�� �ʾҽ��ϴ�."); // 2 2 1
//            }
//         }
//      }


//      Map.Entry entry = (Map.Entry)it.next();
//      int value = (int)entry.getValue();
//      
//      
//      System.out.println(entry.getKey());
//      System.out.println(entry.getValue());






//      List<String> list = Arrays.asList("����", "����", "���", "����", "�ڹ�");
//       
//      String str = "����";
//      
//      int[] counts = new int[5];
//      
//      // counts = ["����", "����", "���", "����", "�ڹ�"]
//      
//      
//      for(int i=0; i<list.size(); i++) {
//         if(str.equals(list.get(i))) {
//            counts[]
//            
//         }
//      }