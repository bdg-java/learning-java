package com.bdg.huffman;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
public class Node {
    char ch;
    int freq;
    Node left = null;
    Node right = null;

    public Node(char ch, int freq){
        this.ch = ch;
        this.freq = freq;
    }

    public Node(char ch, int freq, Node left, Node right){
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

 class Huffman {
    public static void encode(Node root, String str, Map<Character, String> huffmanCode){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            huffmanCode.put(root.ch,str);
        }

        encode(root.left,str + "0",huffmanCode);
        encode(root.right,str +'1',huffmanCode);
    }

    public static void BuildhaffmanTree(String text){
        Map<Character, Integer> freq = new HashMap<>();
        for(int i=0; i<text.length();i++){
            if(!freq.containsKey(text.charAt(i))){
                freq.put(text.charAt(i),0);
            }
            freq.put(text.charAt(i), freq.get(text.charAt(i))+1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (l, r) -> l.freq - r.freq);

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size()!=1){
            Node left = pq.poll();
            Node right = pq.poll();

            int sum = left.freq+ right.freq;
            pq.add(new Node('\0',sum,left,right));
        }
        Node root = pq.peek();
        Map<Character,String> huffmancode = new HashMap<>();
        encode(root, "", huffmancode);
        System.out.println("huffman Codes are :\n");
        for (Map.Entry<Character, String> entry : huffmancode.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("\nOriginal string was :\n" + text);
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < text.length(); i++) {
            sb.append(huffmancode.get(text.charAt(i)));
        }

        System.out.println("\nEncoded string is :\n" + sb);

    }

     public static void main(String[] args) {
         String text = "Hello World";
         BuildhaffmanTree(text);
     }

}
