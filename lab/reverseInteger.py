def reverse():
    """Input the string of 32-bit number."""
    num = str(input("Input integer number: "))
    check = check_integer(num)
    if check is True:
        print(reverse_int(num))
    else:
        print(0)


def check_integer(digit):
    """Check the number whether is 32-bit number."""
    if -pow(2, 31) <= int(digit) <= (pow(2, 31) - 1):
        return True
    else:
        return False


def reverse_int(digit):
    """Reverse the string of 32-bit number."""
    num = 0
    plus_minus = ""
    reverse_num = ""
    # while True:
    #    if int(digit) < 0:
    #        num = -int(digit)
    #        digit = str(num)
    #        plus_minus = "-"
    #    reverse_num = plus_minus + digit[-1:-1]
    #    return reverse_num
    # Another way of reverse number
    if int(digit) == 0:
        return 0
    if int(digit) < 0:
        x = -int(digit)
        num = x
        plus_minus = "-"
        for i in str(num):
            reverse_num = i + reverse_num
    if int(digit) > 0:
        for i in digit:
            reverse_num = i + reverse_num
    reverse_num = plus_minus + reverse_num
    return reverse_num


reverse()
