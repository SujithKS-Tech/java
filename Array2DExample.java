class Array2DExample {
    public static void main(String[] args) {

    //     int[][] arr = {
    //         {1,2,3},
    //         {4,5,6},
    //         {7,8,9}
    //     };

    //     for(int i = 0; i < 3; i++){
    //         for(int j = 0; j < 3; j++){
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }

    // }

    // int[] arr = {1,2,3 ,4 ,5};
    // int[] rev = new int[arr.length];

    // for(int i=0 ; i<arr.length; i++){
    //     rev[i] =  arr[arr.length - 1 -i];
    // }

    //  for(int i=0 ; i< arr.length ; i++){
    //     System.out.print(arr[i]);
    // }
    // System.out.println("-------------");
    // for(int i=0 ; i< rev.length ; i++){
    //     System.out.print(rev[i]);
    // }

   int[] arr = {1,2,3 ,4 ,5};
    int start = 0;
    int end = arr.length-1;

    for(int i=0; i<arr.length/2  ; i++){
        int temp  = arr[start];
        arr[start] = arr[end];
        arr[end ] = temp;

        start++;
        end--;
    }

      for(int i=0 ; i<arr.length ; i++){
        System.out.print(arr[i]);
    }
    }
}