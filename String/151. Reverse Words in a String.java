class Solution {
    public String reverseWords(String s) {
        String[] rw=s.trim().split("\\s+");
        List<String> l1=Arrays.asList(rw);
        Collections.reverse(l1);
        return String.join(" ", l1);
        
    }
}
