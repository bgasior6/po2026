package agh.po.lab3;
import java.util.HashMap;
import java.util.Map;
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

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i ++){
            String s = strings[i];
            map.put(s, s.length());
        }

        return map;
    }

    public static void main(String[] args){
        CodingBat testowy = new CodingBat();
        System.out.print(testowy.mapAB(new HashMap<>(Map.of("a", "Hi", "b", "There"))));
    }

}
