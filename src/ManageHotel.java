import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ManageHotel {
    Map<String,Hotel> listHotel = new TreeMap<>();
    Set<String> keyList = listHotel.keySet();
    public void addPerson(Hotel hotel,String peopleId){
        listHotel.put(peopleId,hotel);
    }
    public void displayAll(){
        for (String key: keyList) {
            System.out.println(listHotel.get(key));
        }
    }
   public void returnTotalMoneyByIdOfPerson(String peopleID){
        try {
            for (String key : keyList) {
                if (peopleID.equalsIgnoreCase(listHotel.get(key).getPerson().getPeopleId())) {
                    System.out.println(listHotel.get(key));
                    System.out.println("Số tiền bạn cần trả là: " + listHotel.get(key).getTotalMoney());
                    listHotel.remove(listHotel.get(key));
                    return;
                }
            }
            System.out.println("Not exits");
        }catch (Exception e){
            System.out.println(e);
        }
   }
}
