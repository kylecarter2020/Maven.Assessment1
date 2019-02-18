package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            if(objectToCount.equals(objectArray[i]))
            {
                count++;
            }
        }

        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        ArrayList<Object> removed = new ArrayList<>();

        for (int i = 0; i < objectArray.length; i++) {
            if(!(objectToRemove.equals(objectArray[i])))
            {
                removed.add(objectArray[i]);
            }
        }

        Integer result[] = new Integer[removed.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = (Integer)removed.get(i);
        }

        return result;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Object mostCommon = new Object();
        int max = 0;
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            count = getNumberOfOccurrences(objectArray, objectArray[i]);

            if(count > max)
            {
                max = count;
                mostCommon = objectArray[i];
            }
        }

        return mostCommon;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Object leastCommon = new Object();
        int min = objectArray.length;
        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            count = getNumberOfOccurrences(objectArray, objectArray[i]);

            if(count < min)
            {
                min = count;
                leastCommon = objectArray[i];
            }
        }

        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        ArrayList<Object> merged = new ArrayList<>();

        for(Object object: objectArray){
            merged.add(object);
        }
        for(Object object: objectArrayToAdd){
            merged.add(object);
        }

        Integer[] result = new Integer[merged.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = (Integer) merged.get(i);
        }
        return result;
    }
}
