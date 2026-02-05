public class odd {
//     public static void main(String[] args) {
//         int sum=0;
//         int c=0;
//         for(int i=1;i<100;i=i+2){
//             c++;
//             sum=sum+i;

//         }
//         System.out.println(c);
//         System.out.println(sum);

//     }

// }
public static void main(String[] args) {
    int[] num=new int[5];
    num[0]=2;
    num[1]=4;
    num[2]=5;
    num[3]=12;
    num[4]=33;
    int min=10000;
    int max=-9786;

    
    for(int i=0;i<num.length;i++){
        if(num[i]>max)
        max=num[i];

    }

    System.out.println(max);
    for(int i=0;i<num.length;i++){
        if(num[i]<min)
        min=num[i];

    }

    System.out.println(min);
    

}
}