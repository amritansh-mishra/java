package Basic;
public class fabonacci_no {
    public static void main(String[] args) {
        int n1=0;
        int n2= 1;
        int n3;
        for (int i=0; i <11; i++) { 
            
            System.out.println(n1);
            n3=n1+n2; 
            n1=n2;
            n2=n3;
                
        }  
    }
}