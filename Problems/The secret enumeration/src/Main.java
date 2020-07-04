
public class Main {

    public static void main(String[] args) {
        Secret arr[] = Secret.values();
        int count = 0;
        String s;

        for(int i =0; i < arr.length; i++){
            s = arr[i].toString();
            if ( s.startsWith("STAR")){
                count++;
            }
        }
        System.out.println(count);
    }
}

/* At least two constants start with STAR
enum Secret {
    STAR, CRASH, START, // ...
}
*/