package pyq;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     // input lene ke liye
        String s = sc.next();                    // input string padho (a-z letters)
        int n = s.length();                      // string ki length nikal lo

        // ---------- STEP 1: Palindrome DP table banao ----------
        // isPal[i][j] = true agar s[i..j] (i se j tak, dono included) palindrome hai
        boolean[][] isPal = new boolean[n][n];

        // Chhote substrings pehle bharo, isliye i ko peeche se aage (n-1 se 0 tak) chalate hain
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {         // j hamesha i ke baraabar ya aage hoga
                if (i == j) {
                    isPal[i][j] = true;           // single character hamesha palindrome hota hai
                } else if (s.charAt(i) == s.charAt(j)) {
                    // agar dono end ke characters match karte hain
                    if (j == i + 1) {
                        isPal[i][j] = true;       // sirf 2 characters hain aur match ho gaye, to palindrome
                    } else {
                        isPal[i][j] = isPal[i + 1][j - 1]; // andar wala part bhi palindrome hona chahiye
                    }
                } else {
                    isPal[i][j] = false;          // ends match nahi kiye, to palindrome nahi ho sakta
                }
            }
        }

        // ---------- STEP 2: Pehla cut dhoondo (smallest first substring) ----------
        int firstEnd = -1;                        // pehle tukde ka end index store karenge (abhi tak nahi mila)

        // i = pehle tukde ka end index; chhota substring (i=0) se shuru karke bada karte jao
        // "n - 3" tak isliye kyunki baaki 2 tukdo ke liye kam se kam 1-1 character bachna chahiye
        for (int i = 0; i <= n - 3; i++) {
            if (isPal[0][i] && canSplitInto2(isPal, i + 1, n - 1)) {
                firstEnd = i;                      // ye pehla valid chota cut mil gaya
                break;                             // isse chota koi aur ho hi nahi sakta, to ruk jao
            }
        }

        // agar koi valid pehla cut mila hi nahi, to answer possible nahi hai
        if (firstEnd == -1) {
            System.out.println("Impossible");
            return;                                // yahin program khatam kar do
        }

        // ---------- STEP 3: Dusra cut dhoondo (smallest second substring) ----------
        int secondEnd = -1;                        // dusre tukde ka end index
        int start2 = firstEnd + 1;                 // dusra tukda yahin se shuru hota hai

        // start2 se lekar (n-2) tak try karo, chota substring pehle
        for (int j = start2; j <= n - 2; j++) {
            if (isPal[start2][j] && isPal[j + 1][n - 1]) {
                // dusra tukda khud palindrome hai AUR baaki bacha hua teesra tukda bhi palindrome hai
                secondEnd = j;                      // ye valid smallest dusra cut hai
                break;                              // chota mil gaya, ab aage dhoondhne ki zaroorat nahi
            }
        }

        // agar dusra cut nahi mila, to overall split possible nahi hai
        if (secondEnd == -1) {
            System.out.println("Impossible");
            return;
        }

        // ---------- STEP 4: Teeno tukde print karo ----------
        System.out.println(s.substring(0, firstEnd + 1));           // pehla tukda
        System.out.println(s.substring(start2, secondEnd + 1));     // dusra tukda
        System.out.println(s.substring(secondEnd + 1, n));          // teesra tukda (jo bacha hai)
    }

    // Helper function: check karta hai ki s[start..end] ko KISI BHI tarah 2 palindromes mein
    // toda ja sakta hai ya nahi (yahan "smallest" nahi chahiye, sirf possibility chahiye)
    static boolean canSplitInto2(boolean[][] isPal, int start, int end) {
        // agar range mein kam se kam 2 characters nahi hain, to 2 tukdo mein baat sakta hi nahi
        if (end - start < 1) return false;

        // k = pehle (in-2) tukde ka end index; start se end-1 tak try karo
        for (int k = start; k < end; k++) {
            if (isPal[start][k] && isPal[k + 1][end]) {
                return true;                        // ek valid split mil gaya, bas itna hi chahiye tha
            }
        }
        return false;                                // koi split nahi mila
    }
} 
