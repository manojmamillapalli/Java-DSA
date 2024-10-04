package com.trie;

import java.util.* ;
import java.io.*; 
class Node1
{
    public Node1()
    {

    }
    int endcount=0;
    int prefixcount=0;
    Node1[] links=new Node1[26];
    boolean containsKey(char ch)
    {
        return (links[ch-'a']!=null);
    }
    Node1 putChar(char ch, Node1 node)
    {
        return links[ch-'a']=node;
    }
    Node1 getChar(char ch)
    {
        return links[ch-'a'];
    }
    void increaseEnd()
    {
        endcount++;
    }
    void increasePrefix()
    {
        prefixcount++;
    }
    void decreaseEnd()
    {
        endcount--;
    }
    void decreaseprefix()
    {
        prefixcount--;
    }
    int getEnd()
    {
        return endcount;
    }
    int getPrefix()
    {
        return prefixcount;
    }
}
public class Trie2 {
    private static Node1 root;
    public Trie2() {
        // Write your code here.
        root=new Node1();
    }

    public void insert(String word) {
        // Write your code here.
        Node1 node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                node.putChar(word.charAt(i), new Node1());
            }
            node=node.getChar(word.charAt(i));
            node.increasePrefix();
        }
        node.increaseEnd();
    }

    public int countWordsEqualTo(String word) {
        // Write your code here.
        Node1 node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                return 0;
            }
            else
            {
                node=node.getChar(word.charAt(i));
            }
        }
        return node.getEnd();
    }

    public int countWordsStartingWith(String word) {
        // Write your code here.
        Node1 node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                return 0;
            }
            else{
                node=node.getChar(word.charAt(i));
            }
        }
        return node.getPrefix();
    }

    public void erase(String word) {
        // Write your code here.
        Node1 node=root;
        for(int i=0;i<word.length();i++)
        {
            if(!node.containsKey(word.charAt(i)))
            {
                return ;
            }
            else{
                node=node.getChar(word.charAt(i));
                node.decreaseprefix();
            }
        }
        node.decreaseEnd();
    }

}

