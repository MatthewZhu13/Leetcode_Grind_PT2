class Solution {
    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        String deliminator = "#";
        for (String i : strs) {
            ans.append(String.valueOf(i.length()));
            ans.append(deliminator);
            ans.append(i);
        }
        String ans1 = ans.toString();
        System.out.println(ans1);
        return ans1;
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int idx = 0;
        int length;
        String addTo;

        while (idx < str.length()) {
            StringBuilder lengthBuilder = new StringBuilder();
            while (!(str.charAt(idx) == '#')) {
                lengthBuilder.append(str.charAt(idx));
                idx++;
            }
            idx++;
            length = Integer.valueOf(lengthBuilder.toString());
            StringBuilder sb = new StringBuilder();
            for (int i = idx; i < idx + length; i++){
                sb.append(str.charAt(i));
            }
            idx += length;
            addTo = sb.toString();
            ans.add(addTo);
        }
        return ans;
    }
}
