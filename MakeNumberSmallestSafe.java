public class MakeNumberSmallestSafe {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        long number = sc.nextLong; 
        
        String numStr = String.valueOf(number);
        StringBuilder sb = new StringBuilder(numStr);
        
        int indexToRemove = -1;
        
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) > sb.charAt(i + 1)) {
                indexToRemove = i;
                break;
            }
        }
        
        if (indexToRemove == -1) {
            indexToRemove = sb.length() - 1;
        }
        
        sb.deleteCharAt(indexToRemove);
        
        long result = 0;
        if (sb.length() > 0) {
            result = Long.parseLong(sb.toString());
        }
        
        System.out.println("Original: " + number);
        System.out.println("Smallest Result: " + result);
    }
}
