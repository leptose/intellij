

public class Gugudan {
    public static int[] calcul(int times){
        int[] result=new int[9];
        for(int i=0;i<result.length;i++){
            result[i]=times*(i+1);
        }
        return result;
    }
    public static void print(int[] result){
        for(int i:result){
            System.out.println(i);
        }
    }
}
