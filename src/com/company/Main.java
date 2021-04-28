package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] nums = new int[3];
	    for(int i = 0;i<nums.length;i++)
        {
            nums[i] = nums.length-i;
        }
	    Solution s = new Solution();
	    System.out.println(s.thirdMax(nums));
    }
}

class Solution {
    public int thirdMax(int[] nums) {
        Integer max1 = null, max2=null, max3=null;
        for(int i = 0;i< nums.length;i++)
        {
            if(max1==null)
            {
                max1 = nums[i];
                continue;
            }
            if(max1<nums[i])
            {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
                continue;
            }
            else if(max1>nums[i])
            {
                if(max2==null)
                {
                    max2 = nums[i];
                    continue;
                }
                else
                {
                    if(max2<nums[i])
                    {
                        max3 = max2;
                        max2 = nums[i];
                        continue;
                    }
                    else if(max2>nums[i])
                    {
                        if(max3==null)
                        {
                            max3 = nums[i];
                            continue;
                        }
                        else
                        {
                            if(max3<nums[i])
                            {
                                max3 = nums[i];
                                continue;
                            }
                        }
                    }
                }
            }
        }
        if(max3!=null)
        {
            return max3;
        }
        return max1;
    }
}
