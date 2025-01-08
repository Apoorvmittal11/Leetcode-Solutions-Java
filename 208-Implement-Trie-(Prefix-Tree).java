class Trie {
    ArrayList<String> trie;

    public Trie() {
        trie = new ArrayList<>();
    }

    public void insert(String word) {
        trie.add(word);
    }

    public boolean search(String word) {
        return trie.contains(word);
    }

    public boolean startsWith(String prefix) {
        for (int i = 0; i < trie.size(); i++) {
            if (trie.get(i).startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */