import java.util.ArrayList;
import java.util.List;

public class Permuatation2 {
    public static List<String> findPermutations(String str) {
        List<String> result = new ArrayList<>();
        findPermutations(str, "", result);
        return result;
    }

    private static void findPermutations(String str, String ans, List<String> result) {
        if (str.length() == 0) {
            result.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutations(newStr, ans + curr, result);
        }
    }

    public static List<String> intPermutation(int n) {
        String str = Integer.toString(n);
        List<String> result = new ArrayList<>();
        findPermutations(str, "", result);
        return result;
    }

    public static void main(String[] args) {
        int n = 123;
        List<String> permutations = intPermutation(n);

        for (String perm : permutations) {
            System.out.println(perm);
        }
    }
}

