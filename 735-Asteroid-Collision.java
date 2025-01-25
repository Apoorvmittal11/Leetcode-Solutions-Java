class Solution {
    public int[] asteroidCollision(int[] astr) {
        int prev = -1;
        for (int i = 0; i < astr.length; i++) {
            boolean notSame = true;
            if (astr[i] > 0) {
                astr[++prev] = astr[i];
            } else {
                while (prev >= 0 && astr[prev] > 0) {
                    if (astr[prev] < -astr[i]) {
                        prev--;
                    } else if (astr[prev] == -astr[i]) {
                        prev--;
                        notSame = false;
                        break;
                    } else {
                        break;
                    }
                }

                if (notSame && (prev < 0 || astr[prev] < 0)) {
                    astr[++prev] = astr[i];
                }
            }
        }
        return Arrays.copyOfRange(astr, 0, prev + 1);
    }
}