public class Main {
    public static void main(String[] args) {
        int m, n, count=0, totalPrime=0;
        m=10;
        n=30;
        for(int i= m; i<=n; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                    break;
                   }
                }
            if(count==0){
                System.out.println(i);
                totalPrime++;}
            count=0;
        }
        System.out.println("Total prime number = " +totalPrime);
    }
}