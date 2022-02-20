def is_power_of_two(n)
    x = 2
    i = 0
    return true if n == 1
    
    while x << i <= n
        return true if x << i == n
        i = i + 1
    end
    
    return false
end


def is_power_of_two(n)
    return false if n<1
    n && ((n&(n-1)) == 0 ? true : false)
end