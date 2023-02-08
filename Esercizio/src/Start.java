
public class Start {
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
        public static void main (String[]args){
            int i = 0;
            while(i>=0){
                System.out.println("I am in loop");
                wait(1000);
                i++;
            }
        }
}



