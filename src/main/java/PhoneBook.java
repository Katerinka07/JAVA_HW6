import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
    public void add(String name,Integer telephone) {
        if (phoneBook.containsKey(name)) {
            ArrayList phoneNum = phoneBook.get(name);
            phoneNum.add(telephone);
            phoneBook.put(name, phoneNum);
        } else {
            ArrayList<Integer> phoneNum = new ArrayList<>();
            phoneNum.add(telephone);
            phoneBook.put(name, phoneNum);
        }
    }
    public ArrayList<Integer> find(String name) {
       return phoneBook.getOrDefault(name, new ArrayList<>());
    }
    public void getPhoneBook() {
        ArrayList<Map.Entry<String, ArrayList<Integer>>> list = new ArrayList<>(phoneBook.entrySet());
        list.sort((o1, o2) -> o2.getValue().size() - o1.getValue().size());
        for (Map.Entry<String,ArrayList<Integer>> entry: list) {
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }
    }
}
