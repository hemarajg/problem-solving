digital root(The digital root (also repeated digital sum) of a natural number in a given radix is the (single digit) value obtained by an iterative process of summing digits, on each iteration using the result from the previous iteration to compute a digit sum. The process continues until a single-digit number is reached)



def add_digits(num)
    return 0 if num == 0
    num%9 == 0 ? 9 : num%9
end