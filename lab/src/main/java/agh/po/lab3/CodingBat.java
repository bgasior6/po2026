package agh.po.lab3;

public class CodingBat {
    public boolean parrotTrouble(boolean talking, int hour) {
        if ((hour < 7 || hour > 20) && talking){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)){
            return true;
        }
        else{
            return false;
        }
    }

    public int sum13(int[] nums) {
        Integer sum = 0;
        if (nums.length > 0){
            for (Integer i = 0; i < nums.length; i++){
                if (nums[i] < 13){
                    sum = sum + nums[i];
                }
                else if (nums[i] <= 13){
                    i++;
                }
            }
            return sum;
        }
        else{
            return 0;
        }
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args){
        CodingBat testowa = new CodingBat();
        System.out.println(testowa.parrotTrouble(true, 6));
        System.out.println(testowa.hasTeen(1, 14, 9));
        System.out.println(testowa.sum13(new int[]{1, 2, 13, 2}));
        System.out.println(testowa.makeAbba("a", "B"));
    }

}
