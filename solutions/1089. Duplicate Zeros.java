class Solution {
    public void duplicateZeros(int[] arr) {
        int numszero = 0;
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i]==0){
                numszero++;
            }
        }
        int i = arr.length-1;
        int j = arr.length+numszero-1;
        while(i!=j){
            insert(arr,i,j);
            j--;
            if(arr[i]==0){
                insert(arr,i,j);
                j--;
            }
            i--;
        }
    }
    
    private void insert(int[] arr,int i,int j){
        if(j<arr.length)
            arr[j] = arr[i];
    }
}
