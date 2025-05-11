package arrays_hashing;

public class MyHashSet {
    private Integer[] hashSet;
    private final int SIZE=10007;
    public MyHashSet(){
        hashSet=new Integer[SIZE];
    }
    private int hashing(int key){
        return key%SIZE;
    }
    public  void add(int key){
        int index=hashing(key);
        while (hashSet[index]!=null&&hashSet[index]!=key){
            index=(index+1)%SIZE;
        }
        hashSet[index]=key;
    }
    public void remove(int key){
        int index=hashing(key);
        while (hashSet[index]!=null){
            if (hashSet[index]==key){
                hashSet[index]=-2;
            }
            index=(index+1)%SIZE;
        }
    }
    public boolean contains(int key){
        int index=hashing(key);
        while (hashSet[index]!=null){
            if (hashSet[index]==key){
                return true;
            }
            index=(index+1)%SIZE;
        }
        return false;
    }
}
