package BTQUANLYSV;

import java.util.HashMap;
import java.util.Map;

public class ManageStudent {
    HashMap<String, Student> hashMap;

    public ManageStudent() {
        this.hashMap = new HashMap<>();
    }

    public void display() {
        for (Map.Entry me : hashMap.entrySet()) {
            System.out.println("Key:" + me.getKey() + "& Value:" + me.getValue());
        }
    }

    public void addStudent(String key, Student student) {
        hashMap.put(key, student);
    }
}
