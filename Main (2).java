public class deleteElementFromeArray {
    public static void main(String args[]){
        int [] arr = {10,65,78,65,47,21};
        int delete_element = 47;
        for(int i=0; i<arr.length; i++){
            if (delete_element==arr[i]) {
                for(int j=i; j<arr.length-1; j++){
                    arr[j]= arr[j+1];
                }
                break;
            }
        }
        for(int i=0; i<arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
