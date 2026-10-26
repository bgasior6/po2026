package agh.po.lab3;

import static org.junit.Assert.*;
public class CodingBatTest {
    CodingBat test = new CodingBat();
    @org.junit.Test
    public void parrotTrouble() {
        assertEquals(true, test.parrotTrouble(true, 3));
        assertEquals(false, test.parrotTrouble(false, 3));
        assertEquals(false, test.parrotTrouble(true, 15));
    }

    @org.junit.Test
    public void hasTeen() {
        assertEquals(true, test.hasTeen(15, 1, 2));
        assertEquals(false, test.hasTeen(27, 1, 2));
        assertEquals(true, test.hasTeen(15, 19, 3));
    }

    @org.junit.Test
    public void sum13() {
        assertEquals(3, test.sum13(new int[]{1, 2, 13, 2}));
        assertEquals(32, test.sum13(new int[]{1, 2, 12, 12, 5}));
        assertEquals(0, test.sum13(new int[]{}));
    }

    @org.junit.Test
    public void makeAbba() {
        assertEquals("abba", test.makeAbba("a", "b"));
        assertEquals("iphonesamsungsamsungiphone", test.makeAbba("iphone", "samsung"));
        assertEquals("pythonJavaJavapython", test.makeAbba("python", "Java"));
    }
}