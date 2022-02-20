 a) Check if its power of 2(Contains only one set bit)
 b) verify if number of zero bits is even after the set bit

def is_power_of_four(n)
    return false if n<1
    count = 0
    
    if (n&(n-1)) == 0
       while(n>1)
         count = count + 1
         n = n >> 1
       end
       return count % 2 == 0 ?  true : false
    end
    
    return false
end

// log base 4 of a power of 4 will always be Integer
def is_power_of_four(num)
    return false if num < 4 && num!= 1
    Math.log(num,4) % 1 == 0 ? true : false
end

a) It is a perfect square
b) It is a power of two

def is_power_of_four(num)
   return false if num<1
    
    n = Math.sqrt(num)
    return false unless n*n == num
    
    return num&(num-1) == 0 ? true : false
end

keep dividing the number by 4, i.e, do n = n/4 iteratively. In any iteration, if n%4 becomes non-zero and n is not 1 then n is not a power of 4, otherwise, n is a power of 4. 