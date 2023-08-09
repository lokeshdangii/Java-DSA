
// Program for Linear Search

public class LinearSeach {
    
    public static void linear_Search(int numbers[],int key){
        
        for(int i=0;i<numbers.length;i++){
            if(key==numbers[i]){
               System.out.println("key element is found at index: " + i );
            }     
        }
    }
    
    public static void main(String args[]){
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14};
        int key = 10;
     
           linear_Search(numbers, key);
    }
}
