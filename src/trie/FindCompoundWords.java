package trie;

import java.util.ArrayList;
import java.util.List;

public class FindCompoundWords {
    public static List<String> findCompoundWords(String[] words) {
        List<String> result = new ArrayList<>();

        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        for (String word : words) {
            for(int i = 1; i < word.length(); i++){
                String substring1 = word.substring(0, i);
                String substring2 = word.substring(i);
                if(trie.search(substring1) && trie.search(substring2)) {
                    result.add(word);
                    break;
                }
            }
        }

        return result;
    }
}
