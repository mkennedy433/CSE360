package cse360assignment02;

/*
 * 
 * @author Morgan Kennedy 
 * Assignment 02 
 * CSE 360
 * 
 * This assignment adds and subtracts values and keeps a history of each transaction
 */

public class AddingMachine {
  private int total;
  private String history; 
  
  /*
   *  addingMachine() constructor initalizes total and history with 0
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = "0";
  }
  
  /*
   *  getTotal() method gets the value of all values processed
   *  @return is the current value of the processed 
   *  
   */
  public int getTotal () { // this returns the total value 
    return total;
    
  }
  
  /*
   * add() method adds the values to the current total and keeps 
   * track of the history
   * @param value is required and is the int that is the current value
   */
  public void add (int value) { //adds the new value to the total values 
	  total += value; 
	  history += (" + " + value); // keep track of history
	  
  }

  /* 
   * subtract() method subtracts the values from the current total and 
   * keeps track of the history
   * @param value is required and is the int that is the current value
   */
  
  public void subtract (int value) { //subtracts new value to the total values 
	  total -= value; 
	  history += (" - " + value); //keep track of history
	  
  }

  /* 
   * toString() method returns the history of all operations done
   */
  public String toString () {
    return history;
    
  }

  /*
   * clear() method clears the total value and clears all history 
   */
  public void clear() { //clears and resets the values 
	  total = 0;  
	  history = "0";
	  
  }
}