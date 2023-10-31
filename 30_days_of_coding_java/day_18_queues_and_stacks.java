
// import java.io.*;
import java.util.*;

public class day_18_queues_and_stacks {
    // Write your code here.
    Stack<Character> st = new Stack<Character>();
    Queue<Character> que = new LinkedList<Character>();

    void pushCharacter(char ch) {
        st.push(ch);
    }

    void enqueueCharacter(char ch) {
        que.add(ch);
    }

    char popCharacter() {
        char c = st.peek();
        st.pop();
        return c;
    }

    char dequeueCharacter() {
        char c = que.peek();
        que.remove();
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        day_18_queues_and_stacks p = new day_18_queues_and_stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        // Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}