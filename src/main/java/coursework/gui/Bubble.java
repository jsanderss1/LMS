/*

class BubbleSort
{
    void bubbleSort(String arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].compareTo(arr[j+1]) > 0)
                        //arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    */
/* Prints the array *//*

    void printArray(String arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        String arr[] = {"64", "34", "25", "12", "22", "11", "90"};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

        //TEST CODE
        //String s1="hello";
        //String s2="1hello";
        //System.out.println(s1.compareTo(s2));
    }
}*/
