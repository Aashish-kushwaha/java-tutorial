public class evenorodd {
    public static void main(String k[])
    {
        int n=100;

        //using reminder method tc:O(1) sc: O(1)
    if(n%2==0)
    {
        System.out.println("even");
    }else{
        System.out.println("odd");
    }

    //using bitwise AND operator: the last bit of all the odd number is 1, while all the  even number is 0. so when we perform bitwise AND operation with 1 , odd number gives 1 and even number gives 0. tc:O(1) sc:O(1)
    if((n&1)==0)
    {
        System.out.println("even");
    }else{
        System.out.println("odd");
    }

    }
}
