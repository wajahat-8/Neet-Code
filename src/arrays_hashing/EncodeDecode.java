package arrays_hashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs){
        StringBuilder encoded= new StringBuilder();
        for (String str:strs){
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();

    }
    public List<String> decoded(String str){
        List<String> decoded=new ArrayList<>();
        int i=0;
        while (i<str.length()){
            int j=str.indexOf('#',i);
            int length=Integer.parseInt(str.substring(i,j));
            i=j+1;
            decoded.add(str.substring(i,i+length));
            i+=length;
        }
        return decoded;

    }
}
