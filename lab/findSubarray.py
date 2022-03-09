def find_sub_array():
    """Find a sub_array with the maximum length which its sum is equal to this given number"""
    s = input_string()
    num = input_num()
    num_list = con_list(s)
    sub_list = find(num, num_list)


def find(sum_num, num_list):
    """Find a sub_array with the maximum length"""
    i=0
    j=0
    addition=0
    len_list=len(num_list)
    while i<len_list:
        j=i
        while j<len_list:
            addition+=num_list[j]
            if addition is sum_num:

        i+=1
    return 0


def con_list(s):
    """Converting the string to the list of integer"""
    s_list = s.split(",")
    num = []
    for i in s_list:
        num.append(int(i))
    return num


def input_num():
    """Input the sum number"""
    num = int(input("Input the sum number: "))
    return num


def input_string():
    """Input the string of array"""
    s = input("Input the string of array: ")
    return s


find_sub_array()
