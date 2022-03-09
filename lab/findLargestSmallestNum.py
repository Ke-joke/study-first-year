def find_num():
    """Input the string of array"""
    s = str(input("Input the string of array: "))
    s_list = s.split(",")
    num_list = con_string(s_list)
    find_max(num_list)
    find_min(num_list)


def find_min(num):
    """Find the min value in the array"""
    digit = num[0]
    for i in num:
        if i < digit:
            digit = i
    print("Min = ",digit)


def find_max(num):
    """Find the max value in the array"""
    digit = num[0]
    for i in num:
        if i > digit:
            digit = i
    print("Max = ",digit)


def con_string(s):
    """Convert the string to the list of integer"""
    num_list = []
    for i in s:
        num_list.append(int(i))
    return num_list


find_num()