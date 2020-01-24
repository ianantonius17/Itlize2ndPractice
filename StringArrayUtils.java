 

/**
 * Created by Yang on 1/23/20.
 */
import java.util.*; 
import java.lang.*;
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String element: array){
            if(element.equals(value)) return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        int end = array.length-1;
        
        for(int i =0 ; i < array.length/2;i++)
        {
            String temp = array[i];
            array[i] = array[end-i];
            array[end-i] = temp;
        }
        
        
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int end = array.length-1;
        for(int i =0 ;i < array.length/2;i++){
            if(!array[i].equals(array[end-i])) return false;
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char c = 'a';
        String longString="";
        for(int i =0 ; i < array.length;i++){
            longString += array[i];
        }
        
        longString = longString.toLowerCase();
        while(c <= 'z'){
            
            if(!longString.contains(Character.toString(c))) return false;
            c+=1;
        }
        
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        
        for(String index: array){
            if(index.equals(value)) count++;
        }
        
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int countValue =0;
        
        for(int i =0 ;i < array.length;i++){
            if(array[i].equals(valueToRemove)) countValue++;
        }
        
        String[] newArray = new String[array.length-countValue];
        int index = 0;
        for(int i = 0 ; i < array.length;i++){
            if(array[i].equals(valueToRemove)) continue;
            
            newArray[index] = array[i];
            index++;
        }
        
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> ls = new ArrayList<String>();
        String[] result;
        String current = "";
        for(String index: array){
            if(current.equals("")){
                current = index;
                continue;
            }
            
            if(current.equals(index)) continue;
            
            ls.add(current);
            current = index;
        }
        
        ls.add(current);
        
        result = new String[ls.size()];
        for(int i= 0 ;i< ls.size();i++){
            result[i] =ls.get(i);
        }
        
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> ls = new ArrayList<String>();
        String curr = array[0];
        String word = array[0];
        for(int i = 1 ; i < array.length;i++){
            if(curr.equals(array[i])) {
                word += curr;
                continue;
            }
            
            ls.add(word);
            curr = array[i];
            word = curr;
        }
        ls.add(word);
        
        String[] result = new String[ls.size()];
        for(int i =0 ; i< ls.size();i++){
            result[i] = ls.get(i);
        }
        return result;
    }


}
