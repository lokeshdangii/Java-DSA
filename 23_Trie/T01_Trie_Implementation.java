public class T01_Trie_Implementation{

    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;        // eow--> end of word

        Node(){
            for(int i=0;i<26;i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // insert
    public static void insert(String word){  // TC --> O(L) L-> length of word
        Node curr = root;

        for(int level=0;level<word.length();level++){
            int idx = word.charAt(level) - 'a';

            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // search
    public static boolean search(String key){  // TC --> O(L) L-> length of word
        Node curr = root;

        for(int level=0;level<key.length();level++){
            int idx = key.charAt(level) - 'a';

            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }

        return curr.eow == true;
    }


    public static void main(String[] args) {
        String words[] =  {"the", "a", "there", "any", "their", "thee"};

        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }

        System.out.println(search("any"));
        System.out.println(search("an"));
    }
}