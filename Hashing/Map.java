
import java.util.*;
public class Map {
    static class HashMap<k,v>{//generic
        private class Node{
            K key;
            V value;

            public Node(K key,V value){
                this.key=key;
                this.value=value;

            }
        }
             private int size;//n
             private int N;
             private LinkedList<Node> buckets[];//N

             @SuppressWarnings("unchecked")
             public HashMap(){
                this.N=4;
                this.buckets=new LinkedList[4];
                for(int i=0;i<4;i++){
                    this.buckets[i]=new LinkedList<>();
                }
             }
             private int hashFunction(K key){
                 int hc=key.hashCode();
             return  Math.abs(hc) % N;
             }
             private int SearchInLL(K key,int bi){
                LinkedList<Node> ll=buckets[bi];
                int di=0;

                for(int i=0;i<ll.size();i++){
                    Node node=ll.get(i);
                    if(node.key==key){
                        return di;
                    }
                    di++;
                }
             }
             private void rehash(){
                ArrayList<Node> oldBuck[]=buckets;
                buckets=new LinkedList[N*2];
                N=2*N;
             }
             public void put(K key,V value){
                int bi=hashFunction(key);
                int di=SearchInLL(key);//valid ;-1
                if(di!=-1){
                    Node node=buckets[bi].get(di);
                    node.value=value;
                }else{
                    buckets[bi].add(new Node(key,value));
                    size++;
                }
                   double lambda=size/N;
                   if(lambda>2.0){
                    rehas();
                   }
             }
             public boolean containsKey(K key){
                return false;
             }
             public V remove(K key){
                return  null;
            
             }
             public V get(K key){
                return null;
             }
             public ArrayList<K> keySet(){
                return null;
             }
        }
    }

