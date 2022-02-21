Happy Number:

A number is said to be happy if recursive sum of square of its digits is equals to 1.
https://en.wikipedia.org/wiki/Happy_number


Find a given number is happy number or not


Sample:

Input: n = 19
Output: True
19 is Happy Number,
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1
As we reached to 1, 19 is a Happy Number.

Input: n = 20
Output: False




Solution 1:

Using extra space(Set)

def find_sum(n)
    sum = 0
   while(n>0)
       m = n % 10
       sum+=m*m
       n/=10
   end
    sum
end    

def is_happy(n)
    return true if n == 1 || n == 7
    s = Set.new
    sum = n
    while(1)
        sum = find_sum(sum)
        return true if sum == 1 || sum == 7
        return false if s.include?(sum)
        s<<sum
    end    
end


Solution 2:

No extra space

def find_sum(n)
    sum = 0
   while(n>0)
       m = n % 10
       sum+=m*m
       n/=10
   end
    sum
end    

def is_happy(n)
    return true if n == 1 || n == 7
    sum = n
    while(sum>9)
        sum = find_sum(sum)
    end
    return true if sum == 1 || sum == 7
    false
end


Refer: https://www.geeksforgeeks.org/happy-number/

