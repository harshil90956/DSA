
public class OperationOfBits {

    public static void GetIthBit(int n,int i){
        int BitMask = 1<<i;
        System.out.println(n & BitMask);
    }

    public static void ClearLastIthBit(int n,int i){
        int BitMask = ~0<< i;
        System.out.println(n & BitMask);
    }
    
    public static void main(String[] args) {
        ClearLastIthBit(28, 3);
    }
}
