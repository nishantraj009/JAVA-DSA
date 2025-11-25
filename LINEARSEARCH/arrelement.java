public class arrelement{
    public static void ArrElement(int num[]){
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");

        }
    }
    public static void main(String[] args){
        int num[] = {1,3,5,7};
        ArrElement(num);

    }
}