/*class Solution {
    public long countOfSubstrings(String word, int k) 
    {
        int n=word.length();
        int ans=0;
        
        int s=5+k;
        if(n<(5+k))
        {
            return 0;
        }
        else
        {
            for(int i=0;i<n-k+1;i++)
            {
                HashMap<Character,Integer> h=new HashMap<>();
                int con=0;
                for(int j=i;j<n;j++)
                {
                    if(word.charAt(j)=='a' || word.charAt(j)=='e'||word.charAt(j)=='i'|| word.charAt(j)=='u' || word.charAt(j)=='o' )
                    {
                        h.put(word.charAt(j),h.getOrDefault(word.charAt(j),0)+1);
                        if(h.size()==5 && con==k)
                        {
                            ans++;
                            //break;
                        }
                    }
                    else
                    {
                        con++;
                        if(h.size()==5 && con==k)
                        {
                            ans++;
                            //break;
                        }
                    }
                }
            }
        }
        return ans;
    }
}*/
//import java.util.*;

class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private long atLeastK(String word, int k) {
        int n = word.length();
        long ans = 0;
        int consonants = 0;
        int left = 0;
        HashMap<Character, Integer> vowelMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = word.charAt(right);
            if (isVowel(c)) {
                vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            } else {
                consonants++;
            }

            while (vowelMap.size() == 5 && consonants >= k) {
                ans += n - right;
                char leftChar = word.charAt(left);
                if (isVowel(leftChar)) {
                    vowelMap.put(leftChar, vowelMap.get(leftChar) - 1);
                    if (vowelMap.get(leftChar) == 0) {
                        vowelMap.remove(leftChar);
                    }
                } else {
                    consonants--;
                }
                left++;
            }
        }
        return ans;
    }

    public long countOfSubstrings(String word, int k) {
        return atLeastK(word, k) - atLeastK(word, k + 1);
    }
}