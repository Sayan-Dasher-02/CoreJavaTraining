public class duplicateElement 
{
    public static void main(String[] args) 
    {
        int [] arr = {12, 28, 25, 15, 25, 12, 18, 15, 23};  
        System.out.println("Duplicate Elements in The Array = ");   

        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j]) 
                { 
                    System.out.println(arr[j]);  
                }
            }  
        }  
    }
}
