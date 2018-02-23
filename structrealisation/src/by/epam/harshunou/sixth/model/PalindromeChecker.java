package by.epam.harshunou.sixth.model;

import by.epam.harshunou.sixth.model.container.AbstractStack;
import by.epam.harshunou.sixth.model.container.StackOnArray;
import by.epam.harshunou.sixth.exceptions.StackIsEmptyException;
import by.epam.harshunou.sixth.exceptions.StackOverflowException;

public class PalindromeChecker {
    public static boolean checkPalindrome(String string) throws StackIsEmptyException,StackOverflowException{
        AbstractStack<Character> stack = new StackOnArray<>(string.length());
        try {
            for (int i = 0; i < string.length(); i++) {
                stack.push(string.charAt(i));
            }
        } catch (StackOverflowException e) {
            throw new StackOverflowException("Pushing error! Stack is full."+e);
        }
        String reverseString = "";
        try {
            while (!stack.isEmpty()) {
                reverseString += stack.pop();
            }
        } catch (StackIsEmptyException e) {
            throw new StackIsEmptyException("Element acception error! Stack is Empty"+e);
        }
        return string.equals(reverseString);
    }
}
