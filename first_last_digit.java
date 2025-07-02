public class first_last_digit {
     public static void main(String[] args) {
       
        int n =12345;
        int sum = n%10;
        int count = 0;
        while(n>0)
        {
            if(n==n%10 && count >0)
            {
                sum = sum + n%10;
            }
             count ++;
             n=n/10;
        }
        
        System.out.println(sum);
        
        

}

        
    
}

