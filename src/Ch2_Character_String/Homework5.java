package Ch2_Character_String;

/*How often does each type of these 20 amino acids: A, C, D, E, F, G, H, I, K, L, M, N, P, Q, R, S, T,
V, W and Y occurs in the below protein sequence:
GIVEQCCTSICSLYQLENYCNFVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTP
 KSICSLYQLVCGEVEQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCN
 FVNQHLCGSHLVEALYLVGERGFFYTPKTNQHERGFFYTPKSICSLYQLVCGEVEQCCTTSIC
 SLYLCGSQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCNFVNQHL */

public class Homework5 {
    public static void main(String[] args) {
        String protein = "GIVEQCCTSICSLYQLENYCNFVNQHLCGSHLVEALYLVCGERGFFYTPKTNQHERGFFYTP" +
                "KSICSLYQLVCGEVEQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCN" +
                "FVNQHLCGSHLVEALYLVGERGFFYTPKTNQHERGFFYTPKSICSLYQLVCGEVEQCCTTSIC" +
                "SLYLCGSQCCTTSICSLYLCGSHRGFFYTLVECGEALYLHERGICSLYQLENYCNFVNQHL";
        int[] count = new int[20];
        String aminoAcids = "ACDEFGHIKLMNPQRSTVWY";

        for (int i = 0; i < protein.length(); i++) {
            char ch = protein.charAt(i);
            int index = aminoAcids.indexOf(ch);
            if (index != -1) {
                count[index]++;
            }
        }

        for (int i = 0; i < count.length; i++) {
            System.out.println(aminoAcids.charAt(i) + ": " + count[i]);
        }
    }
}