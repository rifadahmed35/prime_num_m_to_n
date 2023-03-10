public class Main {
    public static void main(String[] args) {
        int m, n, count=0;
        m=2;
        n=15;
        for(int i= m; i<=n; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    count++;
                    break;
                   }
                }
            if(count==0)
                System.out.println(i);
            count=0;
        }
    }
}