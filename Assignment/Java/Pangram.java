/** Without using built-in function from java, Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)**/
public class Pangram {
    public static void main(String[] args) {
            String input = "The quick brown fox jumps over the lazy dog";
            boolean isPangram = checkIfPangram(input);
            
            if (isPangram) {
                System.out.println("The input is a pangram.");
            } else {
                System.out.println("The input is not a pangram.");
            }
        }
    
        public static boolean checkIfPangram(String str) {
            // Create a boolean array to represent the presence of letters
            boolean[] isPresent = new boolean[26];
    
            // Convert the input string to lowercase to make the check case-insensitive
            str = str.toLowerCase();
    
            // Iterate through the characters in the input string
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    int index = c - 'a';
                    isPresent[index] = true;
                }
            }
    
            // Check if all letters from a to z have been encountered
            for (boolean letterPresent : isPresent) {
                if (!letterPresent) {
                    return false;
                }
            }
    
            return true;
        }
    }

    