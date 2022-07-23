// # ===================================Subarray with given sum============================================
// # Given an unsorted array A of size N that contains only non-negative integers,
// # find a continuous sub-array which adds to a given number S.

// # In case of multiple subarrays, return the subarray which comes first on
// # moving from left to right.
// # ==========================================GFG=========================================================

import java.util.*;

class Main{
	public static void main(String[] args) {
            int n = 5;
            int s = 12;
            int[]  m = {1,2,3,7,5};
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }



class Solution
{
static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> a = new ArrayList<Integer>();
        int x= 1;
        int y= 1;
        for (int i = 0 ; i<n;i++){
            int b = arr[i];
            x=i;
            if (arr[i]==s){
                y=i;
                break;
            }
            for ( int j = (i+1);j<n;j++){
                b = b +arr[j];
                y=j;
                if (b >= s){
                    break;
                }
            
            }
            if(b == s){
                break;
            }
        }
        if ( x != y ){
            a.add(x+1);
            a.add(y+1);
        }
        else if( arr[x] == s){
            a.add(x+1);
            a.add(y+1);
            
        }
        else{
            a.add(-1);
        }
        return a;
    }
}