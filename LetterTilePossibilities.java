public class LetterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        int[] counts = new int[26];
        for (char c : tiles.toCharArray()) {
            counts[c - 'A']++;
        }

        return backtrack(counts) - 1;
    }

    private int backtrack(int[] counts) {
        int count = 1;

        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                counts[i]--;
                count += backtrack(counts);
                counts[i]++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        LetterTilePossibilities solution = new LetterTilePossibilities();

        String tiles1 = "AAB";
        System.out.println("Tiles: \"" + tiles1 + "\" -> Possibilities: " + solution.numTilePossibilities(tiles1));

        String tiles2 = "C";
        System.out.println("Tiles: \"" + tiles2 + "\" -> Possibilities: " + solution.numTilePossibilities(tiles2));

        String tiles3 = "AAAB";
        System.out.println("Tiles: \"" + tiles3 + "\" -> Possibilities: " + solution.numTilePossibilities(tiles3));
    }
}