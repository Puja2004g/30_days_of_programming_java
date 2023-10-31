//Complete this code or write your own from scratch
import java.util.*;
// import java.io.*;

class day_8_dictionaries_and_maps{
    public static void main(String []argh){
        Map<String, Integer> phonebook = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            Integer phonenumber= phonebook.get(s);
            if(phonenumber!=null){
                System.out.println(s + "=" + phonenumber);
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
