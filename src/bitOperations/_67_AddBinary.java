package bitOperations;

public class _67_AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while(i >= 0 || j >= 0 || carry == 1){
            if(i>=0){
                carry += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                carry += b.charAt(j) - '0';
                j--;
            }
            res.append(carry % 2);
            carry /= 2;
        }

        return res.reverse().toString();
    }
}