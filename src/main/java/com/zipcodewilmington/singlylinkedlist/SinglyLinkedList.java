package com.zipcodewilmington.singlylinkedlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    Node head = null;

     public class Node{
        int element;
        Node nextElement;
        Node(int d){ element = d;}
    }

    public void add(int data) {
      Node current = head;
        if(current == null){
            head = new Node(data);
        }
        else {
            while(current.nextElement != null){
                current = current.nextElement;
            }
            current.nextElement = new Node(data);
        }
    }

    public void remove(int data) {
        Node current = head;
        if (head.element == data) {
            head = head.nextElement;
        }
        while (current.nextElement != null) {
            if (current.nextElement.element == data) { current.nextElement = current.nextElement.nextElement; }
            current = current.nextElement;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while(current != null) {
            if (current.element == data) {
                return true;
            }current = current.nextElement;
        }
        return false;
    }

    public int find(int data) {
        Node current = head;
        int count = 0;
       while(current != null){
            if(current.element == data)
                return count;
            count++;
            current = current.nextElement;
        }
        return count;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.nextElement;
        }
        return count;
    }

    public int get(int index) {
        Node current = head;
        int count = 0;
        while(current != null){
            if(count == index)
                return current.element;
            count++;
            current = current.nextElement;
        }
        return -1;
    }

    public SinglyLinkedList copy() {
        SinglyLinkedList copyList = new SinglyLinkedList();
        Node current = head;
        while(current != null){
            copyList.add(current.element);
            current = current.nextElement;
        }
        return copyList;
    }

    public void sort(){
        Node current = head;
        Node index = null;
        int temp;

        if(head == null){ }
        else{
            while(current != null){
                index = current.nextElement;
                while (index != null){
                    if(current.element > index.element){
                        temp = current.element;
                        current.element = index.element;
                        index.element = temp;
                    }
                    index = index.nextElement;
                }
                current = current.nextElement;
            }
        }
    }
}