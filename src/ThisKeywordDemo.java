import java.util.Scanner;

class ThisDemo {
    int value;

    void setValue(int value){
        this.value=value;
    }

    void display(){
        System.out.println("Value: "+value);
    }

}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: Read the integer input
        int n=sc.nextInt();

        ThisDemo th=new ThisDemo();
        th.setValue(n);
        th.display();
        
        // TODO: Create ThisDemo object
        // TODO: Call setValue() with the input
        // TODO: Call display()
    }
}
