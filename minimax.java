public class minimax {
    public static void main(String[] args) {
        int[] numbers = {10,20,3,4,55,6};
        
        int minimum = numbers[0];

        for(int i=0;i<(numbers.length-1);i++){
            if(minimum > numbers[i+1]){
                int temp = minimum;
                minimum = numbers[i+1];
            }
        }
        System.out.println("Minimum number is: "+ minimum);

        int maximum = numbers[0];
        for(int i=0;i<(numbers.length-1);i++){
            if(maximum < numbers[i+1]){
                int temp = maximum;
                maximum = numbers[i+1];
            }
        }
        System.out.println("Maximum numbers is: "+ maximum);
    }
}
