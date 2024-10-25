class Solution {
    public List<String> removeSubfolders(String[] folders) {
        Set<String> seenFolders = new HashSet<>();
        for (var folder : folders) {
            seenFolders.add(folder);
        }
        List<String> res = new ArrayList<>();
        StringBuilder currFolder = new StringBuilder();
        for (var folder : folders) {
            int fLen = folder.length();
            currFolder.setLength(0);
            for (int indx = 0; indx < fLen; indx++) {
                char currChr = folder.charAt(indx);
                if (currChr == '/' && seenFolders.contains(currFolder.toString()) && indx != fLen - 1) {
                    currFolder.setLength(0);
                    break;
                }
                currFolder.append(currChr);
            }
            if (currFolder.length() != 0)
                res.add(currFolder.toString());
        }
        return res;
    }
}