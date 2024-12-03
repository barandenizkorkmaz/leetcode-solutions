package trie;

class WordDictionary {

    class Node{
        Node[] children;
        boolean isWord;

        public Node(){
            this.children = new Node[26];
            this.isWord = false;
        }
    }

    Node root;

    public WordDictionary() {
        root = new Node();
    }

    public void addWord(String word) {
        Node current = this.root;
        for(char c : word.toCharArray()){
            int index = c - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        return recurseSearch(this.root, word);
    }

    private boolean recurseSearch(Node current, String word){
        if(word.isEmpty())return current.isWord;
        char c = word.charAt(0);
        if(c == '.'){
            for(Node child : current.children){
                if(child != null && recurseSearch(child, word.substring(1)))return true;
            }
            return false;
        }
        int index = c - 'a';
        if(current.children[index] == null)return false;
        return recurseSearch(current.children[index], word.substring(1));
    }
}
