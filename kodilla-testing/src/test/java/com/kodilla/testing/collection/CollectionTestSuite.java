package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {

    @Before
    public void before() {
        System.out.println("Test begin:");
    }

    @After
    public void after() {
        System.out.println("Test end.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(emptyList, resultList);
        System.out.println("List is empty");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        ArrayList<Integer> expectedList = new ArrayList<>();
        normalList.add(5);
        normalList.add(6);
        normalList.add(16);
        normalList.add(8);
        normalList.add(5);
        expectedList.add(6);
        expectedList.add(16);
        expectedList.add(8);

        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");

        //Then
        Assert.assertEquals(expectedList, resultList);
        System.out.println("Odd numbers expected: " + expectedList + "\n Numbers found after test :" + resultList);
    }
}
