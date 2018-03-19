
public class HotPotato
{
    private Queue<String> q; 
    public HotPotato(String names){
        q = new Queue<>(); 
        for(String s: names.split(" ")){
            q.enqueue(s); 
        }
        System.out.println(q); 
    }
    
    public String play()  throws InterruptedException {
        long start = System.currentTimeMillis(); 
        String curName = ""; 
        String s = "";
        while(System.currentTimeMillis() - start < 1000){
            curName = q.dequeue();
            s = s + curName + " has the potato.\n";
            Thread.sleep((int)(10*Math.random()));
            q.enqueue(curName); 
        }
        System.out.println(s); 
        return curName + " lost";
    }
    
    public static void main(String[] args) throws InterruptedException{
        HotPotato hp = new HotPotato("A B C D E F G"); 
        String loser = hp.play(); 
        System.out.println(loser); 
    }
}
