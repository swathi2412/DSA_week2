public class count_digit {
    public static void main(String[] args) {
       
        int n =9879;
        int count = 0;
        while(n>0){
          int ld = n%10;
          count = count + 1;
          n = n/10;
         
        }
        System.out.println(count);

        
    
}
}
