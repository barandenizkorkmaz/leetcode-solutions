package string;

public class _392_IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int index_s = 0, index_t = 0;
        int s_size = s.length(), t_size = t.length();
        for(int i = 0; i < t_size && index_s < s_size; i++){
            if(s.charAt(index_s) == t.charAt(i)){
                index_s++;
            }
        }
        return (index_s >= s_size);
    }
}
