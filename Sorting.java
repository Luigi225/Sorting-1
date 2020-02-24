public class Sorting{
    public String[] sortStrings(String [] coming){
        String min = "";
        int minIndex = 0;
        int minValue = 0;
        String temp = "";
        for(int i = 0;i<coming.length;i++){
            minIndex = i; //sets first unsorted element index as minIndex
            min = coming[minIndex]; //sets first unsorted element as min value
            for(int j = i+1;j<coming.length;j++){
                if(coming[j].compareTo(coming[minIndex])>0){ //set new min if smaller value if found
                    minIndex = j;
                    min = coming[minIndex];
                }
            }//end nested for-loop
            //Swap elements
            coming[i] = min;
            coming[minIndex] = coming[i];
            coming[i] = temp;
        }//end for loop
        return coming;
    }
}