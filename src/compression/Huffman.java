package compression;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Huffman {
    public static void encode(Node root,String str,Map<Character,String> code) {
            if(root == null) return;
            if(root.left == null && root.right == null){
                code.put(root.eachCharacter,str);
            }
        encode(root.left, str + "0", code);
        encode(root.right, str + "1", code);
    }

    public static void decode(){

    }

    public static void buildHuffmanTree(String text) {
        Map<Character, Integer> countFrequency = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            if (!countFrequency.containsKey(text.charAt(i))) {
                countFrequency.put(text.charAt(i), 1);
            } else {
                countFrequency.put(text.charAt(i), (countFrequency.get(text.charAt(i)) + 1));
            }
        }
        int min = 0;
        for (int i = 1; i < text.length(); i++) {
            if(countFrequency.get(text.charAt(i)) <min){
                min = countFrequency.get(text.charAt(i));
            }
        }

        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((left,right)->left.countFreq-right.countFreq);
        for (Map.Entry<Character,Integer>entry :countFrequency.entrySet()){
            priorityQueue.add(new Node(entry.getKey(),entry.getValue()));
        }
        while (priorityQueue.size() !=1){
            Node left = priorityQueue.poll();
            Node right = priorityQueue.poll();
            int sum = left.countFreq+right.countFreq;
            priorityQueue.add(new Node('0',sum,left,right));
        }

        Node root = priorityQueue.peek();
        Map<Character,String> code = new HashMap<>();
        encode(root,"",code);
        // print the Huffman codes
        System.out.println("Huffman Codes are :\n");
        for (Map.Entry<Character, String> entry : code.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nOriginal string was :\n" + text);

    }

    public static void main(String[] args) {
        buildHuffmanTree("string is this ssss");
    }

}
