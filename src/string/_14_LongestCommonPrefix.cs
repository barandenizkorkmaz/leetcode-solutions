namespace DefaultNamespace;

public class _14_LongestCommonPrefix
{
    public string LongestCommonPrefix(string[] strs) {
        StringBuilder str = new StringBuilder();
        Array.Sort(strs);
        string first = strs[0];
        string last = strs[strs.Length-1];
        for(int i = 0; i < Math.Min(first.Length, last.Length); i++){
            if(first[i] != last[i]){
                return str.ToString();
            }
            str.Append(first[i]);
        }
        return str.ToString();
    }
}