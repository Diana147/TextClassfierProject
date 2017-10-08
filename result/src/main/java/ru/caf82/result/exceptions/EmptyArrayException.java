/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.caf82.HomeWork.homework3.exceptions;

/**
 *
 * @author prask_000
 */
public class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super();
    }
    
    EmptyArrayException(Throwable cause) {
    super(cause);
    }
    
    EmptyArrayException(String message){
    super(message);
    }
    
     EmptyArrayException(String message, Throwable cause){
     super(message, cause);
     }
    
    
   
}  


