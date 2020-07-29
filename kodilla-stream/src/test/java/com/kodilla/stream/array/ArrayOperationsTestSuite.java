
package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        //Given
        int numbers [] = {1,9,4,6,3,7,5,5,10,0,3,7,5,5,9,1,2,8,5,5};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        double averageExpected = 5.0;
        Assert.assertEquals(averageExpected, average, 0.0001);
    }
}