package com.dsa.questions.leetcode;

//leetcode-61

import com.dsa.linkedlist.LLTemplate;

public class RotateLL {
    //TODO: PUT THE BELOW CODE IN LLTemplate.java FILE AND MAKE CHANGES ACCORDINGLY AND RUN, OR STRAIGHT UP RUN IT ON LEETCODE
    /*public Node rotate(Node head, int k) {
        int len = 1;
        Node curr = head;
        while(curr.next != null) {
            curr = curr.next;
            len++; //counting the lenght of the LL
        }

        k = k % len; //k can be bigger than len, hence
        if(k == 0) return head; //means k is multiple of len, hence after k rotations, we'll end up with same LL

        int pivot = len - k - 1; //after this point we'll rotate, i.e this node will become the new tail
        Node tail = head;
        for(int i=0;i<pivot;i++) {
            tail = tail.next; //moving this to new tail, so we can cut off the list there
        }

        curr.next = head; //joining the previous tail to the first element (rotation in a way)
        head = tail.next; //new head will be the element just after new tail
        tail.next = null;

        return head;
    }*/
}
