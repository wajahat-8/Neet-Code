package arrays_hashing;

public class MyHashMap {
    private static  final int SIZE=10007;
    private static final int EMPTY=-1;
    private static final int DELETED=-2;
    private int [] keys;
    private int [] values;
    public MyHashMap(){
        keys=new int[SIZE];
        values=new int[SIZE];
        for (int i=0;i<SIZE;i++){
            keys[i]=EMPTY;
        }
    }
    private int hashing(int key){
        return key%SIZE;
    }
    public void put(int key,int value){
        int index=hashing(key);
        while (keys[index]!=EMPTY && keys[index]!=DELETED&&keys[index]!=key){
            index=(index+1)%SIZE;
        }
        keys[index]=key;
        values[index]=value;
    }
    public int get(int key){
        int index=hashing(key);
        while (keys[index]!=EMPTY){
            if (keys[index]==key){
                return values[index];
            }
            index=(index+1)%SIZE;
        }
        return -1;

    }
    public void remove(int key){
        int index=hashing(key);
        while (keys[index]!=EMPTY){
            if(keys[index]==key){
                keys[index]=DELETED;
                return;
            }
            index=(index+1)%SIZE;
        }
    }
}
