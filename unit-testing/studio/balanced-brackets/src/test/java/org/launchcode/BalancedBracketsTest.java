package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void noBracketsReturnsTrue(){assertTrue(BalancedBrackets.hasBalancedBrackets(""));}
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));}
    @Test
    public void oneSetFirstLastReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));}
    @Test
    public void oneSetMixedWithStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));}
    @Test
    public void oneSetBeforeStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));}
    @Test
    public void openingBracketBeforeString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));}
    @Test
    public void flipFloppedBracketsMixedInString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));}
    @Test
    public void onlyOpeningBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));}
    @Test
    public void onlyClosingBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));}
    @Test
    public void reversedBracketsOnly(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));}
    @Test
    public void reversedSetBeforeAndAfterString(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));}
    @Test
    public void nestedBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));}
}