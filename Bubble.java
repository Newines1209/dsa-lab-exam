/*Implement the bubble sort algorithm to sort an array of alphabets (ASCII)
 */
public class Bubble{
    public static void main(String[] args) {
        char [] alphabet={'e','d','c','b','a'};
        bubble(alphabet);
        for (int i=0; i< alphabet.length; i++){
            System.out.println(alphabet[i]);
        }
    }
    public static void bubble(char[] bubble) {
        for(int i = bubble.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                //do swap adjacent files after comparison
                if(bubble[j] > bubble[j + 1]) {
                    char temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

    }
}