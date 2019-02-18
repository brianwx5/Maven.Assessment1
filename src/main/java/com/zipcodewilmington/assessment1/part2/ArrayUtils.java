package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


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
        Integer counter = 0;
        Integer arrayLength = objectArray.length;
        Integer arrayLengths = arrayLength -1;
        for(Integer i =0; i <=arrayLengths; i++) {
            if(objectArray[i] == objectToCount) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] objectArray, Integer objectToRemove) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i = 0; i <objectArray.length;i++) {
            if(objectArray[i] != objectToRemove) {
                newArray.add(objectArray[i]);
            }
        }
        Integer[] arrays = new Integer[newArray.size()];
        arrays = newArray.toArray(arrays);

        return  arrays;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Integer getMostCommon(Integer[] objectArray) {
        Integer count = 1;
        Integer counterForCommon;
        Integer starter = objectArray[0];
        Integer f = 0;


        for(int i =0;i < objectArray.length ; i++) {
            f = objectArray[i];
            counterForCommon=0;
        for(int j = 1; j<=objectArray.length-1;j++) {
            if(f == objectArray[j]) {
                counterForCommon++;
            } if(counterForCommon > count) {
                starter = f;
                count = counterForCommon;
            }

        }
        } return f;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Integer getLeastCommon(Integer[] objectArray) {
        Integer number = 2;
        return number;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] objectArray, Integer[] objectArrayToAdd) {
        Integer[] merger = new Integer[objectArray.length + objectArrayToAdd.length];
        for (int i =0; i< objectArray.length;i++) {
            merger[i] = objectArray[i];
        }
        for (int j = 0; j< objectArrayToAdd.length; j++) {
            merger[(objectArray.length)+j] = objectArrayToAdd[j];
        } return merger;
    }
}
