/**
 * Joyce Cheung
 * ICSI 213
 * Dr. Magnus
 * Assignment 4.1
 **/

public class Node {
  private String data;
  private Node next; // reference to successor 
  
  Node (String x) {
    this.data = x;
    this.next = null;
  }
  
  //Insert getters and setters
  public String getData() {
  return this.data;
  }
  
  public void setData(String newData) {
  this.data = newData;
  }
  
  public Node getNext() {
  return this.next;
  }
  
  public void setNext(Node newNext) {
  this.next = newNext;
  }
  }


  
  