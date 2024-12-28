import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            HashMap<Character, Integer> S_Map = new HashMap<Character, Integer>();
            HashMap<Character, Integer> T_Map = new HashMap<Character, Integer>();

            for (int i = 0; i < s.length(); i++) {

                char s_letter = s.charAt(i);
                char t_letter = t.charAt(i);

                S_Map.put(s_letter, (S_Map.get(s_letter) == null) ? 
                                    1 : 
                                    S_Map.get(s_letter) + 1);

                T_Map.put(t_letter, (T_Map.get(t_letter) == null) ? 
                                    1 : 
                                    T_Map.get(t_letter) + 1);
            }

            for (Map.Entry<Character, Integer> entry : S_Map.entrySet()) {
                Character letter = entry.getKey();
                Integer frequency = entry.getValue();
                if (!T_Map.containsKey(letter) || !T_Map.get(letter).equals(frequency)) {
                    return false;
                } 
            }
            return true;
        }
    }
}

