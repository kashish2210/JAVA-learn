// Al is an urban designer in Alphabet City, and today their task is to prepare signs for n
//  city streets. In Alphabet City, the street signs simply consist of the street names composed of capital identically stamped English metal letters. For instance, if, during nighttime, someone sneakily exchanges the first letters on NERC street and on NEF street, the next day nobody will see the difference as the letter 'N' is identical on both signs.

// Al is planning to put m
//  signs on each street, and they have already ordered the required number of brass letters for each of the street names from the metallurgical plant. However, one hour before the order arrived, Al got a call from the plant's manager with a devastating piece of news: they lost one of the items from the list of street names! To mitigate the issue, Al decided for now to put as many signs as possible on each street whose order was not lost, and, with the leftover letters, to prepare at least one sign for the street whose order was lost.

// Formally, if s1,…,sn
//  are the street names, and ℓ
//  is the index of the missing item from the order, Al is interested in the maximum integer k
//  such that it is possible, from all the letters of m
//  copies of s1,…,sℓ−1,sℓ+1,…,sn
// , to compose k
//  copies of s1,…,sℓ−1,sℓ+1,…,sn
//  and additionally at least one copy of sℓ
// , or to determine that such a composition is impossible for any non-negative k
// .

// Al still does not know which of the items was lost. Write a program that, given m
//  and all street names, for each ℓ∈{1,2,…,n}
//  prints the maximum value of k
// , or −1
//  if such a composition is impossible.

// Input
// The first line consists of two integers n
//  and m
// , denoting the number of streets in Alphabet City for which the signs are needed and the number of copies of each street name that Al initially ordered (2≤n≤2⋅105
// ; 1≤m≤5⋅105
// ). Each of the next n
//  lines consists of one string si
//  — the street name (1≤|si|≤5⋅105
// ). All these names are composed of capital English letters. Some or all of these names may coincide. It is guaranteed that the sum of the lengths of all the street names does not exceed 5⋅105
// .

// Output
// Print n
//  integers, the ℓ
// -th of them denoting the maximum integer k
//  such that the letters of m×s1
// , ..., m×sℓ−1
// , m×sℓ+1
// , ..., m×sn
//  (where m×s
//  denotes m
//  copies of street name s
// ) are enough to compose k×s1
// , ..., k×sℓ−1
// , 1×sℓ
// , k×sℓ+1
// , ..., k×sn
// . If, for the given value of ℓ
// , these letters are insufficient for any integer k≥0
// , print −1
//  instead.

// Examples
// Input
// 3 10
// NEERC
// NERC
// NEF
// Output
// 9 9 -1
// Input
// 4 4
// LENSE
// TEN
// SENSELESSNESSES
// LENSE
// Output
// 3 -1 0 3
import java.util.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        
        String[] streets = new String[n];
        for (int i = 0; i < n; i++) {
            streets[i] = sc.nextLine().trim();
        }
        
        // For each possible missing item
        for (int missing = 0; missing < n; missing++) {
            int result = findMaxK(streets, m, missing);
            System.out.print(result);
            if (missing < n - 1) System.out.print(" ");
        }
        System.out.println();
    }
    
    private static int findMaxK(String[] streets, int m, int missingIdx) {
        int n = streets.length;
        
        // Binary search on k
        int left = 0, right = m;
        int answer = -1;
        
        while (left <= right) {
            int k = (left + right) / 2;
            
            if (canCompose(streets, m, missingIdx, k)) {
                answer = k;
                left = k + 1;
            } else {
                right = k - 1;
            }
        }
        
        return answer;
    }
    
    private static boolean canCompose(String[] streets, int m, int missingIdx, int k) {
        // Count available letters
        // We have m copies of each street EXCEPT the missing one (we have 0 of that)
        int[] available = new int[26];
        
        for (int i = 0; i < streets.length; i++) {
            if (i == missingIdx) {
                continue; // We don't have this order
            }
            
            for (char c : streets[i].toCharArray()) {
                available[c - 'A'] += m;
            }
        }
        
        // Count required letters
        // We need k copies of all streets except the missing one (need 1 copy of that)
        int[] required = new int[26];
        
        for (int i = 0; i < streets.length; i++) {
            int copies = (i == missingIdx) ? 1 : k;
            
            for (char c : streets[i].toCharArray()) {
                required[c - 'A'] += copies;
            }
        }
        
        // Check if we have enough letters
        for (int i = 0; i < 26; i++) {
            if (available[i] < required[i]) {
                return false;
            }
        }
        
        return true;
    }
}