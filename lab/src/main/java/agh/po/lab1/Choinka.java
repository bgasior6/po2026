public class Choinka {
    public static void main(String[] args) {
        for(int i=1; i<Integer.parseInt(args[0]) + 1; i++){
            String choinka = "";
            for(int j = 1; j < i+1; j++) {
                choinka = choinka + "*";
            }
            System.out.println(choinka);
        }
    }
}