import java.util.Arrays;

public class Permution {


    public static void main(String[] args) {

        int arr[]={-8,2,5,-1,3,-5,8};
        rearrAngeArray(arr);

        //{1, 2, 3}, namely (1, 2, 3), (1, 3, 2), (2, 1, 3), (2, 3, 1), (3, 1, 2), and (3, 2, 1).
        //    (-8,2,5,-1,3,-5,8)  -tve in first and +tve at last
        // [-8,-1,-5,2,5,3,8]
    }

    private static void rearrAngeArray(int[] arr) {
        int len = arr.length;
        int newArray[]=new int[len];
        int count=0,rev=0;
        for (int i=0; i<len; i++){

            if(arr[i]<0){

                newArray[count]=arr[i];
                count++;
            }else{
                int j=len- rev;
                System.out.println(" j : " + j);

                newArray[j]=arr[i];
                rev++;
            }

        }
        System.out.println(Arrays.toString(newArray));

    }


}
