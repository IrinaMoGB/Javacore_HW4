package Part2;

import java.util.HashMap;

public class PhoneBook {
        private HashMap<String,String> directory = new HashMap<>();

        public void add(String phone, String surname){
          directory.put(phone, surname) ;
        }
        public String getPhoneNumber(String surname) {
            if(directory.containsValue(surname)) {
                String result = "Номер телефона: ";
                for(String key: directory.keySet()){
                    if(directory.get(key).equals(surname))result += key + "; ";
                }
                return result;
            } else return "Не найдено";
        }

    }
