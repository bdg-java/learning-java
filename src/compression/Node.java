package compression;

public class Node {
    char eachCharacter;
    int countFreq;
    Node left;
    Node right;

    public Node(char eachCharacter, int countFreq) {
        this.eachCharacter = eachCharacter;
        this.countFreq = countFreq;
    }

    public Node(char eachCharacter, int countFreq, Node left, Node right) {
        this.eachCharacter = eachCharacter;
        this.countFreq = countFreq;
        this.left = left;
        this.right = right;
    }
}
