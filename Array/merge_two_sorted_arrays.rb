Merge two sorted arrays:

Sample:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1



def merge(nums1, m, nums2, n)
   
    return if n==0
    
    tl = m+n-1
    l1 = m-1
    l2 = n-1
    
    while(l1>=0 && l2>=0)
       if(nums2[l2] > nums1[l1])
           nums1[tl] = nums2[l2]
           l2-=1;
       else
           nums1[tl] = nums1[l1]
           l1-=1
       end    
        tl-=1
    end
    
    while(l2>=0)
       nums1[tl] = nums2[l2]
        tl-=1
        l2-=1
    end    
    
end